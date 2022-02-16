/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.DriverManager;
import java.util.ArrayList;
import model.AddUserDetails;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class ViewUser extends javax.swing.JFrame {

    /**
     * Creates new form ViewUser
     */
    public ViewUser() {

        initComponents();
        setLocationRelativeTo(null);
        // jScrollPane1.getViewport().setBackground(new Color(34,40,44));
        getContentPane().setBackground(new Color(34,40,44));
        jTable_Display_User.setFillsViewportHeight(true);
        ArrayList<AddUserDetails> usersList = new ArrayList<>();

        try {
            String username = "root";
            String password = "0422075m";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/FMS?characterEncoding=utf8&useSSL=false&autoReconnect=true",
                    username, password);
            String query1 = "SELECT * from AddUser";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i=0;i<cols;i++)
                colName[i]=rsmd.getColumnName(i+1);
            model.setColumnIdentifiers(colName);
            String First_Name, lName, uName, eMail, pNumber;
            while(rs.next()){
                First_Name = rs.getString(1);
                lName = rs.getString(2);
                uName = rs.getString(3);
                eMail = rs.getString(4);
                pNumber = rs.getString(5);
                String[] row = {First_Name, lName, uName, eMail, pNumber};
                model.addRow(row);
            }
            st.close();
            con.close();
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_Display_User.setBackground(new java.awt.Color(34, 44, 40));
        jTable_Display_User.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable_Display_User.setForeground(new java.awt.Color(197, 148, 27));
        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Display_User.setEnabled(false);
        jTable_Display_User.setGridColor(new java.awt.Color(34, 44, 40));
        jTable_Display_User.setRowHeight(32);
        jTable_Display_User.setRowSelectionAllowed(false);
        jTable_Display_User.setSelectionForeground(new java.awt.Color(197, 148, 27));
        jTable_Display_User.getTableHeader().setReorderingAllowed(false);
        jTable_Display_User.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jTable_Display_User);

        jLabel1.setBackground(new java.awt.Color(34, 40, 44));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(197, 148, 27));
        jLabel1.setText("Go Airways");

        jLabel2.setBackground(new java.awt.Color(34, 44, 40));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(197, 148, 27));
        jLabel2.setText("List of Current Users");

        jButton1.setBackground(new java.awt.Color(34, 40, 44));
        jButton1.setForeground(new java.awt.Color(197, 148, 27));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_back_20px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
new AdminHome().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User;
    // End of variables declaration//GEN-END:variables
}