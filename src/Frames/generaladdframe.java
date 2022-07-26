package Frames;

import Classes.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class generaladdframe extends javax.swing.JFrame {

    private static DataOutputStream dataoutput;

    public generaladdframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addanimalbuton = new javax.swing.JButton();
        addfarmerbuton = new javax.swing.JButton();
        addvetbuton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Dayskipperbutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        ta.setBackground(new java.awt.Color(204, 255, 255));
        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FARM");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(1016, 520));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        addanimalbuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        addanimalbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addimage.jpg"))); // NOI18N
        addanimalbuton.setText("ADD ANIMAL");
        addanimalbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addanimalbutonActionPerformed(evt);
            }
        });

        addfarmerbuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        addfarmerbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addimage.jpg"))); // NOI18N
        addfarmerbuton.setText("ADD FARMER");
        addfarmerbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfarmerbutonActionPerformed(evt);
            }
        });

        addvetbuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        addvetbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addimage.jpg"))); // NOI18N
        addvetbuton.setText("ADD VET");
        addvetbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvetbutonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("               ADD");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addfarmerbuton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addvetbuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addanimalbuton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addanimalbuton)
                .addGap(28, 28, 28)
                .addComponent(addfarmerbuton)
                .addGap(27, 27, 27)
                .addComponent(addvetbuton)
                .addGap(36, 36, 36))
        );

        jScrollPane2.setBackground(new java.awt.Color(153, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        Dayskipperbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Dayskipperbutton.setText("DAY SKIPPER");
        Dayskipperbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayskipperbuttonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("GET DATA FROM FILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setText("WRITE DATA TO FILE");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("DATA OPERATIONS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addGap(27, 27, 27))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoimage.jpg"))); // NOI18N
        jButton2.setText("GENERAL FARM INFORMATION ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Dayskipperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(Dayskipperbutton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        infoframe a1 = new infoframe();
        this.setVisible(false);
        a1.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        try {
            dataoutput = new DataOutputStream(new FileOutputStream("animalout.txt"));
            dataoutput.writeInt(SystemClass.arrlistan.size());
            for (int i = 0; i < SystemClass.arrlistan.size(); i++) {
                if (SystemClass.arrlistan.get(i).getClass() == Calf.class) {
                    dataoutput.writeUTF("calf");
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).id);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).father_id);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).mother_id);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).breed);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).birthdate);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).weight);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).healthState);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).locationfarm);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).farmer);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).vet);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).vaccine);
                } else if (SystemClass.arrlistan.get(i).getClass() == Cow.class) {
                    dataoutput.writeUTF("cow");
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).id);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).father_id);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).mother_id);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).breed);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).birthdate);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).weight);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).healthState);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).locationfarm);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).farmer);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).vet);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).vaccine);
                } else if (SystemClass.arrlistan.get(i).getClass() == Bull.class) {
                    dataoutput.writeUTF("bull");
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).id);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).father_id);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).mother_id);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).breed);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).birthdate);
                    dataoutput.writeInt(SystemClass.arrlistan.get(i).weight);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).healthState);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).locationfarm);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).farmer);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).vet);
                    dataoutput.writeUTF(SystemClass.arrlistan.get(i).vaccine);
                }
            }

            dataoutput = new DataOutputStream(new FileOutputStream("Humans.txt"));

            dataoutput.writeInt(SystemClass.arrlistfarmer.size());
            for (int i = 0; i < SystemClass.arrlistfarmer.size(); i++) {
                dataoutput.writeInt(SystemClass.arrlistfarmer.get(i).workingyear);
                dataoutput.writeInt(SystemClass.arrlistfarmer.get(i).age);
                dataoutput.writeUTF(SystemClass.arrlistfarmer.get(i).name);
                dataoutput.writeInt(SystemClass.arrlistfarmer.get(i).ids.size());

                for (int x = 0; x < SystemClass.arrlistfarmer.get(i).ids.size(); x++) {

                    dataoutput.writeInt(SystemClass.arrlistfarmer.get(i).ids.get(x));
                }
                dataoutput.writeInt(SystemClass.arrlistfarmer.get(i).daysgone);
            }

            dataoutput.writeInt(SystemClass.arrlistvet.size());
            for (int i = 0; i < SystemClass.arrlistvet.size(); i++) {
                dataoutput.writeInt(SystemClass.arrlistvet.get(i).age);
                dataoutput.writeUTF(SystemClass.arrlistvet.get(i).name);
                dataoutput.writeUTF(SystemClass.arrlistvet.get(i).graduateduni);
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File f = new File("animalout.txt");
        try {
            FileInputStream fin = new FileInputStream(f);
            DataInputStream dout = new DataInputStream(fin);
            int x = dout.readInt();
            for (int i = 0; i < x; i++) {

                String type = dout.readUTF();

                if (type.matches("calf")) {

                    int id = dout.readInt();
                    int father_id = dout.readInt();
                    int mother_id = dout.readInt();
                    String breed = dout.readUTF();
                    String birthdate = dout.readUTF();
                    int weight = dout.readInt();
                    String healthState = dout.readUTF();
                    String locationfarm = dout.readUTF();
                    String farmer = dout.readUTF();
                    String vet = dout.readUTF();
                    String vaccine = dout.readUTF();
                    Calf tempcalf = new Calf(id, father_id, mother_id, breed, birthdate, vaccine, weight, healthState, farmer, vet, locationfarm);
                    SystemClass.addAnimal(tempcalf);

                } else if (type.matches("cow")) {

                    int id = dout.readInt();
                    int father_id = dout.readInt();
                    int mother_id = dout.readInt();
                    String breed = dout.readUTF();
                    String birthdate = dout.readUTF();
                    int weight = dout.readInt();
                    String healthState = dout.readUTF();
                    String locationfarm = dout.readUTF();
                    String farmer = dout.readUTF();
                    String vet = dout.readUTF();
                    String vaccine = dout.readUTF();
                    Cow tempcow = new Cow(id, father_id, mother_id, breed, birthdate, vaccine, weight, healthState, farmer, vet, locationfarm);
                    SystemClass.addAnimal(tempcow);

                } else if (type.matches("bull")) {

                    int id = dout.readInt();
                    int father_id = dout.readInt();
                    int mother_id = dout.readInt();
                    String breed = dout.readUTF();
                    String birthdate = dout.readUTF();
                    int weight = dout.readInt();
                    String healthState = dout.readUTF();
                    String locationfarm = dout.readUTF();
                    String farmer = dout.readUTF();
                    String vet = dout.readUTF();
                    String vaccine = dout.readUTF();
                    Bull tempbull = new Bull(id, father_id, mother_id, breed, birthdate, vaccine, weight, healthState, farmer, vet, locationfarm);
                    SystemClass.addAnimal(tempbull);
                }

            }
            File f2 = new File("Humans.txt");
            FileInputStream fin2 = new FileInputStream(f2);
            DataInputStream dout2 = new DataInputStream(fin2);

            int a = dout2.readInt();
            for (int y = 0; y < a; y++) {
                int b = dout2.readInt();
                int c = dout2.readInt();
                String d = dout2.readUTF();
                int idcount = dout2.readInt();

                ArrayList<Integer> arrlint = new ArrayList<Integer>();
                for (int e = 0; e < idcount; e++) {

                    arrlint.add(dout2.readInt());

                }
                int e = dout2.readInt();
                SystemClass.addFarmer(new Farmer(b, c, d, arrlint, e));
            }

            a = dout2.readInt();
            for (int y = 0; y < a; y++) {
                SystemClass.addVet(new Vet(dout2.readInt(), dout2.readUTF(), dout2.readUTF()));
            }
            fin.close();
            dout.close();
        } catch (Exception e) {
            System.out.println("Read operation problem.");
        }

        jTextArea1.setText(SystemClass.todayinfowriter());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addvetbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvetbutonActionPerformed

        addvetframei f1 = new addvetframei();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addvetbutonActionPerformed

    private void addfarmerbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfarmerbutonActionPerformed

        addfarmerframei f1 = new addfarmerframei();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_addfarmerbutonActionPerformed

    private void addanimalbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addanimalbutonActionPerformed

        if (SystemClass.arrlistfarmer.size() == 0 || SystemClass.arrlistvet.size() == 0) {
            label.setText("ENTER AT LEAT ONE FARMER AND ONE VET");

        } else {
            this.setVisible(false);
            addanimalframei a1 = new addanimalframei();
            a1.setVisible(true);
        }
    }//GEN-LAST:event_addanimalbutonActionPerformed

    private void DayskipperbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayskipperbuttonActionPerformed
        SystemClass.daysskipped++;
        SystemClass.datemodifier();
        for (Animal a : SystemClass.arrlistan) {
            a.dayskipper();
            if (a.getClass() == Cow.class) {
                if (((Cow) a).daysuntilmenstrualcycle > 0) {
                    ((Cow) a).daysuntilmenstrualcycle--;
                }
            }
        }
        jTextArea1.setText(SystemClass.todayinfowriter());
    }//GEN-LAST:event_DayskipperbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(generaladdframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generaladdframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generaladdframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generaladdframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generaladdframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dayskipperbutton;
    private javax.swing.JButton addanimalbuton;
    private javax.swing.JButton addfarmerbuton;
    private javax.swing.JButton addvetbuton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel label;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
