package Frames;

import Classes.*;
import java.util.Random;

public class healthframe extends javax.swing.JFrame {

    public healthframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        displayunhealthyanm = new javax.swing.JButton();
        displayhealthyanm = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        chanestatebtn = new javax.swing.JButton();
        changetf = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        callthevettf = new javax.swing.JTextField();
        callvetbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HEALTH");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 2));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        displayunhealthyanm.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        displayunhealthyanm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/displayimage.jpg"))); // NOI18N
        displayunhealthyanm.setText("DISPLAY UNHEALTHY ANIMALS");
        displayunhealthyanm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayunhealthyanmActionPerformed(evt);
            }
        });

        displayhealthyanm.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        displayhealthyanm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/displayimage.jpg"))); // NOI18N
        displayhealthyanm.setText("DISPLAY HEALTHY ANIMALS");
        displayhealthyanm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayhealthyanmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayunhealthyanm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayhealthyanm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayunhealthyanm)
                .addGap(18, 18, 18)
                .addComponent(displayhealthyanm)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        chanestatebtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chanestatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changeimage.jpg"))); // NOI18N
        chanestatebtn.setText("CHANGE HEALTH STATE TO UNHEALTHY(ENTER ID)");
        chanestatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chanestatebtnActionPerformed(evt);
            }
        });

        changetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changetfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chanestatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changetf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(changetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chanestatebtn)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        callvetbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        callvetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/callimage.jpg"))); // NOI18N
        callvetbtn.setText("CALL THE VET (ENTER ANIMAL ID)");
        callvetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callvetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(callthevettf)
                    .addComponent(callvetbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(callthevettf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(callvetbtn)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homepage.jpg"))); // NOI18N
        jButton1.setText("RETURN TO HOMEPAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clearimage.jpg"))); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backimage.jpg"))); // NOI18N
        jButton3.setText("RETURN TO INFOPAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ta.setBackground(new java.awt.Color(204, 255, 255));
        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changetfActionPerformed
    }//GEN-LAST:event_changetfActionPerformed

    private void displayunhealthyanmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayunhealthyanmActionPerformed

        String s = "";
        for (Animal a : SystemClass.arrlistan) {
            if (a.healthState.equalsIgnoreCase("Unhealthys")) {
                s += a.toString();
            }
        }
        ta.setText(s);


    }//GEN-LAST:event_displayunhealthyanmActionPerformed

    private void displayhealthyanmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayhealthyanmActionPerformed

        String s = "";
        for (Animal a : SystemClass.arrlistan) {
            if (a.healthState.equalsIgnoreCase("Healthys")) {
                s += a.toString();
            }
        }
        ta.setText(s);

    }//GEN-LAST:event_displayhealthyanmActionPerformed

    private void chanestatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chanestatebtnActionPerformed

        int id = Integer.parseInt(changetf.getText());
        for (int i = 0; i < SystemClass.arrlistan.size(); i++) {
            if (SystemClass.arrlistan.get(i).id == id) {
                SystemClass.arrlistan.get(i).healthState = "Unhealthys";
            }
        }

    }//GEN-LAST:event_chanestatebtnActionPerformed

    private void callvetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callvetbtnActionPerformed

        if (callthevettf.getText().equals("")) {
            ta.setText("Please enter the ID");
        } else {

            for (Animal a : SystemClass.arrlistan) {
                if (a.id == Integer.parseInt(callthevettf.getText())) {
                    ta.setText(a.toString());
                    ta.append("\nYour animal will be sick for 6 days\nchanging its location to quarantine\n");
                    a.unhealtydaycount = 6;
                }
            }

        }

        String diseases[] = {"Bluetongue", "Botulism", "Bovine Tuberculosis", "Bovine Viral Diarrhoea (BVD)", "Schmallenberg Virus", "Foot and Mouth disease", "Johne's disease"};
        Random r = new Random();
        int a = r.nextInt(6);
        if (a == 0) {
            ta.append("\nYour animal has " + diseases[a] + "\n");
            ta.append("Bluetongue is an insect-borne viral disease to which all\n"
                    + "species of ruminants are susceptible,\n"
                    + "although sheep are most severely affected.\n"
                    + " It does not affect humans.");

        } else if (a == 1) {
            ta.append("\nYour animal has " + diseases[a] + "\n");
            ta.append("Botulism is a severe, often fatal form of food poisoning which \n"
                    + "can affect most animals and birds, and occasionally humans.");
        } else if (a == 2) {
            ta.append("\nYour animal has " + diseases[a] + "\n");
            ta.append("Bovine Tuberculosis (TB) is an infectious disease of cattle.\n"
                    + " It is caused by the bacterium Mycobacterium bovis (M. bovis) \n"
                    + "which can also infect and cause disease in many other mammals\n"
                    + " including humans, deer, goats, pigs, cats, dogs and badgers.");
        } else if (a == 3) {
            ta.append("\nYour animal has " + diseases[a] + "\n");
            ta.append("Bovine Viral Diarrhoea (BVD) is a highly contagious disease which \n"
                    + "reduces the productivity and profitability of affected herds,\n"
                    + " as well as compromising animal welfare");
        } else if (a == 4) {
            ta.append("\nYour animal has " + diseases[a] + "\n");
            ta.append("Schmallenberg virus can affect all ruminant species and has \n"
                    + "been particularly evident in cattle and sheep populations.");
        } else if (a == 5) {
            ta.append("\nYour animal has " + diseases[a] + "\n");
            ta.append("Foot-and-mouth disease (FMD) is an acute infectious disease caused\n"
                    + " by a virus of which there are 7 types, which produce similar \n"
                    + "symptoms and can only be differentiated in the laboratory.");
        } else if (a == 6) {
            ta.append("\nYour animal has " + diseases[a] + "\n");
            ta.append("Johne‘s disease is an infectious wasting condition of cattle \n"
                    + "and other ruminants caused by Mycobacterium avium \n"
                    + "subspecies paratuberculosis (commonly known as Map).");
        } else {
            ta.setText("hatali");
        }


    }//GEN-LAST:event_callvetbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        infoframe a1 = new infoframe();
        this.setVisible(false);
        a1.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        generaladdframe a1 = new generaladdframe();
        this.setVisible(false);
        a1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ta.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(healthframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(healthframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(healthframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(healthframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new healthframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField callthevettf;
    private javax.swing.JButton callvetbtn;
    private javax.swing.JButton chanestatebtn;
    private javax.swing.JTextField changetf;
    private javax.swing.JButton displayhealthyanm;
    private javax.swing.JButton displayunhealthyanm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
