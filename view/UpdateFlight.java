/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.TimePicker;

import controller.UpdateFlightController;
import model.UpdateFlightDetails;
/**
 *
 * @author rocke
 */
public class UpdateFlight extends javax.swing.JFrame
{

    /**
     * Creates new form Update
     */
    public UpdateFlight()
    {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension  size = toolkit.getScreenSize();
        setLocation(size.width /2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        JButton[] btns =  {jButton2};
        for (JButton btn : btns)
        {
            btn.setBackground(new Color(34,40,44));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener()
            {
                @Override
                public void mouseClicked(MouseEvent e)
                {

                }

                @Override
                public void mousePressed(MouseEvent e)
                {

                }

                @Override
                public void mouseReleased(MouseEvent e)
                {

                }

                @Override
                public void mouseEntered(MouseEvent e)
                {
                    btn.setBackground(new Color(54, 81, 207));
                }

                @Override
                public void mouseExited(MouseEvent e)
                {
                    btn.setBackground(new Color (34,40,44));
                }
            });
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

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        pnlCTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pnlCCenter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();
        dateTimePicker2 = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(21, 25, 28));
        pnlSide.setPreferredSize(new java.awt.Dimension(80, 0));
        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(34, 40, 44));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        pnlCTop.setBackground(new java.awt.Color(34, 40, 44));
        pnlCTop.setPreferredSize(new java.awt.Dimension(0, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(197, 148, 27));
        jLabel1.setText("GO AIRWAYS");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_back_20px.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCTopLayout = new javax.swing.GroupLayout(pnlCTop);
        pnlCTop.setLayout(pnlCTopLayout);
        pnlCTopLayout.setHorizontalGroup(
            pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(289, 289, 289))
        );
        pnlCTopLayout.setVerticalGroup(
            pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCTopLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pnlCenter.add(pnlCTop, java.awt.BorderLayout.NORTH);

        pnlCCenter.setBackground(new java.awt.Color(34, 40, 44));

        jLabel2.setBackground(new java.awt.Color(34, 40, 44));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(197, 148, 27));
        jLabel2.setText("Flight Number");

        jLabel3.setBackground(new java.awt.Color(34, 40, 44));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(197, 148, 27));
        jLabel3.setText("Departure Time");

        jLabel4.setBackground(new java.awt.Color(34, 40, 44));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(197, 148, 27));
        jLabel4.setText("Arrival Time");

        jLabel5.setBackground(new java.awt.Color(34, 40, 44));
        jLabel5.setForeground(new java.awt.Color(197, 148, 27));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Destination");

        jTextField1.setBackground(new java.awt.Color(34, 40, 44));
        jTextField1.setForeground(new java.awt.Color(197, 148, 27));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(34, 40, 44));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(197, 148, 27));
        jLabel6.setText("Flight Cost");

        jTextField5.setBackground(new java.awt.Color(34, 40, 44));
        jTextField5.setForeground(new java.awt.Color(197, 148, 27));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(34, 40, 44));
        jButton1.setForeground(new java.awt.Color(197, 148, 27));
        jButton1.setText("Update / Add Flight");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(34, 40, 44));
        jTextField6.setForeground(new java.awt.Color(197, 148, 27));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(34, 40, 44));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(197, 148, 27));
        jLabel7.setText("From");

        jTextField7.setBackground(new java.awt.Color(34, 40, 44));
        jTextField7.setForeground(new java.awt.Color(197, 148, 27));

        dateTimePicker1.setBackground(new java.awt.Color(34, 40, 44));
        dateTimePicker1.setForeground(new java.awt.Color(197, 148, 27));

        dateTimePicker2.setBackground(new java.awt.Color(34, 40, 44));
        dateTimePicker2.setForeground(new java.awt.Color(197, 148, 27));

        javax.swing.GroupLayout pnlCCenterLayout = new javax.swing.GroupLayout(pnlCCenter);
        pnlCCenter.setLayout(pnlCCenterLayout);
        pnlCCenterLayout.setHorizontalGroup(
            pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCCenterLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCCenterLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCCenterLayout.createSequentialGroup()
                        .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlCCenterLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCCenterLayout.createSequentialGroup()
                                    .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(pnlCCenterLayout.createSequentialGroup()
                                .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)))
                        .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jTextField5)
                                .addComponent(jTextField6)
                                .addComponent(jTextField7))
                            .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTimePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))))
        );
        pnlCCenterLayout.setVerticalGroup(
            pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCCenterLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dateTimePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pnlCenter.add(pnlCCenter, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fNumber = jTextField1.getText();
        String from = jTextField7.getText();
        String dest = jTextField5.getText();
        String fCost = jTextField6.getText();
        DatePicker date0 = dateTimePicker1.getDatePicker();
        TimePicker time0 = dateTimePicker1.getTimePicker();
        String dt0 = date0+"/"+time0;
        DatePicker date1 = dateTimePicker2.getDatePicker();
        TimePicker time1 = dateTimePicker2.getTimePicker();
        String dt1 = date1+"/"+time1;
        System.out.println(time0);
        System.out.println(fNumber);

        System.out.println(from);
        System.out.println(dest);
        System.out.println(fCost);
        UpdateFlightDetails ufd = new UpdateFlightDetails(fNumber, dt0, dt1, from, dest, fCost);
        UpdateFlightController ufc = new UpdateFlightController();
        int i = ufc.UpdateFlightDetails(ufd);
        if(i==1){
            JOptionPane.showMessageDialog(null, "Flight Successfully added");
            dispose();
            new AdminHome().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Unable to add flight");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(UpdateFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new UpdateFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel pnlCCenter;
    private javax.swing.JPanel pnlCTop;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables
}
