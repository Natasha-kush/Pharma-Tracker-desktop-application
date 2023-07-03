/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacyJava;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.management.Query;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;


public class Medicine extends javax.swing.JFrame {

    /**
     * Creates new form Medicine
     */
    public Medicine() {
        initComponents();
        SelectMed();
        GetCompany();
        GetCategory();
    }
Connection Con = null;
Statement St = null,St1=null;
ResultSet Rs = null,Rs1=null;
java.util.Date FDate,EDate;
java.sql.Date MyFabdate,MyExpdate;
   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        DASHBOARD = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        Medid = new javax.swing.JTextField();
        Medname = new javax.swing.JTextField();
        Medprice = new javax.swing.JTextField();
        Medqty = new javax.swing.JTextField();
        CompCb = new javax.swing.JComboBox<>();
        ExpDate = new com.toedter.calendar.JDateChooser();
        FabDate = new com.toedter.calendar.JDateChooser();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        DeleteBtn1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Compcat = new javax.swing.JComboBox<>();
        AGENT = new javax.swing.JLabel();
        SELLING = new javax.swing.JLabel();
        COMPANY1 = new javax.swing.JLabel();
        COMPANY2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        DASHBOARD.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        DASHBOARD.setForeground(new java.awt.Color(255, 255, 255));
        DASHBOARD.setText("DASHBOARD");
        DASHBOARD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DASHBOARDMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("MANAGE MEDICINE");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 15, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("MEDNAME");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("QUANTITY");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("FABDATE");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 79, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("EXPDATE");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        price.setForeground(new java.awt.Color(51, 51, 51));
        price.setText("PRICE");
        jPanel4.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        Medid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Medid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedidActionPerformed(evt);
            }
        });
        jPanel4.add(Medid, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 76, 176, -1));

        Medname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Medname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MednameMouseClicked(evt);
            }
        });
        Medname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MednameActionPerformed(evt);
            }
        });
        jPanel4.add(Medname, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 125, 176, -1));

        Medprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Medprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedpriceActionPerformed(evt);
            }
        });
        jPanel4.add(Medprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, -1));

        Medqty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Medqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedqtyActionPerformed(evt);
            }
        });
        jPanel4.add(Medqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 241, 176, -1));

        CompCb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CompCb.setForeground(new java.awt.Color(102, 102, 102));
        CompCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompCbMouseClicked(evt);
            }
        });
        CompCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompCbActionPerformed(evt);
            }
        });
        jPanel4.add(CompCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 164, -1));
        jPanel4.add(ExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 164, 32));
        jPanel4.add(FabDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 75, 164, 32));

        AddBtn.setBackground(new java.awt.Color(102, 102, 102));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel4.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 101, -1));

        UpdateBtn.setBackground(new java.awt.Color(102, 102, 102));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel4.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        Clearbtn.setBackground(new java.awt.Color(102, 102, 102));
        Clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        Clearbtn.setText("CLEAR");
        Clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearbtnMouseClicked(evt);
            }
        });
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });
        jPanel4.add(Clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        MedicineTable.setBackground(new java.awt.Color(153, 153, 153));
        MedicineTable.setForeground(new java.awt.Color(255, 255, 255));
        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MEDNAME", "MEDPRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY", "CATEGORY"
            }
        ));
        MedicineTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 850, 231));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("MEDICINE LIST");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 345, -1, -1));

        DeleteBtn1.setBackground(new java.awt.Color(102, 102, 102));
        DeleteBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn1.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn1.setText("DELETE");
        DeleteBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtn1MouseClicked(evt);
            }
        });
        jPanel4.add(DeleteBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("COMPANY");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CATEGORY");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        Compcat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Compcat.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(Compcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 160, 30));

        AGENT.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        AGENT.setForeground(new java.awt.Color(255, 255, 255));
        AGENT.setText("AGENTS");
        AGENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTMouseClicked(evt);
            }
        });

        SELLING.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        SELLING.setForeground(new java.awt.Color(255, 255, 255));
        SELLING.setText("SELLING");
        SELLING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELLINGMouseClicked(evt);
            }
        });

        COMPANY1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        COMPANY1.setForeground(new java.awt.Color(255, 255, 255));
        COMPANY1.setText("COMPANY");
        COMPANY1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPANY1MouseClicked(evt);
            }
        });

        COMPANY2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        COMPANY2.setForeground(new java.awt.Color(255, 255, 255));
        COMPANY2.setText("CATEGORY");
        COMPANY2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPANY2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DASHBOARD)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AGENT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SELLING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(COMPANY1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(COMPANY2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(DASHBOARD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(COMPANY1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(COMPANY2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AGENT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SELLING)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHARMACY CENTRE");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
public void GetCompany(){
   
try{
Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
St = Con.createStatement();
 String query ="select * from pharmadb.companytb";
Rs = St.executeQuery(query);
while(Rs.next()){
String Mycomp = Rs.getString("CompName");
CompCb.addItem(Mycomp);
}

}catch(SQLException e){
e.printStackTrace();
}
}
public void GetCategory(){
   
try{
Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
St = Con.createStatement();
 String query ="select * from pharmadb.categorytb";
Rs = St.executeQuery(query);
while(Rs.next()){
String Mycat = Rs.getString("CATEGORY");
Compcat.addItem(Mycat);
}

}catch(SQLException e){
e.printStackTrace();
}
}
    private void MedidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedidActionPerformed

    private void MednameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MednameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MednameActionPerformed

    private void MedpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedpriceActionPerformed

    private void MedqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedqtyActionPerformed

    private void CompCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompCbActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
      
    }//GEN-LAST:event_jPanel4MouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        FDate = FabDate.getDate();
        MyFabdate = new java.sql.Date(FDate.getTime());
        EDate = ExpDate.getDate();
        MyExpdate = new java.sql.Date(EDate.getTime());
        try{
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
           PreparedStatement add = Con.prepareStatement("insert into medicinetb values(?,?,?,?,?,?,?,?)");
           add.setInt(1, Integer.valueOf(Medid.getText()));
           add.setString(2, Medname.getText());
          
          add.setInt(3, Integer.valueOf(Medprice.getText()));
          add.setInt( 4, Integer.valueOf(Medqty.getText()));
          add.setDate(5, MyFabdate);
          add.setDate(6, MyExpdate);
          add.setString(7, CompCb.getSelectedItem().toString());
          add.setString(8, Compcat.getSelectedItem().toString());
         
           int row = add.executeUpdate();
          JOptionPane.showMessageDialog(this, "Medicine Succesfully Added");
          Con.close();
           SelectMed();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
    }   
               
        
            
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbtnMouseClicked
    
      Medid.setText("");
       Medname.setText("");
       Medprice.setText("");
      Medqty.setText("");
    }//GEN-LAST:event_ClearbtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
if(Medid.getText().isEmpty() || Medname.getText().isEmpty()|| Medprice.getText().isEmpty()|| Medqty.getText().isEmpty()){
     JOptionPane.showMessageDialog(this, "Missing Information");
}  else{  
    
    try{
         FDate = FabDate.getDate();
        MyFabdate = new java.sql.Date(FDate.getTime());
        EDate = ExpDate.getDate();
        MyExpdate = new java.sql.Date(EDate.getTime());
    Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
     String UpdateQuery = "Update pharmadb.medicinetb set MedName = '"+Medname.getText()+"'"+",MedPrice = "+Medprice.getText()+""+",MedQty = "+Medqty.getText()+""+",MedFab= '"+MyFabdate+"'"+",MedExp= '"+MyExpdate+"'"+",MedComp = '"+CompCb.getSelectedItem().toString()+"'"+",MedCat = '"+Compcat.getSelectedItem().toString()+"'"+"where MedId = "+Medid.getText();
    Statement Add = Con.createStatement();
    Add.executeUpdate(UpdateQuery);
     JOptionPane.showMessageDialog(this, "Medicine Updated Successfully");
    }
    catch(SQLException e){
     e.printStackTrace();
    }
    SelectMed();
}

    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked
 DefaultTableModel model = (DefaultTableModel)MedicineTable.getModel();
    int Myindex =MedicineTable.getSelectedRow();
      Medid.setText(model.getValueAt(Myindex, 0).toString());
      Medname.setText(model.getValueAt(Myindex, 1).toString());
      
      Medprice.setText(model.getValueAt(Myindex, 2).toString());
      Medqty.setText(model.getValueAt(Myindex, 3).toString());
      
      
    }//GEN-LAST:event_MedicineTableMouseClicked

    private void DeleteBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtn1MouseClicked
           if(Medid.getText().isEmpty())
     {
     JOptionPane.showMessageDialog(this, "Enter The Medicine To Be Deleted");
     }
         else{
     try{
     Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","natashakushwah708;.");
     String Id = Medid.getText();
     String Query = "Delete from pharmadb.medicinetb where MedId="+Id;
     Statement Add =Con.createStatement();
     Add.executeUpdate(Query);
     SelectMed();
     JOptionPane.showMessageDialog(this, "Medicine Deleted Successfully");
     } 
     catch(SQLException e){
     e.printStackTrace();
     }
     }
    }//GEN-LAST:event_DeleteBtn1MouseClicked

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void DASHBOARDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseClicked
     new Dashboard().setVisible(true);
     this.dispose();
             
    }//GEN-LAST:event_DASHBOARDMouseClicked

    private void AGENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTMouseClicked
      new Agents().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_AGENTMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void SELLINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELLINGMouseClicked
        new Selling().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_SELLINGMouseClicked

    private void COMPANY1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPANY1MouseClicked
        new Company().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_COMPANY1MouseClicked

    private void MednameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MednameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MednameMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void CompCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompCbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CompCbMouseClicked

    private void COMPANY2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPANY2MouseClicked
        new Category().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_COMPANY2MouseClicked
   
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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGENT;
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel COMPANY1;
    private javax.swing.JLabel COMPANY2;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JComboBox<String> CompCb;
    private javax.swing.JComboBox<String> Compcat;
    private javax.swing.JLabel DASHBOARD;
    private javax.swing.JButton DeleteBtn1;
    private com.toedter.calendar.JDateChooser ExpDate;
    private com.toedter.calendar.JDateChooser FabDate;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JTextField Medid;
    private javax.swing.JTextField Medname;
    private javax.swing.JTextField Medprice;
    private javax.swing.JTextField Medqty;
    private javax.swing.JLabel SELLING;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel price;
    // End of variables declaration//GEN-END:variables

   

}
