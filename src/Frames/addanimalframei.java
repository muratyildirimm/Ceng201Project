package Frames;

import Classes.*;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinTask;
import javax.swing.ImageIcon;

public class addanimalframei extends javax.swing.JFrame {

    public addanimalframei() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bullradiobtn = new javax.swing.JRadioButton();
        cowradiobtn = new javax.swing.JRadioButton();
        calfradiobtn = new javax.swing.JRadioButton();
        addbuton = new javax.swing.JButton();
        denemelabeli = new javax.swing.JLabel();
        clearbuton = new javax.swing.JButton();
        returnbuton = new javax.swing.JButton();
        giflabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Source = new javax.swing.JComboBox<>();
        idtf = new javax.swing.JTextField();
        fathercombobox = new javax.swing.JComboBox<>();
        mothercombobox = new javax.swing.JComboBox<>();
        breedtf = new javax.swing.JTextField();
        birthdatetf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        vaccinecombo = new javax.swing.JComboBox<>();
        weighttf = new javax.swing.JTextField();
        healthstatecombo = new javax.swing.JComboBox<>();
        locationtf = new javax.swing.JTextField();
        vetcombobox = new javax.swing.JComboBox<>();
        farmercombobox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(770, 517));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(770, 517));

        bullradiobtn.setText("Bull");
        bullradiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bullradiobtnActionPerformed(evt);
            }
        });

        cowradiobtn.setText("Cow");
        cowradiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cowradiobtnActionPerformed(evt);
            }
        });

        calfradiobtn.setText("Calf");
        calfradiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calfradiobtnActionPerformed(evt);
            }
        });

        addbuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        addbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addimage.jpg"))); // NOI18N
        addbuton.setText("ADD");
        addbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutonActionPerformed(evt);
            }
        });

        clearbuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        clearbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clearimage.jpg"))); // NOI18N
        clearbuton.setText("CLEAR");
        clearbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbutonActionPerformed(evt);
            }
        });

        returnbuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        returnbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homepage.jpg"))); // NOI18N
        returnbuton.setText("RETURN TO HOMEPAGE");
        returnbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbutonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel12.setText("Source");

        jLabel1.setText("ID");

        jLabel2.setText("Father");

        jLabel3.setText("Mother");

        jLabel4.setText("Breed");

        jLabel5.setText("Birth Date");

        Source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Bought", "Born" }));
        Source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceActionPerformed(evt);
            }
        });

        fathercombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fathercomboboxActionPerformed(evt);
            }
        });

        jLabel13.setText("Vaccine");

        jLabel7.setText("Weight");

        jLabel8.setText("Health State");

        jLabel9.setText("Location In Farm");

        jLabel10.setText("Vet");

        jLabel11.setText("Farmer");

        vaccinecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Vaccinated", "Unvaccinated" }));

        healthstatecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Unhealthy", "Healthy" }));
        healthstatecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthstatecomboActionPerformed(evt);
            }
        });

        vetcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetcomboboxActionPerformed(evt);
            }
        });

        farmercombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmercomboboxActionPerformed(evt);
            }
        });

        jLabel6.setText("yyyy-mm-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Source, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mothercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fathercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(breedtf, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(birthdatetf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(farmercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(vetcombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(76, 76, 76)
                        .addComponent(healthstatecombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(100, 100, 100)
                        .addComponent(weighttf))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(vaccinecombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(53, 53, 53)
                        .addComponent(locationtf)))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(vaccinecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(weighttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fathercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(healthstatecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mothercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(locationtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(breedtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(vetcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(birthdatetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(farmercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(calfradiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(cowradiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(bullradiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(giflabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(482, 482, 482)
                        .addComponent(denemelabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(clearbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returnbuton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calfradiobtn)
                    .addComponent(cowradiobtn)
                    .addComponent(bullradiobtn))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(denemelabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbuton)
                    .addComponent(clearbuton)
                    .addComponent(returnbuton))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(giflabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calfradiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calfradiobtnActionPerformed

        cowradiobtn.setSelected(false);
        bullradiobtn.setSelected(false);
        giflabel.setIcon(new ImageIcon("C:\\Users\\90507\\OneDrive\\Belgeler\\NetBeansProjects\\javaapplication1\\src\\gifs\\calf.gif"));

    }//GEN-LAST:event_calfradiobtnActionPerformed

    private void farmercomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmercomboboxActionPerformed


    }//GEN-LAST:event_farmercomboboxActionPerformed

    private void vetcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetcomboboxActionPerformed

    }//GEN-LAST:event_vetcomboboxActionPerformed

    private void addbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutonActionPerformed
        int fatherid = -1;
        int motherid = -1;
        if (Source.getSelectedIndex() == 1) {
            fatherid = 0;
            motherid = 0;
        } else {
            String[] comboxstrarr = new String[2];
            if (fathercombobox.getItemAt(fathercombobox.getSelectedIndex()).equalsIgnoreCase("Unknown")) {
                fatherid = 0;
            } else {
                comboxstrarr = fathercombobox.getItemAt(fathercombobox.getSelectedIndex()).split(" ");
                fatherid = Integer.parseInt(comboxstrarr[0]);
            }

            comboxstrarr = mothercombobox.getItemAt(mothercombobox.getSelectedIndex()).split("  ");
            motherid = Integer.parseInt(comboxstrarr[0]);

        }
        if (calfradiobtn.isSelected()) {
            Calf tempcalf = new Calf(Integer.parseInt(idtf.getText()), fatherid, motherid, breedtf.getText(), birthdatetf.getText(), vaccinecombo.getSelectedItem().toString(), Integer.parseInt(weighttf.getText()), healthstatecombo.getSelectedItem().toString(), farmercombobox.getSelectedItem().toString(), vetcombobox.getSelectedItem().toString(), locationtf.getText());
            SystemClass.addAnimal(tempcalf);
        } else if (cowradiobtn.isSelected()) {
            Cow temp = new Cow(Integer.parseInt(idtf.getText()), fatherid, motherid, breedtf.getText(), birthdatetf.getText(), vaccinecombo.getSelectedItem().toString(), Integer.parseInt(weighttf.getText()), healthstatecombo.getSelectedItem().toString(), farmercombobox.getSelectedItem().toString(), vetcombobox.getSelectedItem().toString(), locationtf.getText());
            SystemClass.addAnimal(temp);
        } else if (bullradiobtn.isSelected()) {
            Bull temp = new Bull(Integer.parseInt(idtf.getText()), fatherid, motherid, breedtf.getText(), birthdatetf.getText(), vaccinecombo.getSelectedItem().toString(), Integer.parseInt(weighttf.getText()), healthstatecombo.getSelectedItem().toString(), farmercombobox.getSelectedItem().toString(), vetcombobox.getSelectedItem().toString(), locationtf.getText());
            SystemClass.addAnimal(temp);
        } else {
            denemelabeli.setText("olmadi");
        }
    }//GEN-LAST:event_addbutonActionPerformed

    private void cowradiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cowradiobtnActionPerformed

        calfradiobtn.setSelected(false);
        bullradiobtn.setSelected(false);
        giflabel.setIcon(new ImageIcon("C:\\Users\\90507\\OneDrive\\Belgeler\\NetBeansProjects\\javaapplication1\\src\\gifs\\cow.gif"));


    }//GEN-LAST:event_cowradiobtnActionPerformed

    private void bullradiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bullradiobtnActionPerformed

        cowradiobtn.setSelected(false);
        calfradiobtn.setSelected(false);
        giflabel.setIcon(new ImageIcon("C:\\Users\\90507\\OneDrive\\Belgeler\\NetBeansProjects\\Ceng201Project\\src\\gifs\\bull .gif"));


    }//GEN-LAST:event_bullradiobtnActionPerformed

    private void SourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceActionPerformed
        vetcombobox.removeAllItems();
        farmercombobox.removeAllItems();
        mothercombobox.removeAllItems();
        fathercombobox.removeAllItems();
        ArrayList<String> temparrlvetnames = new ArrayList<String>();
        temparrlvetnames = SystemClass.vetSender();
        for (int i = 0; i < temparrlvetnames.size(); i++) {
            vetcombobox.addItem(temparrlvetnames.get(i));
        }
        ArrayList<String> temparrlfarmernames = new ArrayList<String>();
        temparrlfarmernames = SystemClass.farmerSender();
        for (String a : temparrlfarmernames) {
            farmercombobox.addItem(a);
        }
        if (Source.getSelectedIndex() == 1) {
            idtf.setText("" + (SystemClass.ID + SystemClass.arrlistan.size()));
            fathercombobox.addItem("Unknown");
            fathercombobox.setSelectedIndex(0);
            mothercombobox.addItem("Unknown");
            mothercombobox.setSelectedIndex(0);
        } else if (Source.getSelectedIndex() == 2) {
            idtf.setText("" + (SystemClass.ID + SystemClass.arrlistan.size()));
            ArrayList<String> temparrSTR = new ArrayList<String>();
            temparrSTR = SystemClass.bullcomboxsend();
            int d = 0;
            for (int i = 0; i < SystemClass.bullcomboxsend().size(); i++) {
                fathercombobox.addItem(temparrSTR.get(i));
                d++;
            }
            temparrSTR = SystemClass.cowcomboxsend();

            for (Animal c : SystemClass.arrlistan) {

                if (c.getClass() == Bull.class) {
                    d++;
                }
                System.out.println(d);
                if (d == 0) {
                    fathercombobox.addItem("Unknown");
                    System.out.println("added unknown");
                    fathercombobox.setSelectedIndex(0);
                }

            }
            for (int i = 0; i < SystemClass.cowcomboxsend().size(); i++) {
                mothercombobox.addItem(temparrSTR.get(i));
            }
        } else {

        }
    }//GEN-LAST:event_SourceActionPerformed

    private void fathercomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fathercomboboxActionPerformed
    }//GEN-LAST:event_fathercomboboxActionPerformed

    private void returnbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbutonActionPerformed

        generaladdframe f1 = new generaladdframe();
        f1.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_returnbutonActionPerformed

    private void healthstatecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthstatecomboActionPerformed
    }//GEN-LAST:event_healthstatecomboActionPerformed

    private void clearbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbutonActionPerformed
        // TODO add your handling code here:

        idtf.setText("");
        breedtf.setText("");
        birthdatetf.setText("");
        weighttf.setText("");
        locationtf.setText("");

        vaccinecombo.setSelectedIndex(0);
        Source.setSelectedIndex(0);

        vetcombobox.setSelectedIndex(0);
        farmercombobox.setSelectedIndex(0);

    }//GEN-LAST:event_clearbutonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addanimalframei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addanimalframei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addanimalframei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addanimalframei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addanimalframei().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Source;
    private javax.swing.JButton addbuton;
    private javax.swing.JTextField birthdatetf;
    private javax.swing.JTextField breedtf;
    private javax.swing.JRadioButton bullradiobtn;
    private javax.swing.JRadioButton calfradiobtn;
    private javax.swing.JButton clearbuton;
    private javax.swing.JRadioButton cowradiobtn;
    public static javax.swing.JLabel denemelabeli;
    private javax.swing.JComboBox<String> farmercombobox;
    private javax.swing.JComboBox<String> fathercombobox;
    private javax.swing.JLabel giflabel;
    private javax.swing.JComboBox<String> healthstatecombo;
    private javax.swing.JTextField idtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField locationtf;
    private javax.swing.JComboBox<String> mothercombobox;
    private javax.swing.JButton returnbuton;
    private javax.swing.JComboBox<String> vaccinecombo;
    private javax.swing.JComboBox<String> vetcombobox;
    private javax.swing.JTextField weighttf;
    // End of variables declaration//GEN-END:variables
}
