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
package View;

import java.awt.event.ActionListener;
import java.nio.ByteBuffer;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Stella Filippo
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        super("SerraClient");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelGestione = new javax.swing.JLabel();
        jCheckBoxSerra1 = new javax.swing.JCheckBox();
        jCheckBoxSerra2 = new javax.swing.JCheckBox();
        jCheckBoxSerra3 = new javax.swing.JCheckBox();
        jCheckBoxSerra4 = new javax.swing.JCheckBox();
        jCheckBoxSerra5 = new javax.swing.JCheckBox();
        jCheckBoxSerra6 = new javax.swing.JCheckBox();
        jCheckBoxSerra7 = new javax.swing.JCheckBox();
        jCheckBoxSerra8 = new javax.swing.JCheckBox();
        jSliderSerra1 = new javax.swing.JSlider();
        jSliderSerra2 = new javax.swing.JSlider();
        jSliderSerra3 = new javax.swing.JSlider();
        jSliderSerra4 = new javax.swing.JSlider();
        jSliderSerra5 = new javax.swing.JSlider();
        jSliderSerra6 = new javax.swing.JSlider();
        jSliderSerra7 = new javax.swing.JSlider();
        jSliderSerra8 = new javax.swing.JSlider();
        jLabelSerra1 = new javax.swing.JLabel();
        jLabelSerra2 = new javax.swing.JLabel();
        jLabelSerra3 = new javax.swing.JLabel();
        jLabelSerra4 = new javax.swing.JLabel();
        jLabelSerra5 = new javax.swing.JLabel();
        jLabelSerra6 = new javax.swing.JLabel();
        jLabelSerra7 = new javax.swing.JLabel();
        jLabelSerra8 = new javax.swing.JLabel();
        jLabelIndirizzoIP = new javax.swing.JLabel();
        jLabelPorta = new javax.swing.JLabel();
        jTextFieldIndirizzoIP = new javax.swing.JTextField();
        jTextFieldPorta = new javax.swing.JTextField();
        jButtonApplica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(77, 77, 77));

        LabelGestione.setForeground(new java.awt.Color(204, 204, 204));
        LabelGestione.setText("Gestione Serre");

        jCheckBoxSerra1.setBackground(new java.awt.Color(77, 77, 77));
        jCheckBoxSerra1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxSerra1.setText("Serra 1");

        jCheckBoxSerra2.setBackground(new java.awt.Color(77, 77, 77));
        jCheckBoxSerra2.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxSerra2.setText("Serra 2");

        jCheckBoxSerra3.setBackground(new java.awt.Color(77, 77, 77));
        jCheckBoxSerra3.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxSerra3.setText("Serra 3");

        jCheckBoxSerra4.setBackground(new java.awt.Color(77, 77, 77));
        jCheckBoxSerra4.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxSerra4.setText("Serra 4");

        jCheckBoxSerra5.setBackground(new java.awt.Color(77, 77, 77));
        jCheckBoxSerra5.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxSerra5.setText("Serra 5");

        jCheckBoxSerra6.setBackground(new java.awt.Color(77, 77, 77));
        jCheckBoxSerra6.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxSerra6.setText("Serra 6");

        jCheckBoxSerra7.setBackground(new java.awt.Color(77, 77, 77));
        jCheckBoxSerra7.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxSerra7.setText("Serra 7");

        jCheckBoxSerra8.setBackground(new java.awt.Color(77, 77, 77));
        jCheckBoxSerra8.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxSerra8.setText("Serra 8");

        jSliderSerra1.setBackground(new java.awt.Color(77, 77, 77));
        jSliderSerra1.setForeground(new java.awt.Color(204, 204, 204));
        jSliderSerra1.setMajorTickSpacing(15);
        jSliderSerra1.setMaximum(255);
        jSliderSerra1.setMinorTickSpacing(5);
        jSliderSerra1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSerra1.setPaintLabels(true);
        jSliderSerra1.setPaintTicks(true);
        jSliderSerra1.setToolTipText("");
        jSliderSerra1.setValue(0);
        jSliderSerra1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderSerra1.setEnabled(false);

        jSliderSerra2.setBackground(new java.awt.Color(77, 77, 77));
        jSliderSerra2.setForeground(new java.awt.Color(204, 204, 204));
        jSliderSerra2.setMajorTickSpacing(15);
        jSliderSerra2.setMaximum(255);
        jSliderSerra2.setMinorTickSpacing(5);
        jSliderSerra2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSerra2.setPaintLabels(true);
        jSliderSerra2.setPaintTicks(true);
        jSliderSerra2.setToolTipText("");
        jSliderSerra2.setValue(0);
        jSliderSerra2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderSerra2.setEnabled(false);

        jSliderSerra3.setBackground(new java.awt.Color(77, 77, 77));
        jSliderSerra3.setForeground(new java.awt.Color(204, 204, 204));
        jSliderSerra3.setMajorTickSpacing(15);
        jSliderSerra3.setMaximum(255);
        jSliderSerra3.setMinorTickSpacing(5);
        jSliderSerra3.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSerra3.setPaintLabels(true);
        jSliderSerra3.setPaintTicks(true);
        jSliderSerra3.setToolTipText("");
        jSliderSerra3.setValue(0);
        jSliderSerra3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderSerra3.setEnabled(false);

        jSliderSerra4.setBackground(new java.awt.Color(77, 77, 77));
        jSliderSerra4.setForeground(new java.awt.Color(204, 204, 204));
        jSliderSerra4.setMajorTickSpacing(15);
        jSliderSerra4.setMaximum(255);
        jSliderSerra4.setMinorTickSpacing(5);
        jSliderSerra4.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSerra4.setPaintLabels(true);
        jSliderSerra4.setPaintTicks(true);
        jSliderSerra4.setToolTipText("");
        jSliderSerra4.setValue(0);
        jSliderSerra4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderSerra4.setEnabled(false);

        jSliderSerra5.setBackground(new java.awt.Color(77, 77, 77));
        jSliderSerra5.setForeground(new java.awt.Color(204, 204, 204));
        jSliderSerra5.setMajorTickSpacing(15);
        jSliderSerra5.setMaximum(255);
        jSliderSerra5.setMinorTickSpacing(5);
        jSliderSerra5.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSerra5.setPaintLabels(true);
        jSliderSerra5.setPaintTicks(true);
        jSliderSerra5.setToolTipText("");
        jSliderSerra5.setValue(0);
        jSliderSerra5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderSerra5.setEnabled(false);

        jSliderSerra6.setBackground(new java.awt.Color(77, 77, 77));
        jSliderSerra6.setForeground(new java.awt.Color(204, 204, 204));
        jSliderSerra6.setMajorTickSpacing(15);
        jSliderSerra6.setMaximum(255);
        jSliderSerra6.setMinorTickSpacing(5);
        jSliderSerra6.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSerra6.setPaintLabels(true);
        jSliderSerra6.setPaintTicks(true);
        jSliderSerra6.setToolTipText("");
        jSliderSerra6.setValue(0);
        jSliderSerra6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderSerra6.setEnabled(false);

        jSliderSerra7.setBackground(new java.awt.Color(77, 77, 77));
        jSliderSerra7.setForeground(new java.awt.Color(204, 204, 204));
        jSliderSerra7.setMajorTickSpacing(15);
        jSliderSerra7.setMaximum(255);
        jSliderSerra7.setMinorTickSpacing(5);
        jSliderSerra7.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSerra7.setPaintLabels(true);
        jSliderSerra7.setPaintTicks(true);
        jSliderSerra7.setToolTipText("");
        jSliderSerra7.setValue(0);
        jSliderSerra7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderSerra7.setEnabled(false);

        jSliderSerra8.setBackground(new java.awt.Color(77, 77, 77));
        jSliderSerra8.setForeground(new java.awt.Color(204, 204, 204));
        jSliderSerra8.setMajorTickSpacing(15);
        jSliderSerra8.setMaximum(255);
        jSliderSerra8.setMinorTickSpacing(5);
        jSliderSerra8.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSerra8.setPaintLabels(true);
        jSliderSerra8.setPaintTicks(true);
        jSliderSerra8.setToolTipText("");
        jSliderSerra8.setValue(0);
        jSliderSerra8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderSerra8.setEnabled(false);

        jLabelSerra1.setBackground(new java.awt.Color(77, 77, 77));

        jLabelSerra2.setBackground(new java.awt.Color(77, 77, 77));

        jLabelSerra3.setBackground(new java.awt.Color(77, 77, 77));

        jLabelSerra4.setBackground(new java.awt.Color(77, 77, 77));

        jLabelSerra5.setBackground(new java.awt.Color(77, 77, 77));

        jLabelSerra6.setBackground(new java.awt.Color(77, 77, 77));

        jLabelSerra7.setBackground(new java.awt.Color(77, 77, 77));

        jLabelSerra8.setBackground(new java.awt.Color(77, 77, 77));

        jLabelIndirizzoIP.setBackground(new java.awt.Color(77, 77, 77));
        jLabelIndirizzoIP.setForeground(new java.awt.Color(204, 204, 204));
        jLabelIndirizzoIP.setText("Indirizzo IP");

        jLabelPorta.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPorta.setText("Porta");

        jTextFieldIndirizzoIP.setBackground(new java.awt.Color(77, 77, 77));
        jTextFieldIndirizzoIP.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldIndirizzoIP.setCaretColor(new java.awt.Color(204, 204, 204));

        jTextFieldPorta.setBackground(new java.awt.Color(77, 77, 77));
        jTextFieldPorta.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldPorta.setCaretColor(new java.awt.Color(204, 204, 204));

        jButtonApplica.setBackground(new java.awt.Color(0, 153, 204));
        jButtonApplica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApplica.setText("Applica");
        jButtonApplica.setBorder(null);
        jButtonApplica.setBorderPainted(false);
        jButtonApplica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonApplica.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelGestione)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelSerra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBoxSerra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderSerra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBoxSerra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderSerra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSerra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBoxSerra3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderSerra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSerra3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabelPorta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIndirizzoIP)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldIndirizzoIP)
                                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBoxSerra4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSliderSerra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSerra4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBoxSerra5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSliderSerra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSerra5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSliderSerra6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxSerra6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSerra6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSerra7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderSerra7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxSerra7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSliderSerra8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelSerra8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBoxSerra8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonApplica, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelGestione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSerra1)
                    .addComponent(jCheckBoxSerra2)
                    .addComponent(jCheckBoxSerra3)
                    .addComponent(jCheckBoxSerra4)
                    .addComponent(jCheckBoxSerra5)
                    .addComponent(jCheckBoxSerra6)
                    .addComponent(jCheckBoxSerra7)
                    .addComponent(jCheckBoxSerra8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSliderSerra4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jSliderSerra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderSerra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderSerra3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderSerra5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderSerra6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderSerra7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderSerra8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSerra1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSerra2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSerra3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSerra4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSerra5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSerra6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSerra7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSerra8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIndirizzoIP)
                    .addComponent(jTextFieldIndirizzoIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPorta)
                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApplica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void addListenerCheck(ActionListener al){
        this.jCheckBoxSerra1.addActionListener(al);
        this.jCheckBoxSerra2.addActionListener(al);
        this.jCheckBoxSerra3.addActionListener(al);
        this.jCheckBoxSerra4.addActionListener(al);
        this.jCheckBoxSerra5.addActionListener(al);
        this.jCheckBoxSerra6.addActionListener(al);
        this.jCheckBoxSerra7.addActionListener(al);
        this.jCheckBoxSerra8.addActionListener(al);
    }
    
    public void addListenerSlider(ChangeListener cl){
        this.jSliderSerra1.addChangeListener(cl);
        this.jSliderSerra2.addChangeListener(cl);
        this.jSliderSerra3.addChangeListener(cl);
        this.jSliderSerra4.addChangeListener(cl);        
        this.jSliderSerra5.addChangeListener(cl);
        this.jSliderSerra6.addChangeListener(cl);
        this.jSliderSerra7.addChangeListener(cl);
        this.jSliderSerra8.addChangeListener(cl);
    }
    
    public void addListenerBottone(ActionListener al){
        this.jButtonApplica.addActionListener(al);
    }
    
    public ByteBuffer getByteBuffer(){
        ByteBuffer ris = ByteBuffer.allocate(1024);
        ris.putShort(new Short(""+this.jSliderSerra1.getValue()));
        ris.putShort(new Short(""+this.jSliderSerra2.getValue()));
        ris.putShort(new Short(""+this.jSliderSerra3.getValue()));
        ris.putShort(new Short(""+this.jSliderSerra4.getValue()));
        ris.putShort(new Short(""+this.jSliderSerra5.getValue()));
        ris.putShort(new Short(""+this.jSliderSerra6.getValue()));
        ris.putShort(new Short(""+this.jSliderSerra7.getValue()));
        ris.putShort(new Short(""+this.jSliderSerra8.getValue()));
        ris.compact();
        return ris;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelGestione;
    private javax.swing.JButton jButtonApplica;
    private javax.swing.JCheckBox jCheckBoxSerra1;
    private javax.swing.JCheckBox jCheckBoxSerra2;
    private javax.swing.JCheckBox jCheckBoxSerra3;
    private javax.swing.JCheckBox jCheckBoxSerra4;
    private javax.swing.JCheckBox jCheckBoxSerra5;
    private javax.swing.JCheckBox jCheckBoxSerra6;
    private javax.swing.JCheckBox jCheckBoxSerra7;
    private javax.swing.JCheckBox jCheckBoxSerra8;
    private javax.swing.JLabel jLabelIndirizzoIP;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSerra1;
    private javax.swing.JLabel jLabelSerra2;
    private javax.swing.JLabel jLabelSerra3;
    private javax.swing.JLabel jLabelSerra4;
    private javax.swing.JLabel jLabelSerra5;
    private javax.swing.JLabel jLabelSerra6;
    private javax.swing.JLabel jLabelSerra7;
    private javax.swing.JLabel jLabelSerra8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSliderSerra1;
    private javax.swing.JSlider jSliderSerra2;
    private javax.swing.JSlider jSliderSerra3;
    private javax.swing.JSlider jSliderSerra4;
    private javax.swing.JSlider jSliderSerra5;
    private javax.swing.JSlider jSliderSerra6;
    private javax.swing.JSlider jSliderSerra7;
    private javax.swing.JSlider jSliderSerra8;
    private javax.swing.JTextField jTextFieldIndirizzoIP;
    private javax.swing.JTextField jTextFieldPorta;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonApplica() {
        return jButtonApplica;
    }
    public JCheckBox getjCheckBoxSerra1() {
        return jCheckBoxSerra1;
    }
    public JCheckBox getjCheckBoxSerra2() {
        return jCheckBoxSerra2;
    }
    public JCheckBox getjCheckBoxSerra3() {
        return jCheckBoxSerra3;
    }
    public JCheckBox getjCheckBoxSerra4() {
        return jCheckBoxSerra4;
    }
    public JCheckBox getjCheckBoxSerra5() {
        return jCheckBoxSerra5;
    }
    public JCheckBox getjCheckBoxSerra6() {
        return jCheckBoxSerra6;
    }
    public JCheckBox getjCheckBoxSerra7() {
        return jCheckBoxSerra7;
    }
    public JCheckBox getjCheckBoxSerra8() {
        return jCheckBoxSerra8;
    }
    public JLabel getjLabelSerra1() {
        return jLabelSerra1;
    }
    public JLabel getjLabelSerra2() {
        return jLabelSerra2;
    }
    public JLabel getjLabelSerra3() {
        return jLabelSerra3;
    }
    public JLabel getjLabelSerra4() {
        return jLabelSerra4;
    }
    public JLabel getjLabelSerra5() {
        return jLabelSerra5;
    }
    public JLabel getjLabelSerra6() {
        return jLabelSerra6;
    }
    public JLabel getjLabelSerra7() {
        return jLabelSerra7;
    }
    public JLabel getjLabelSerra8() {
        return jLabelSerra8;
    }
    public JSlider getjSliderSerra1() {
        return jSliderSerra1;
    }
    public JSlider getjSliderSerra2() {
        return jSliderSerra2;
    }
    public JSlider getjSliderSerra3() {
        return jSliderSerra3;
    }
    public JSlider getjSliderSerra4() {
        return jSliderSerra4;
    }
    public JSlider getjSliderSerra5() {
        return jSliderSerra5;
    }
    public JSlider getjSliderSerra6() {
        return jSliderSerra6;
    }
    public JSlider getjSliderSerra7() {
        return jSliderSerra7;
    }
    public JSlider getjSliderSerra8() {
        return jSliderSerra8;
    }
    public JTextField getjTextFieldIndirizzoIP() {
        return jTextFieldIndirizzoIP;
    }
    public JTextField getjTextFieldPorta() {
        return jTextFieldPorta;
    }

}