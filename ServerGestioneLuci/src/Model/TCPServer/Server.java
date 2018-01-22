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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filippo Stella
 * @version 0.01
 */
public class Server extends Thread {
    
    private final Integer PORT;
    private ServerSocket serverSocket;
    private final GestioneLocali gestioneLocali;

    public Server(Integer PORT, GestioneLocali gestioneLocali) {
        super("TCP Server");
        this.PORT = PORT;
        this.gestioneLocali = gestioneLocali;
    }
    
    @Override
    public void run() {
        try {
            this.serverSocket = new ServerSocket(this.PORT);
            
            while(!this.isInterrupted()){
                Socket s = this.serverSocket.accept();
                HandlePacket thread = new HandlePacket(s, this.gestioneLocali);
                thread.start();
            }
            
            this.serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
