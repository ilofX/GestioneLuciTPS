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
package Model;

import Model.TCPServer.HandlePacket;
import java.nio.ByteBuffer;

/**
 *
 * @author Filippo Stella
 * @version 0.01
 */
public class GestioneLocali {
    
    private final Short locali[];

    public GestioneLocali() {
        this.locali = new Short[8];
        for (Short locale : this.locali) {
            locale = new Short("0");
        }
    }
    
    public void editLocali(Short locali[],HandlePacket thread){
        synchronized(this.locali){
            for(int i=0;i<this.locali.length;i++){
                if(locali[i]!=-1){
                    this.locali[i]=locali[i];
                }
            }
            thread.notify();
        }
    }
    
    public Short[] getLocali(){
        Short ris[] = new Short[8];
        synchronized(this.locali){
            System.arraycopy(this.locali, 0, ris, 0, this.locali.length);
        }
        return ris;
    }    
    
    public ByteBuffer getLocaliByte(){
        ByteBuffer ris = ByteBuffer.allocate(1024);
        synchronized(this.locali){
            for(Short locale : this.locali){
                ris.putShort(locale);
            }
        }
        return ris;
    }   
    
    public Short getLocale(Integer index){
        return this.locali[index];
    }
    
}
