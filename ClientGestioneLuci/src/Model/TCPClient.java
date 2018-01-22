/*
 * Copyright 2018 Stella Filippo.
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
package Model;

import View.MainFrame;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stella Filippo
 * @version 0.01
 */
public class TCPClient extends Thread {

    private final MainFrame mf;
    private final ByteBuffer sendBuffer,receiveBuffer;
    private final String ADDRESS;
    private final Integer PORT;

    public TCPClient(MainFrame mf, ByteBuffer sendBuffer, String ADDRESS, Integer PORT) {
        super("Client");
        this.mf = mf;
        this.sendBuffer = sendBuffer;
        this.receiveBuffer = ByteBuffer.allocate(16);
        this.ADDRESS = ADDRESS;
        this.PORT = PORT;
    }
    
    @Override
    public void run() {
        try {
            Socket s = new Socket(ADDRESS, PORT);
            DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());
            DataInputStream dataIn = new DataInputStream(s.getInputStream());
            this.sendBuffer.flip();
            dataOut.write(this.sendBuffer.array());
            dataOut.flush();
            System.out.println("sent");
            sleep(128);
            byte ris[] = new byte[16];
            dataIn.read(ris);
            this.receiveBuffer.put(ris);
            this.receiveBuffer.compact();
            dataIn.close();
            dataOut.close();
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mf.getjButtonApplica().setEnabled(true);
        }
    }
   
}
