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
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Stella Filippo
 */
public class ListenerSlider implements ChangeListener {

    private final MainFrame mf;

    public ListenerSlider(MainFrame mf) {
        this.mf = mf;
        this.mf.addListenerSlider(this);
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider slider = null;
        JLabel label = null;
        if(e.getSource()==this.mf.getjSliderSerra1()){
            slider = this.mf.getjSliderSerra1();
            label = this.mf.getjLabelSerra1();
        }
        else if(e.getSource()==this.mf.getjSliderSerra2()){
            slider = this.mf.getjSliderSerra2();
            label = this.mf.getjLabelSerra2();
        }
        else if(e.getSource()==this.mf.getjSliderSerra3()){
            slider = this.mf.getjSliderSerra3();
            label = this.mf.getjLabelSerra3();
        }
        else if(e.getSource()==this.mf.getjSliderSerra4()){
            slider = this.mf.getjSliderSerra4();
            label = this.mf.getjLabelSerra4();
        }
        else if(e.getSource()==this.mf.getjSliderSerra5()){
            slider = this.mf.getjSliderSerra5();
            label = this.mf.getjLabelSerra5();
        }
        else if(e.getSource()==this.mf.getjSliderSerra6()){
            slider = this.mf.getjSliderSerra6();
            label = this.mf.getjLabelSerra6();
        }
        else if(e.getSource()==this.mf.getjSliderSerra7()){
            slider = this.mf.getjSliderSerra7();
            label = this.mf.getjLabelSerra7();
        }  
        else if(e.getSource()==this.mf.getjSliderSerra8()){
            slider = this.mf.getjSliderSerra8();
            label = this.mf.getjLabelSerra8();
        }
        
        if(slider!=null && label!=null){
            label.setBackground(new Color(255, 255, 0, slider.getValue()));
        }
        
    }
    
}
