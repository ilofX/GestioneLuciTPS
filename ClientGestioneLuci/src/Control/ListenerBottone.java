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

import Model.TCPClient;
import View.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author Stella Filippo
 * @version 0.01
 */
public class ListenerBottone implements ActionListener {

    private final MainFrame mf;
    private final Executor EXECUTOR;

    public ListenerBottone(MainFrame mf) {
        this.mf = mf;
        this.mf.addListenerBottone(this);
        this.EXECUTOR = Executors.newSingleThreadExecutor();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.mf.getjButtonApplica()){
            this.EXECUTOR.execute(new TCPClient(this.mf, this.mf.getByteBuffer(), this.mf.getjTextFieldIndirizzoIP().getText(), Integer.parseInt(this.mf.getjTextFieldPorta().getText())));
        }
    }
    
}
