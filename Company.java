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
public class Company extends javax.swing.JFrame {

    /**
     * Creates new form Company
     */
    public Company() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CompId = new javax.swing.JTextField();
        Compname = new javax.swing.JTextField();
        Compexp = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompanyTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Compadd = new javax.swing.JTextField();
        Compphone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Deletebtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("MANAGE COMPANY");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 15, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("NAME");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("PHONE");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("EXPERIENCE");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 79, -1, -1));

        CompId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CompId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompIdMouseClicked(evt);
            }
        });
        CompId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompIdActionPerformed(evt);
            }
        });
        jPanel4.add(CompId, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 76, 170, -1));

        Compname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Compname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompnameActionPerformed(evt);
            }
        });
        jPanel4.add(Compname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        Compexp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Compexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompexpActionPerformed(evt);
            }
        });
        jPanel4.add(Compexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 160, -1));

        Addbtn.setBackground(new java.awt.Color(102, 102, 102));
        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("ADD");
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        jPanel4.add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 101, -1));

        Updatebtn.setBackground(new java.awt.Color(102, 102, 102));
        Updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        Updatebtn.setText("UPDATE");
        Updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatebtnMouseClicked(evt);
            }
        });
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });
        jPanel4.add(Updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        Clearbtn.setBackground(new java.awt.Color(102, 102, 102));
        Clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        Clearbtn.setText("CLEAR");
        Clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearbtnMouseClicked(evt);
            }
        });
        jPanel4.add(Clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        CompanyTable.setBackground(new java.awt.Color(153, 153, 153));
        CompanyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CompanyTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        CompanyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompanyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CompanyTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 870, 231));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("COMPANIES LIST");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 345, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("ADDRESS");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        Compadd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Compadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompaddActionPerformed(evt);
            }
        });
        jPanel4.add(Compadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, -1));

        Compphone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Compphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompphoneActionPerformed(evt);
            }
        });
        jPanel4.add(Compphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 160, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ID");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Deletebtn1.setBackground(new java.awt.Color(102, 102, 102));
        Deletebtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Deletebtn1.setForeground(new java.awt.Color(255, 255, 255));
        Deletebtn1.setText("DELETE");
        Deletebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Deletebtn1MouseClicked(evt);
            }
        });
        jPanel4.add(Deletebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGENTS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DASHBOARD");
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MEDICINES");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CATEGORY");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12)
                                .addComponent(jLabel16))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void SelectMed()
{
    try{
Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
St = Con.createStatement();
Rs = St.executeQuery("select * from pharmadb.companytb");
CompanyTable.setModel(DbUtils.resultSetToTableModel(Rs));
}catch(SQLException e){
e.printStackTrace();
}
}
    private void CompIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompIdActionPerformed

    private void CompnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompnameActionPerformed

    private void CompexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompexpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompexpActionPerformed

    private void CompaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompaddActionPerformed

    private void CompphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompphoneActionPerformed

    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked

        try{
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
           PreparedStatement add = Con.prepareStatement("insert into companytb values(?,?,?,?,?)");
           add.setInt(1, Integer.valueOf(CompId.getText()));
           add.setString(2, Compname.getText());
           add.setString(3, Compadd.getText());
          
           add.setInt( 4, Integer.valueOf(Compexp.getText()));
          add.setInt( 5, Integer.valueOf(Compphone.getText()));
           int row = add.executeUpdate();
          JOptionPane.showMessageDialog(this, "Company Succesfully Added");
          Con.close();
          SelectMed();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
    }   
    }//GEN-LAST:event_AddbtnMouseClicked

    private void ClearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbtnMouseClicked
         CompId.setText("");
       Compname.setText("");
       Compadd.setText("");
       Compexp.setText("");
       Compphone.setText("");
    }//GEN-LAST:event_ClearbtnMouseClicked

    private void UpdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatebtnMouseClicked
       
    }//GEN-LAST:event_UpdatebtnMouseClicked

    private void CompanyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompanyTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)CompanyTable.getModel();
    int Myindex =CompanyTable.getSelectedRow();
      CompId.setText(model.getValueAt(Myindex, 0).toString());
      Compname.setText(model.getValueAt(Myindex, 1).toString());
    Compadd.setText(model.getValueAt(Myindex, 2).toString());
      Compexp.setText(model.getValueAt(Myindex, 3).toString());
       Compphone.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_CompanyTableMouseClicked

    private void Deletebtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Deletebtn1MouseClicked
       if(CompId.getText().isEmpty())
     {
     JOptionPane.showMessageDialog(this, "Enter The Company To Be Deleted");
     }
         else{
     try{
     Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
     String Id = CompId.getText();
     String Query = "Delete from pharmadb.companytb where CompId="+Id;
     Statement Add =Con.createStatement();
     Add.executeUpdate(Query);
     SelectMed();
     JOptionPane.showMessageDialog(this, "Company Deleted Successfully");
     } 
     catch(SQLException e){
     e.printStackTrace();
     }
     }
    }//GEN-LAST:event_Deletebtn1MouseClicked

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
         if(CompId.getText().isEmpty() || Compname.getText().isEmpty()|| Compadd.getText().isEmpty()|| Compexp.getText().isEmpty()||Compphone.getText().isEmpty()){
     JOptionPane.showMessageDialog(this, "Missing Information");
}  else{  
    
    try{
       
    Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
    String UpdateQuery = "Update pharmadb.companytb set CompName = '"+Compname.getText()+"'"+",CompAd =' "+Compadd.getText()+"'"+",CompExp = "+Compexp.getText()+""+",CompPhone= '"+Compphone.getText()+"'"+"where CompId = "+CompId.getText();
    Statement Add = Con.createStatement();
    Add.executeUpdate(UpdateQuery);
     JOptionPane.showMessageDialog(this, "Company Updated Successfully");
    }
    catch(SQLException e){
     e.printStackTrace();
    }
    SelectMed();
}
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Dashboard().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         new Agents().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
         new Selling().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
      new Medicine().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void CompIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CompIdMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
         new Category().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField CompId;
    private javax.swing.JTextField Compadd;
    private javax.swing.JTable CompanyTable;
    private javax.swing.JTextField Compexp;
    private javax.swing.JTextField Compname;
    private javax.swing.JTextField Compphone;
    private javax.swing.JButton Deletebtn1;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
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
