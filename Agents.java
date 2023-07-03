/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacyJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author kushn
 */
public class Agents extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Agents() {
        initComponents();
        SelectMed();
    }

    Connection Con = null;
Statement St = null,St1=null;
ResultSet Rs = null,Rs1=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Aid = new javax.swing.JTextField();
        Aname = new javax.swing.JTextField();
        Aage = new javax.swing.JTextField();
        Aphone = new javax.swing.JTextField();
        GenderCb = new javax.swing.JComboBox<>();
        Addbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AGENTTABLE = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        Apass = new javax.swing.JTextField();
        Deletebtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("MANAGE AGENTS");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 15, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("ID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("NAME");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("AGE");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("PASSWORD");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("PHONE");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 79, -1, -1));

        Aid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AidActionPerformed(evt);
            }
        });
        jPanel4.add(Aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 76, 170, -1));

        Aname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnameActionPerformed(evt);
            }
        });
        jPanel4.add(Aname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        Aage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Aage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AageActionPerformed(evt);
            }
        });
        jPanel4.add(Aage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, -1));

        Aphone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Aphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AphoneActionPerformed(evt);
            }
        });
        jPanel4.add(Aphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 160, -1));

        GenderCb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GenderCb.setForeground(new java.awt.Color(102, 102, 102));
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        GenderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderCbActionPerformed(evt);
            }
        });
        jPanel4.add(GenderCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 164, -1));

        Addbtn.setBackground(new java.awt.Color(102, 102, 102));
        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("ADD");
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        jPanel4.add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 101, -1));

        Updatebtn.setBackground(new java.awt.Color(102, 102, 102));
        Updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        Updatebtn.setText("UPDATE");
        Updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatebtnMouseClicked(evt);
            }
        });
        jPanel4.add(Updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        Clearbtn.setBackground(new java.awt.Color(102, 102, 102));
        Clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        Clearbtn.setText("CLEAR");
        Clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearbtnMouseClicked(evt);
            }
        });
        jPanel4.add(Clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        AGENTTABLE.setBackground(new java.awt.Color(153, 153, 153));
        AGENTTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "PHONE", "PASSWORD", "GENDER"
            }
        ));
        AGENTTABLE.setRowHeight(25);
        AGENTTABLE.setSelectionBackground(new java.awt.Color(102, 102, 102));
        AGENTTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTTABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AGENTTABLE);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 870, 231));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("AGENTS LIST");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 345, -1, -1));

        Apass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Apass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApassActionPerformed(evt);
            }
        });
        jPanel4.add(Apass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 160, -1));

        Deletebtn.setBackground(new java.awt.Color(102, 102, 102));
        Deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        Deletebtn.setText("DELETE");
        Deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletebtnMouseClicked(evt);
            }
        });
        jPanel4.add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("GENDER");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COMPANY");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGENTS");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MEDICINES");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SELLING");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DASHBOARD");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CATEGORY");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel17))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(472, 472, 472)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(473, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(309, 309, 309)
                    .addComponent(jLabel4)
                    .addContainerGap(310, Short.MAX_VALUE)))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void SelectMed()
{
    try{
Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
St = Con.createStatement();
Rs = St.executeQuery("select * from pharmadb.agenttb");
AGENTTABLE.setModel(DbUtils.resultSetToTableModel(Rs));
}catch(SQLException e){
e.printStackTrace();
}
}
    private void AidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AidActionPerformed

    private void AnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnameActionPerformed

    private void AageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AageActionPerformed

    private void AphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AphoneActionPerformed

    private void GenderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderCbActionPerformed

    private void ApassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApassActionPerformed

    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked
         try{
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
           PreparedStatement add = Con.prepareStatement("insert into agenttb values(?,?,?,?,?,?)");
           add.setInt(1, Integer.valueOf(Aid.getText()));
           add.setString(2, Aname.getText());
          add.setInt(3, Integer.valueOf(Aage.getText()));
          add.setInt( 4, Integer.valueOf(Aphone.getText()));
          add.setString(5, Aphone.getText());
          add.setString(6, GenderCb.getSelectedItem().toString());
           int row = add.executeUpdate();
          JOptionPane.showMessageDialog(this, "Agent Succesfully Added");
          Con.close();
          SelectMed();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
    }   
               
    }//GEN-LAST:event_AddbtnMouseClicked

    private void ClearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbtnMouseClicked
       Aid.setText("");
       Aname.setText("");
       Aage.setText("");
       Aphone.setText("");
       Apass.setText("");
       
       
    }//GEN-LAST:event_ClearbtnMouseClicked

    private void DeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletebtnMouseClicked
         if(Aid.getText().isEmpty())
     {
     JOptionPane.showMessageDialog(this, "Enter The Agent To Be Deleted");
     }
         else{
     try{
     Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
     String Id = Aid.getText();
     String Query = "Delete from pharmadb.agenttb where AID="+Id;
     Statement Add =Con.createStatement();
     Add.executeUpdate(Query);
     SelectMed();
     JOptionPane.showMessageDialog(this, "Agent Deleted Successfully");
     } 
     catch(SQLException e){
     e.printStackTrace();
     }
     }
    }//GEN-LAST:event_DeletebtnMouseClicked

    private void UpdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatebtnMouseClicked
       if(Aid.getText().isEmpty() || Aname.getText().isEmpty()|| Aage.getText().isEmpty()|| Aphone.getText().isEmpty()||Apass.getText().isEmpty()){
     JOptionPane.showMessageDialog(this, "Missing Information");
}  else{  
    
    try{
       
    Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
    String UpdateQuery = "Update pharmadb.agenttb set ANAME = '"+Aname.getText()+"'"+",AAGE = "+Aage.getText()+""+",APHONE = "+Aphone.getText()+""+",APASSWORD= '"+Apass.getText()+"'"+",AGENDER= '"+GenderCb.getSelectedItem().toString()+"'"+"where AID = "+Aid.getText();
    Statement Add = Con.createStatement();
    Add.executeUpdate(UpdateQuery);
     JOptionPane.showMessageDialog(this, "Agent Updated Successfully");
    }
    catch(SQLException e){
     e.printStackTrace();
    }
    SelectMed();
}
    }//GEN-LAST:event_UpdatebtnMouseClicked

    private void AGENTTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTTABLEMouseClicked
        DefaultTableModel model = (DefaultTableModel)AGENTTABLE.getModel();
    int Myindex =AGENTTABLE.getSelectedRow();
      Aid.setText(model.getValueAt(Myindex, 0).toString());
      Aname.setText(model.getValueAt(Myindex, 1).toString());
     Aage.setText(model.getValueAt(Myindex, 2).toString());
      Aphone.setText(model.getValueAt(Myindex, 3).toString());
       Apass.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_AGENTTABLEMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Company().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
         new Medicine().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new Selling().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
         new Dashboard().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
       new Category().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AGENTTABLE;
    private javax.swing.JTextField Aage;
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField Aid;
    private javax.swing.JTextField Aname;
    private javax.swing.JTextField Apass;
    private javax.swing.JTextField Aphone;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
