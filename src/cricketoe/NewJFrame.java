/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketoe;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Saksham
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        but_bat_1 = new javax.swing.JButton();
        but_bat_2 = new javax.swing.JButton();
        but_bat_3 = new javax.swing.JButton();
        but_bat_4 = new javax.swing.JButton();
        but_bat_5 = new javax.swing.JButton();
        but_bat_6 = new javax.swing.JButton();
        but_bowl_1 = new javax.swing.JButton();
        but_bowl_2 = new javax.swing.JButton();
        but_bowl_3 = new javax.swing.JButton();
        but_bowl_4 = new javax.swing.JButton();
        but_bowl_5 = new javax.swing.JButton();
        but_bowl_6 = new javax.swing.JButton();
        lab_bat_runs = new javax.swing.JLabel();
        lab_bat_wkts = new javax.swing.JLabel();
        lab_bat_YN = new javax.swing.JLabel();
        lab_bat_ON = new javax.swing.JLabel();
        lab_bowl_runs = new javax.swing.JLabel();
        lab_bowl_wkts = new javax.swing.JLabel();
        lab_bowl_YN = new javax.swing.JLabel();
        lab_bowl_ON = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("AR DARLING", 0, 30)); // NOI18N
        jLabel1.setText("CRICKET 2015");
        jLabel1.setToolTipText("");

        jLabel2.setText("BATTING :");

        jLabel3.setText("BOWLING :");

        jLabel4.setText("Runs Scored :");

        jLabel5.setText("Wickets Left :");

        jLabel6.setText("Runs Scored :");

        jLabel7.setText("Wickets Left :");

        jLabel8.setText("Your Number");

        jLabel9.setText("Opponent's Number");

        jLabel10.setText("Opponent's Number");

        jLabel11.setText("Your Number");

        but_bat_1.setText("1");
        but_bat_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bat_1ActionPerformed(evt);
            }
        });

        but_bat_2.setText("2");
        but_bat_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bat_2ActionPerformed(evt);
            }
        });

        but_bat_3.setText("3");
        but_bat_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bat_3ActionPerformed(evt);
            }
        });

        but_bat_4.setText("4");
        but_bat_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bat_4ActionPerformed(evt);
            }
        });

        but_bat_5.setText("5");
        but_bat_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bat_5ActionPerformed(evt);
            }
        });

        but_bat_6.setText("6");
        but_bat_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bat_6ActionPerformed(evt);
            }
        });

        but_bowl_1.setText("1");
        but_bowl_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bowl_1ActionPerformed(evt);
            }
        });

        but_bowl_2.setText("2");
        but_bowl_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bowl_2ActionPerformed(evt);
            }
        });

        but_bowl_3.setText("3");
        but_bowl_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bowl_3ActionPerformed(evt);
            }
        });

        but_bowl_4.setText("4");
        but_bowl_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bowl_4ActionPerformed(evt);
            }
        });

        but_bowl_5.setText("5");
        but_bowl_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bowl_5ActionPerformed(evt);
            }
        });

        but_bowl_6.setText("6");
        but_bowl_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_bowl_6ActionPerformed(evt);
            }
        });

        lab_bat_runs.setText("0");

        lab_bat_wkts.setText("2");

        lab_bowl_runs.setText("0");

        lab_bowl_wkts.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab_bat_runs)
                            .addComponent(lab_bat_wkts))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab_bowl_runs)
                            .addComponent(lab_bowl_wkts))))
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(218, 218, 218)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but_bat_4)
                        .addGap(18, 18, 18)
                        .addComponent(but_bat_5)
                        .addGap(18, 18, 18)
                        .addComponent(but_bat_6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lab_bat_YN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but_bat_1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(but_bat_2)
                                .addGap(18, 18, 18)
                                .addComponent(but_bat_3))
                            .addComponent(lab_bat_ON, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but_bowl_4)
                        .addGap(18, 18, 18)
                        .addComponent(but_bowl_5)
                        .addGap(18, 18, 18)
                        .addComponent(but_bowl_6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(but_bowl_1)
                            .addComponent(lab_bowl_ON, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(but_bowl_2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab_bowl_YN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but_bowl_3))))
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lab_bat_runs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lab_bat_wkts)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lab_bowl_runs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lab_bowl_wkts))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_bat_YN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lab_bat_ON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lab_bowl_YN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lab_bowl_ON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but_bat_1)
                            .addComponent(but_bat_2)
                            .addComponent(but_bat_3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but_bat_4)
                            .addComponent(but_bat_5)
                            .addComponent(but_bat_6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but_bowl_1)
                            .addComponent(but_bowl_2)
                            .addComponent(but_bowl_3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but_bowl_4)
                            .addComponent(but_bowl_5)
                            .addComponent(but_bowl_6))))
                .addGap(175, 175, 175))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_bat_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bat_1ActionPerformed
        int on;
        lab_bat_YN.setText("1");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bat_ON.setText(String.valueOf(on));
        if(Integer.parseInt(lab_bat_wkts.getText())==0)
        {
            JOptionPane.showMessageDialog(this, "You have no wickets left.");
        }
        else
        {
            if(on==1)
            {
                lab_bat_wkts.setText(String.valueOf(Integer.parseInt(lab_bat_wkts.getText())-1));
                if(Integer.parseInt(lab_bat_wkts.getText())==0)
                {
                    JOptionPane.showMessageDialog(this, "You are all out.\nYour score is :" + lab_bat_runs.getText());
                }
            }
            else
            {
                lab_bat_runs.setText(String.valueOf(Integer.parseInt(lab_bat_runs.getText())+1));
            }
        }
        
    }//GEN-LAST:event_but_bat_1ActionPerformed

    private void but_bat_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bat_2ActionPerformed
        int on;
        lab_bat_YN.setText("2");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bat_ON.setText(String.valueOf(on));
        if(Integer.parseInt(lab_bat_wkts.getText())==0)
        {
            JOptionPane.showMessageDialog(this, "You have no wickets left.");
        }
        else
        {
            if(on==2)
            {
                lab_bat_wkts.setText(String.valueOf(Integer.parseInt(lab_bat_wkts.getText())-1));
                if(Integer.parseInt(lab_bat_wkts.getText())==0)
                {
                    JOptionPane.showMessageDialog(this, "You are all out.\nYour score is :" + lab_bat_runs.getText());
                }
            }
            else
            {
                lab_bat_runs.setText(String.valueOf(Integer.parseInt(lab_bat_runs.getText())+2));
            }
        }
    }//GEN-LAST:event_but_bat_2ActionPerformed

    private void but_bat_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bat_3ActionPerformed
        int on;
        lab_bat_YN.setText("3");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bat_ON.setText(String.valueOf(on));
        if(Integer.parseInt(lab_bat_wkts.getText())==0)
        {
            JOptionPane.showMessageDialog(this, "You have no wickets left.");
        }
        else
        {
            if(on==3)
            {
                lab_bat_wkts.setText(String.valueOf(Integer.parseInt(lab_bat_wkts.getText())-1));
                if(Integer.parseInt(lab_bat_wkts.getText())==0)
                {
                    JOptionPane.showMessageDialog(this, "You are all out.\nYour score is :" + lab_bat_runs.getText());
                }
            }
            else
            {
                lab_bat_runs.setText(String.valueOf(Integer.parseInt(lab_bat_runs.getText())+3));
            }
        }
    }//GEN-LAST:event_but_bat_3ActionPerformed

    private void but_bat_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bat_4ActionPerformed
        int on;
        lab_bat_YN.setText("4");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bat_ON.setText(String.valueOf(on));
        if(Integer.parseInt(lab_bat_wkts.getText())==0)
        {
            JOptionPane.showMessageDialog(this, "You have no wickets left.");
        }
        else
        {
            if(on==4)
            {
                lab_bat_wkts.setText(String.valueOf(Integer.parseInt(lab_bat_wkts.getText())-1));
                if(Integer.parseInt(lab_bat_wkts.getText())==0)
                {
                    JOptionPane.showMessageDialog(this, "You are all out.\nYour score is :" + lab_bat_runs.getText());
                }
            }
            else
            {
                lab_bat_runs.setText(String.valueOf(Integer.parseInt(lab_bat_runs.getText())+4));
            }
        }
    }//GEN-LAST:event_but_bat_4ActionPerformed

    private void but_bat_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bat_5ActionPerformed
        int on;
        lab_bat_YN.setText("5");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bat_ON.setText(String.valueOf(on));
        if(Integer.parseInt(lab_bat_wkts.getText())==0)
        {
            JOptionPane.showMessageDialog(this, "You have no wickets left.");
        }
        else
        {
            if(on==5)
            {
                lab_bat_wkts.setText(String.valueOf(Integer.parseInt(lab_bat_wkts.getText())-1));
                if(Integer.parseInt(lab_bat_wkts.getText())==0)
                {
                    JOptionPane.showMessageDialog(this, "You are all out.\nYour score is :" + lab_bat_runs.getText());
                }
            }
            else
            {
                lab_bat_runs.setText(String.valueOf(Integer.parseInt(lab_bat_runs.getText())+5));
            }
        }
    }//GEN-LAST:event_but_bat_5ActionPerformed

    private void but_bat_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bat_6ActionPerformed
        int on;
        lab_bat_YN.setText("6");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bat_ON.setText(String.valueOf(on));
        if(Integer.parseInt(lab_bat_wkts.getText())==0)
        {
            JOptionPane.showMessageDialog(this, "You have no wickets left.");
        }
        else
        {
            if(on==6)
            {
                lab_bat_wkts.setText(String.valueOf(Integer.parseInt(lab_bat_wkts.getText())-1));
                if(Integer.parseInt(lab_bat_wkts.getText())==0)
                {
                    JOptionPane.showMessageDialog(this, "You are all out.\nYour score is :" + lab_bat_runs.getText());
                }
            }
            else
            {
                lab_bat_runs.setText(String.valueOf(Integer.parseInt(lab_bat_runs.getText())+6));
            }
        }
    }//GEN-LAST:event_but_bat_6ActionPerformed

    private void but_bowl_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bowl_1ActionPerformed
        if(Integer.parseInt(lab_bat_wkts.getText())!=0)
        {
            JOptionPane.showMessageDialog(this, "Complete your batting first");
        }
        else
        {
        int on;
        lab_bowl_YN.setText("1");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bowl_ON.setText(String.valueOf(on));
            if(on==1)
            {
                lab_bowl_wkts.setText(String.valueOf(Integer.parseInt(lab_bowl_wkts.getText())-1));
                if(Integer.parseInt(lab_bowl_wkts.getText())==0)
                {
                    if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())==0)
                    {
                        JOptionPane.showMessageDialog(this, "Match drawn");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Your opponent is all out.\nYou won the game by " + String.valueOf(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())) + " runs");
                    }
                }
            }
            else
            {
                lab_bowl_runs.setText(String.valueOf(Integer.parseInt(lab_bowl_runs.getText())+Integer.parseInt(lab_bowl_ON.getText())));
                if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
                {
                    JOptionPane.showMessageDialog(this, "Opponent won the match");
                }
            }
        }
        if(Integer.parseInt(lab_bowl_wkts.getText())==0 || Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
        {
            lab_bat_ON.setText(null);
            lab_bat_YN.setText(null);
            lab_bat_runs.setText("0");
            lab_bat_wkts.setText("2");
            lab_bowl_ON.setText(null);
            lab_bowl_YN.setText(null);
            lab_bowl_runs.setText("0");
            lab_bowl_wkts.setText("2");
        }
    }//GEN-LAST:event_but_bowl_1ActionPerformed

    private void but_bowl_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bowl_2ActionPerformed
        if(Integer.parseInt(lab_bat_wkts.getText())!=0)
        {
            JOptionPane.showMessageDialog(this, "Complete your batting first");
        }
        else
        {
        int on;
        lab_bowl_YN.setText("2");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bowl_ON.setText(String.valueOf(on));
            if(on==2)
            {
                lab_bowl_wkts.setText(String.valueOf(Integer.parseInt(lab_bowl_wkts.getText())-1));
                if(Integer.parseInt(lab_bowl_wkts.getText())==0)
                {
                    if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())==0)
                    {
                        JOptionPane.showMessageDialog(this, "Match drawn");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Your opponent is all out.\nYou won the game by " + String.valueOf(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())) + " runs");
                    }
                }
            }
            else
            {
                lab_bowl_runs.setText(String.valueOf(Integer.parseInt(lab_bowl_runs.getText())+Integer.parseInt(lab_bowl_ON.getText())));
                if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
                {
                    JOptionPane.showMessageDialog(this, "Opponent won the match");
                }
            }
        }
        if(Integer.parseInt(lab_bowl_wkts.getText())==0 || Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
        {
            lab_bat_ON.setText(null);
            lab_bat_YN.setText(null);
            lab_bat_runs.setText("0");
            lab_bat_wkts.setText("2");
            lab_bowl_ON.setText(null);
            lab_bowl_YN.setText(null);
            lab_bowl_runs.setText("0");
            lab_bowl_wkts.setText("2");
        }
    }//GEN-LAST:event_but_bowl_2ActionPerformed

    private void but_bowl_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bowl_3ActionPerformed
        if(Integer.parseInt(lab_bat_wkts.getText())!=0)
        {
            JOptionPane.showMessageDialog(this, "Complete your batting first");
        }
        else
        {
        int on;
        lab_bowl_YN.setText("3");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bowl_ON.setText(String.valueOf(on));
            if(on==3)
            {
                lab_bowl_wkts.setText(String.valueOf(Integer.parseInt(lab_bowl_wkts.getText())-1));
                if(Integer.parseInt(lab_bowl_wkts.getText())==0)
                {
                    if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())==0)
                    {
                        JOptionPane.showMessageDialog(this, "Match drawn");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Your opponent is all out.\nYou won the game by " + String.valueOf(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())) + " runs");
                    }
                }
            }
            else
            {
                lab_bowl_runs.setText(String.valueOf(Integer.parseInt(lab_bowl_runs.getText())+Integer.parseInt(lab_bowl_ON.getText())));
                if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
                {
                    JOptionPane.showMessageDialog(this, "Opponent won the match");
                }
            }
        }
        if(Integer.parseInt(lab_bowl_wkts.getText())==0 || Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
        {
            lab_bat_ON.setText(null);
            lab_bat_YN.setText(null);
            lab_bat_runs.setText("0");
            lab_bat_wkts.setText("2");
            lab_bowl_ON.setText(null);
            lab_bowl_YN.setText(null);
            lab_bowl_runs.setText("0");
            lab_bowl_wkts.setText("2");
        }
    }//GEN-LAST:event_but_bowl_3ActionPerformed

    private void but_bowl_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bowl_4ActionPerformed
        if(Integer.parseInt(lab_bat_wkts.getText())!=0)
        {
            JOptionPane.showMessageDialog(this, "Complete your batting first");
        }
        else
        {
        int on;
        lab_bowl_YN.setText("4");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bowl_ON.setText(String.valueOf(on));
            if(on==4)
            {
                lab_bowl_wkts.setText(String.valueOf(Integer.parseInt(lab_bowl_wkts.getText())-1));
                if(Integer.parseInt(lab_bowl_wkts.getText())==0)
                {
                    if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())==0)
                    {
                        JOptionPane.showMessageDialog(this, "Match drawn");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Your opponent is all out.\nYou won the game by " + String.valueOf(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())) + " runs");
                    }
                }
            }
            else
            {
                lab_bowl_runs.setText(String.valueOf(Integer.parseInt(lab_bowl_runs.getText())+Integer.parseInt(lab_bowl_ON.getText())));
                if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
                {
                    JOptionPane.showMessageDialog(this, "Opponent won the match");
                }
            }
        }
        if(Integer.parseInt(lab_bowl_wkts.getText())==0 || Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
        {
            lab_bat_ON.setText(null);
            lab_bat_YN.setText(null);
            lab_bat_runs.setText("0");
            lab_bat_wkts.setText("2");
            lab_bowl_ON.setText(null);
            lab_bowl_YN.setText(null);
            lab_bowl_runs.setText("0");
            lab_bowl_wkts.setText("2");
        }
    }//GEN-LAST:event_but_bowl_4ActionPerformed

    private void but_bowl_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bowl_5ActionPerformed
        if(Integer.parseInt(lab_bat_wkts.getText())!=0)
        {
            JOptionPane.showMessageDialog(this, "Complete your batting first");
        }
        else
        {
        int on;
        lab_bowl_YN.setText("5");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bowl_ON.setText(String.valueOf(on));
            if(on==5)
            {
                lab_bowl_wkts.setText(String.valueOf(Integer.parseInt(lab_bowl_wkts.getText())-1));
                if(Integer.parseInt(lab_bowl_wkts.getText())==0)
                {
                    if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())==0)
                    {
                        JOptionPane.showMessageDialog(this, "Match drawn");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Your opponent is all out.\nYou won the game by " + String.valueOf(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())) + " runs");
                    }
                }
            }
            else
            {
                lab_bowl_runs.setText(String.valueOf(Integer.parseInt(lab_bowl_runs.getText())+Integer.parseInt(lab_bowl_ON.getText())));
                if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
                {
                    JOptionPane.showMessageDialog(this, "Opponent won the match");
                }
            }
        }
        if(Integer.parseInt(lab_bowl_wkts.getText())==0 || Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
        {
            lab_bat_ON.setText(null);
            lab_bat_YN.setText(null);
            lab_bat_runs.setText("0");
            lab_bat_wkts.setText("2");
            lab_bowl_ON.setText(null);
            lab_bowl_YN.setText(null);
            lab_bowl_runs.setText("0");
            lab_bowl_wkts.setText("2");
        }
    }//GEN-LAST:event_but_bowl_5ActionPerformed

    private void but_bowl_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_bowl_6ActionPerformed
        if(Integer.parseInt(lab_bat_wkts.getText())!=0)
        {
            JOptionPane.showMessageDialog(this, "Complete your batting first");
        }
        else
        {
        int on;
        lab_bowl_YN.setText("6");
        Random rn= new Random();
        on=rn.nextInt(6)+1;
        lab_bowl_ON.setText(String.valueOf(on));
            if(on==6)
            {
                lab_bowl_wkts.setText(String.valueOf(Integer.parseInt(lab_bowl_wkts.getText())-1));
                if(Integer.parseInt(lab_bowl_wkts.getText())==0)
                {
                    if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())==0)
                    {
                        JOptionPane.showMessageDialog(this, "Match drawn");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Your opponent is all out.\nYou won the game by " + String.valueOf(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())) + " runs");
                    }
                }
            }
            else
            {
                lab_bowl_runs.setText(String.valueOf(Integer.parseInt(lab_bowl_runs.getText())+Integer.parseInt(lab_bowl_ON.getText())));
                if(Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
                {
                    JOptionPane.showMessageDialog(this, "Opponent won the match");
                }
            }
        }
        if(Integer.parseInt(lab_bowl_wkts.getText())==0 || Integer.parseInt(lab_bat_runs.getText())-Integer.parseInt(lab_bowl_runs.getText())<0)
        {
            lab_bat_ON.setText(null);
            lab_bat_YN.setText(null);
            lab_bat_runs.setText("0");
            lab_bat_wkts.setText("2");
            lab_bowl_ON.setText(null);
            lab_bowl_YN.setText(null);
            lab_bowl_runs.setText("0");
            lab_bowl_wkts.setText("2");
        }
    }//GEN-LAST:event_but_bowl_6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_bat_1;
    private javax.swing.JButton but_bat_2;
    private javax.swing.JButton but_bat_3;
    private javax.swing.JButton but_bat_4;
    private javax.swing.JButton but_bat_5;
    private javax.swing.JButton but_bat_6;
    private javax.swing.JButton but_bowl_1;
    private javax.swing.JButton but_bowl_2;
    private javax.swing.JButton but_bowl_3;
    private javax.swing.JButton but_bowl_4;
    private javax.swing.JButton but_bowl_5;
    private javax.swing.JButton but_bowl_6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lab_bat_ON;
    private javax.swing.JLabel lab_bat_YN;
    private javax.swing.JLabel lab_bat_runs;
    private javax.swing.JLabel lab_bat_wkts;
    private javax.swing.JLabel lab_bowl_ON;
    private javax.swing.JLabel lab_bowl_YN;
    private javax.swing.JLabel lab_bowl_runs;
    private javax.swing.JLabel lab_bowl_wkts;
    // End of variables declaration//GEN-END:variables
}
