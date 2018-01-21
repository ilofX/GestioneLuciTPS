/*
 * Copyright 2018 Filippo Stella.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package Model.TCPServer;

import Model.GestioneLocali;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filippo Stella
 * @version 0.01
 */
public class Server extends Thread {
    
    private final Map<SelectionKey,Integer> pendingChanges;
    private final Integer PORT;
    private Selector selector;
    private ServerSocketChannel serverChannel;
    private final Executor EXECUTORS = Executors.newSingleThreadExecutor();
    private final GestioneLocali gestioneLocali;

    public Server(Integer PORT, GestioneLocali gestioneLocali) {
        super("TCP Server");
        this.pendingChanges = new HashMap<>();
        this.PORT = PORT;
        this.gestioneLocali = gestioneLocali;
        try { 
            this.selector = Selector.open();
            this.serverChannel = ServerSocketChannel.open();
            this.serverChannel.configureBlocking(false);
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }
    
    @Override
    public void run() {
        try {
            this.serverChannel.bind(new InetSocketAddress(InetAddress.getLocalHost(), this.PORT));
            this.serverChannel.register(this.selector, SelectionKey.OP_ACCEPT);
            
            while(!this.isInterrupted()){
                
                synchronized(this.pendingChanges){
                    Iterator<SelectionKey> pendingChannels = this.pendingChanges.keySet().iterator();
                    while(pendingChannels.hasNext()){
                        SelectionKey selectonKey = pendingChannels.next();
                        pendingChannels.remove();
                        this.pendingChanges.remove(selectonKey);
                        selectonKey.interestOps(this.pendingChanges.get(selectonKey));
                    }
                }
                
                this.selector.select();
                Iterator<SelectionKey> selectedKeys = this.selector.selectedKeys().iterator();            
                while(selectedKeys.hasNext()){
                    SelectionKey key = selectedKeys.next();
                    selectedKeys.remove();

                    if(!key.isValid()){
                        continue;
                    }

                    if(key.isAcceptable()){
                        this.accept(key);
                    }
                    else if(key.isReadable()){
                        this.read(key);
                    }
                    else if(key.isWritable()){
                        this.write(key);
                    }
                }   
            }
            
            this.selector.close();
            this.serverChannel.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    private void accept (SelectionKey key) throws IOException {
        SocketChannel socketChannel = ((ServerSocketChannel)key.channel()).accept();
        socketChannel.configureBlocking(false);
        socketChannel.register(this.selector, SelectionKey.OP_READ, ByteBuffer.allocate(1024));
    }
    
    private void read (SelectionKey key) throws IOException {
        SocketChannel socketChannel = (SocketChannel) key.channel();
        ByteBuffer receiveBuffer = ByteBuffer.allocate(1024);
        socketChannel.read(receiveBuffer);
        this.EXECUTORS.execute(new HandlePacket(key,receiveBuffer,this.gestioneLocali,this));
    }
    
    private void write (SelectionKey key) throws IOException {
        SocketChannel socketChannel = (SocketChannel) key.channel();
        ByteBuffer writeBuffer = (ByteBuffer) key.attachment();
        socketChannel.write(writeBuffer);
        synchronized(this.pendingChanges){
            this.pendingChanges.put(key, SelectionKey.OP_READ);
        }    
    }
    
    public void send (SelectionKey key, ByteBuffer send) throws IOException {
        ByteBuffer sendBuffer = (ByteBuffer) key.attachment();
        send.flip();
        sendBuffer.put(send);
        sendBuffer.compact();
        synchronized(this.pendingChanges){
            this.pendingChanges.put(key, SelectionKey.OP_WRITE);
        }
    }
    
    public void broadcastSend(ByteBuffer send) throws IOException {
        Iterator<SelectionKey> selectedKeys = this.selector.keys().iterator();
        send.flip();
        ByteBuffer sendBuffer; 
        while(selectedKeys.hasNext()){
            SelectionKey key = selectedKeys.next();
            selectedKeys.remove();
            sendBuffer = (ByteBuffer) key.attachment();
            sendBuffer.put(send);
            sendBuffer.compact();
            synchronized(this.pendingChanges){
                this.pendingChanges.put(key, SelectionKey.OP_WRITE);
            }
        }
    }
    
}
