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

import View.MainFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JSlider;

/**
 *
 * @author Stella Filippo
 * @version 0.01
 */
public class ListenerCheckBox implements ActionListener {

    private final MainFrame mf;

    public ListenerCheckBox(MainFrame mf) {
        this.mf = mf;
        this.mf.addListenerCheck(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JCheckBox cBox=null;
        JSlider slider=null;
        JLabel label=null;
        if(e.getSource()==this.mf.getjCheckBoxSerra1()){
            cBox = this.mf.getjCheckBoxSerra1();
            slider = this.mf.getjSliderSerra1();
            label = this.mf.getjLabelSerra1();
        }
        else if(e.getSource()==this.mf.getjCheckBoxSerra2()){
            cBox = this.mf.getjCheckBoxSerra2();
            slider = this.mf.getjSliderSerra2();
            label = this.mf.getjLabelSerra2();
        }
        else if(e.getSource()==this.mf.getjCheckBoxSerra3()){
            cBox = this.mf.getjCheckBoxSerra3();
            slider = this.mf.getjSliderSerra3();
            label = this.mf.getjLabelSerra3();
        }
        else if(e.getSource()==this.mf.getjCheckBoxSerra4()){
            cBox = this.mf.getjCheckBoxSerra4();
            slider = this.mf.getjSliderSerra4();
            label = this.mf.getjLabelSerra4();
        }
        else if(e.getSource()==this.mf.getjCheckBoxSerra5()){
            cBox = this.mf.getjCheckBoxSerra5();
            slider = this.mf.getjSliderSerra5();
            label = this.mf.getjLabelSerra5();
        }
        else if(e.getSource()==this.mf.getjCheckBoxSerra6()){
            cBox = this.mf.getjCheckBoxSerra6();
            slider = this.mf.getjSliderSerra6();
            label = this.mf.getjLabelSerra6();
        }
        else if(e.getSource()==this.mf.getjCheckBoxSerra7()){
            cBox = this.mf.getjCheckBoxSerra7();
            slider = this.mf.getjSliderSerra7();
            label = this.mf.getjLabelSerra7();
        }
        else if(e.getSource()==this.mf.getjCheckBoxSerra8()){
            cBox = this.mf.getjCheckBoxSerra8();
            slider = this.mf.getjSliderSerra8();
            label = this.mf.getjLabelSerra8();
        }
        
        if(cBox!=null && label!=null && slider!=null){
            if(cBox.isSelected()){
                slider.setEnabled(true);
                label.setOpaque(true);
                label.setBackground(new Color(255, 255, 0, slider.getValue()));
            }
            else{
                slider.setEnabled(false);
                label.setOpaque(false);
                label.setBackground(null);
            }
        }
        
    }
    
}
