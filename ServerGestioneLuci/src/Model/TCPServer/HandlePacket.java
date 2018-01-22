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
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filippo Stella
 * @version 0.01
 */
public class HandlePacket extends Thread{
    
    /*
    Buffer Structure:
    0-1 Bytes Serra 1
    2-3 Bytes Serra 2
    4-5 Bytes Serra 3
    6-7 Bytes Serra 4
    8-9 Bytes Serra 5
    10-11 Bytes Serra 6
    12-13 Bytes Serra 7
    14-15 Bytes Serra 8 
    */
    
    private final Socket s;
    private final GestioneLocali gestioneLocali;

    public HandlePacket(Socket s, GestioneLocali gestioneLocali) {
        super("Handle connection");
        this.s = s;
        this.gestioneLocali = gestioneLocali;
    }

    @Override
    public void run() {
        try {
            DataInputStream in = new DataInputStream(this.s.getInputStream());
            DataOutputStream out = new DataOutputStream(this.s.getOutputStream());
            
            byte read[] = new byte[16];
            in.read(read);
            ByteBuffer readBytes = ByteBuffer.wrap(read);
            readBytes.compact();           
            Short ris[] = new Short[8];
            readBytes.flip();
            for(int i=0;i<ris.length;i++){
                ris[i] = readBytes.getShort();
            }
            this.gestioneLocali.editLocali(ris, this);         
            
            out.write(this.gestioneLocali.getLocaliByte().array());
            in.close();
            out.close();
            this.s.close();
        } catch (IOException ex) {
            Logger.getLogger(HandlePacket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
