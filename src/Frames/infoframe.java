package Frames;

import Classes.*;
import java.util.ArrayList;

public class infoframe extends javax.swing.JFrame {

    public infoframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        generalfarminfobtn = new javax.swing.JButton();
        vetinfobtn = new javax.swing.JButton();
        farmerinfobtn = new javax.swing.JButton();
        animalinfobtn = new javax.swing.JButton();
        healthinfobtn = new javax.swing.JButton();
        returntohomebtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        enteridtf = new javax.swing.JTextField();
        enteridtf1 = new javax.swing.JTextField();
        searchbuton = new javax.swing.JButton();
        removebuton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFORMATION");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(992, 529));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("    FARM INFORMATION");

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        generalfarminfobtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        generalfarminfobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoimage.jpg"))); // NOI18N
        generalfarminfobtn.setText("GENERAL FARM INFORMATION");
        generalfarminfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalfarminfobtnActionPerformed(evt);
            }
        });

        vetinfobtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        vetinfobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoimage.jpg"))); // NOI18N
        vetinfobtn.setText("VET INFORMATION");
        vetinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetinfobtnActionPerformed(evt);
            }
        });

        farmerinfobtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        farmerinfobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoimage.jpg"))); // NOI18N
        farmerinfobtn.setText("FARMER INFORMATION");
        farmerinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmerinfobtnActionPerformed(evt);
            }
        });

        animalinfobtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        animalinfobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoimage.jpg"))); // NOI18N
        animalinfobtn.setText("ANIMAL INFORMATION");
        animalinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalinfobtnActionPerformed(evt);
            }
        });

        healthinfobtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        healthinfobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/healthimage.jpg"))); // NOI18N
        healthinfobtn.setText("HEALTH INFORMATION");
        healthinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthinfobtnActionPerformed(evt);
            }
        });

        returntohomebtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        returntohomebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homepage.jpg"))); // NOI18N
        returntohomebtn.setText("RETURN TO HOMEPAGE");
        returntohomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returntohomebtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Farmer Vacation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        clearbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clearimage.jpg"))); // NOI18N
        clearbtn.setText("CLEAR");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cow Menstrual Cycle Day Editor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generalfarminfobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vetinfobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(farmerinfobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(animalinfobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(healthinfobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returntohomebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(generalfarminfobtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vetinfobtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(farmerinfobtn)
                .addGap(18, 18, 18)
                .addComponent(animalinfobtn)
                .addGap(18, 18, 18)
                .addComponent(healthinfobtn)
                .addGap(18, 18, 18)
                .addComponent(returntohomebtn)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearbtn)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel13.setText("Enter ID");

        jLabel14.setText("Enter ID");

        searchbuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        searchbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchimage.jpg"))); // NOI18N
        searchbuton.setText("SEARCH AN ANIMAL(ID)");
        searchbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbutonActionPerformed(evt);
            }
        });

        removebuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        removebuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removeimage.jpg"))); // NOI18N
        removebuton.setText("REMOVE AN ANIMAL(ID)");
        removebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(enteridtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removebuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(enteridtf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enteridtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbuton))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enteridtf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removebuton))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        ta.setBackground(new java.awt.Color(204, 255, 255));
        ta.setColumns(20);
        ta.setRows(5);
        ta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addGap(426, 426, 426))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vetinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetinfobtnActionPerformed

        ta.append("Total Vet Numbers: " + SystemClass.getTotal_vetcount() + "\n");
        ta.append("----------------------------------------\n");
        for (int i = 0; i < SystemClass.arrlistvet.size(); i++) {
            ta.append(SystemClass.arrlistvet.get(i).toString() + "\n");
        }

    }//GEN-LAST:event_vetinfobtnActionPerformed

    private void farmerinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmerinfobtnActionPerformed
        ta.append("Total Farmer Numbers: " + SystemClass.getTotal_farmercount() + "\n");
        ta.append("----------------------------------------\n");
        for (int i = 0; i < SystemClass.arrlistfarmer.size(); i++) {
            ta.append(SystemClass.status(SystemClass.arrlistfarmer.get(i)) + "\n");
            ta.append(SystemClass.arrlistfarmer.get(i).toString() + "\n");

        }

    }//GEN-LAST:event_farmerinfobtnActionPerformed

    private void animalinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalinfobtnActionPerformed

        ta.append("Total Animal Numbers: " + SystemClass.getTotal_animalcount() + "\n");
        ta.append("----------------------------------------\n");
        for (int i = 0; i < SystemClass.arrlistan.size(); i++) {
            ta.append(SystemClass.arrlistan.get(i).toString() + "\n");
        }

    }//GEN-LAST:event_animalinfobtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed

        ta.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void healthinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthinfobtnActionPerformed

        healthframe a1 = new healthframe();
        this.setVisible(false);
        a1.setVisible(true);
    }//GEN-LAST:event_healthinfobtnActionPerformed

    private void taMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taMouseClicked
    }//GEN-LAST:event_taMouseClicked

    private void returntohomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returntohomebtnActionPerformed

        generaladdframe a1 = new generaladdframe();
        this.setVisible(false);
        a1.setVisible(true);

    }//GEN-LAST:event_returntohomebtnActionPerformed

    private void generalfarminfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalfarminfobtnActionPerformed

        ta.append("Total Number of Animals: " + SystemClass.arrlistan.size());
        ta.append("\nTotal Number of Vets: " + SystemClass.arrlistvet.size());
        ta.append("\nTotal Number of Farmers: " + SystemClass.arrlistfarmer.size());
        ta.append("\n----------------------------------------\n");


    }//GEN-LAST:event_generalfarminfobtnActionPerformed

    private void searchbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbutonActionPerformed

        String s = SystemClass.searchAnimal(Integer.parseInt(enteridtf.getText()));
        if (s == null) {
            ta.setText("Animal doesn't exist.");
        } else {
            ta.setText(s);
        }

    }//GEN-LAST:event_searchbutonActionPerformed

    private void removebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebutonActionPerformed
        if (SystemClass.removeAnimal(Integer.parseInt(enteridtf1.getText()))) {
            ta.setText("Animal removed successfully.");
        } else {
            ta.setText("Animal couldn't remove.");
        }
    }//GEN-LAST:event_removebutonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        vacationframe a1 = new vacationframe();
        this.setVisible(false);
        a1.setVisible(true);
        System.out.println(SystemClass.arrlistfarmer.size());
        for (int i = 0; i < SystemClass.arrlistfarmer.size(); i++) {
            a1.farmertogo.addItem(SystemClass.arrlistfarmer.get(i).name);
        }
        a1.ta.append("Total Farmer Numbers: " + SystemClass.getTotal_farmercount() + "\n");
        a1.ta.append("----------------------------------------\n");
        for (int i = 0; i < SystemClass.arrlistfarmer.size(); i++) {
            a1.ta.append(SystemClass.status(SystemClass.arrlistfarmer.get(i)) + "\n");
            a1.ta.append(SystemClass.arrlistfarmer.get(i).toString() + "\n");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menstrualcycle a = new menstrualcycle();
        a.setVisible(true);
        String b = "";
        b += "The estrous cycle of the cow\nis generally about 21 days long,\nbut it can range from 17 to 24 days in duration\n------------------------------------------\n";

        for (Animal c : SystemClass.arrlistan) {
            if (c.getClass() == Cow.class) {
                b += c.toString() + "\n";
            }
        }
        a.jTextArea1.setText(b);
        ArrayList<String> temparrSTR = new ArrayList<String>();
        temparrSTR = SystemClass.cowcomboxsend();
        for (int i = 0; i < SystemClass.cowcomboxsend().size(); i++) {
            a.jComboBox1.addItem(temparrSTR.get(i));
        }
        this.setVisible(false);

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
            java.util.logging.Logger.getLogger(infoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton animalinfobtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField enteridtf;
    private javax.swing.JTextField enteridtf1;
    private javax.swing.JButton farmerinfobtn;
    private javax.swing.JButton generalfarminfobtn;
    private javax.swing.JButton healthinfobtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removebuton;
    private javax.swing.JButton returntohomebtn;
    private javax.swing.JButton searchbuton;
    private javax.swing.JTextArea ta;
    private javax.swing.JButton vetinfobtn;
    // End of variables declaration//GEN-END:variables
}
