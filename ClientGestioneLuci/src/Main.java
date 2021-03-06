
import Control.ListenerBottone;
import Control.ListenerCheckBox;
import Control.ListenerSlider;
import View.MainFrame;

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

/**
 *
 * @author Filippo Stella
 * @version 0.01
 */
public class Main {

    public static void main(String[] args) {
          
            MainFrame mf = new MainFrame();
            ListenerCheckBox lcb = new ListenerCheckBox(mf);
            ListenerSlider sl = new ListenerSlider(mf);
            ListenerBottone lb = new ListenerBottone(mf);
            mf.setVisible(true);
            
       
    }
    
}
