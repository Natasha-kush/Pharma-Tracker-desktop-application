/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacyJava;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        SelectMed();
        ShowDate();
    }
    public void ShowDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        datelbl.setText(s.format(d));
    }
    Connection Con = null;
Statement St = null,St1=null;
ResultSet Rs = null,Rs1=null;


    public void SelectMed()
{
    try{
Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
St = Con.createStatement();
Rs = St.executeQuery("select * from pharmadb.medicinetb");
MedicineTable.setModel(DbUtils.resultSetToTableModel(Rs));
}catch(SQLException e){
e.printStackTrace();
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        datelbl = new javax.swing.JLabel();
        QTY = new javax.swing.JLabel();
        CompId = new javax.swing.JTextField();
        Qty = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Printbtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        MEDTEXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Billtxt = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1087, 686));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datelbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        datelbl.setText("DATE");
        jPanel4.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 120, -1));
        datelbl.getAccessibleContext().setAccessibleName("SELLING");

        QTY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QTY.setForeground(new java.awt.Color(255, 255, 255));
        QTY.setText("QTY");
        jPanel4.add(QTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        CompId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CompId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompIdActionPerformed(evt);
            }
        });
        jPanel4.add(CompId, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 76, 170, -1));

        Qty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });
        jPanel4.add(Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, -1));

        Addbtn.setBackground(new java.awt.Color(102, 102, 102));
        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("ADD TO BILL");
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        jPanel4.add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, -1));
        Addbtn.getAccessibleContext().setAccessibleName(" Add ");

        Printbtn.setBackground(new java.awt.Color(102, 102, 102));
        Printbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Printbtn.setForeground(new java.awt.Color(255, 255, 255));
        Printbtn.setText("PRINT");
        Printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintbtnMouseClicked(evt);
            }
        });
        Printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintbtnActionPerformed(evt);
            }
        });
        jPanel4.add(Printbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        Clearbtn.setBackground(new java.awt.Color(102, 102, 102));
        Clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        Clearbtn.setText("CLEAR");
        Clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearbtnMouseClicked(evt);
            }
        });
        jPanel4.add(Clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setText("MEDICINES LIST");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BILL ID");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setText("BILLING");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("SELLER");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, -1));

        MedicineTable.setBackground(new java.awt.Color(102, 102, 102));
        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MEDNAME", "MEDPRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY"
            }
        ));
        MedicineTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 490, 140));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("BILL");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        MEDTEXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MEDTEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDTEXTActionPerformed(evt);
            }
        });
        jPanel4.add(MEDTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MEDICINE");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, -1));

        Billtxt.setColumns(20);
        Billtxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Billtxt.setRows(5);
        Billtxt.setText("************************************************PHARMACENTRE************************************************");
        jScrollPane2.setViewportView(Billtxt);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 570, 170));

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
        jLabel11.setText("MEDICINES");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("COMPANY");
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

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DASHBOARD");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CompIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompIdActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed
public void update(){
    int newQty;
    newQty = OldQty - Integer.valueOf(Qty.getText());
    try{
         
    Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
    String UpdateQuery = "Update pharmadb.medicinetb set MedQty = "+newQty+""+" where MedID = "+Medid;
    Statement Add = Con.createStatement();
    Add.executeUpdate(UpdateQuery);
    // JOptionPane.showMessageDialog(this, "Medicine Updated Successfully");
    }
    catch(SQLException e){
     e.printStackTrace();
    }
    SelectMed();
}
     int i = 0,price,Medid,OldQty ;
    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked


 if(MEDTEXT.getText().isEmpty()|| Qty.getText().isEmpty()){
 JOptionPane.showMessageDialog(this, "Missing Information");
 
 }else{
     i++;
     update();
 if(i == 1){
       Billtxt.setText(Billtxt.getText()+"************************************************PHARMACENTRE************************************************\n " 
                     + "\t ID  MEDICINE  QTY  PRICE  TOTAL\n\t"
               +" "+i+"          "+MEDTEXT.getText()+"           "+         Qty.getText()+"        "    +price+"         "+Integer.valueOf(Qty.getText())*price);
 
 }
 else
 {
  Billtxt.setText(Billtxt.getText()+"                                        \n " 
                     + "\t ID  MEDICINE  QTY  PRICE  TOTAL\n\t"
               +" "+i+"          "+MEDTEXT.getText()+"           "+         Qty.getText()+"        "    +price+"         "+Integer.valueOf(Qty.getText())*price);
 
            
 }
 }
    }//GEN-LAST:event_AddbtnMouseClicked
    
    private void PrintbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintbtnMouseClicked

    }//GEN-LAST:event_PrintbtnMouseClicked

    private void PrintbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintbtnActionPerformed
       
       try{
       Billtxt.print();
       }catch(Exception e){
       e.printStackTrace();
       }
    }//GEN-LAST:event_PrintbtnActionPerformed

    private void ClearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbtnMouseClicked
        CompId.setText("");
        Qty.setText("");
       // Compadd.setText("");
       // Compexp.setText("");
       // Compphone.setText("");
    }//GEN-LAST:event_ClearbtnMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)MedicineTable.getModel();
        int Myindex =MedicineTable.getSelectedRow();
        MEDTEXT.setText(model.getValueAt(Myindex, 1).toString());
       Medid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
       // Medname.setText(model.getValueAt(Myindex, 1).toString());
        price = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        OldQty=Integer.valueOf(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_MedicineTableMouseClicked

    private void MEDTEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDTEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEDTEXTActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
 new Company().setVisible(true);
     this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
         new Dashboard().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextArea Billtxt;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField CompId;
    private javax.swing.JTextField MEDTEXT;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton Printbtn;
    private javax.swing.JLabel QTY;
    private javax.swing.JTextField Qty;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
