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
package Control;

import Model.GestioneLocali;
import Model.TCPServer.Server;
import View.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Stella Filippo
 * @version 0.01
 */
public class ListenerBottone implements ActionListener{

    private final MainFrame mf;
    private final GestioneLocali gestioneLocali;
    private Server server;
    private final Integer PORT;

    public ListenerBottone(MainFrame mf, GestioneLocali gestioneLocali1, Integer PORT) {
        this.mf = mf;
        this.gestioneLocali = gestioneLocali1;
        this.PORT = PORT;
        this.mf.addListenerBottone(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.mf.getjButton1()){
            this.mf.getjButton1().setEnabled(false);
            if(this.mf.getjButton1().getText().equals("Start")){
                this.server = new Server(this.PORT, this.gestioneLocali);
                this.server.start();
                this.mf.getjProgressBar1().setIndeterminate(true);
                this.mf.getjButton1().setText("Stop");
            }
            else{
                this.server.interrupt();
                this.mf.getjProgressBar1().setIndeterminate(false);
                this.mf.getjButton1().setText("Start");
            }
            this.mf.getjButton1().setEnabled(true);
        }  
    }
    
}
