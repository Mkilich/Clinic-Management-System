/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Admins.AdminActivity;
import Doctors.DoctorActivity;

/**
 *
 * @author mehmetkilic
 */
public class Doctor extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String userName;

    public Doctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mLabel = new java.awt.Label();
        aUserLabel = new javax.swing.JLabel();
        dUserField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dPassField = new javax.swing.JPasswordField();
        dExitBtn = new javax.swing.JButton();
        dLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello Doctor !");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));

        jPanel1.setLayout(null);

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Clinic Management System");

        aUserLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aUserLabel.setText("Username:");

        dUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dUserFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password:");

        dExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        dExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dExitBtn.setText("Home");
        dExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dExitBtnActionPerformed(evt);
            }
        });

        dLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        dLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dLoginBtn.setText("Login");
        dLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1004, 1004, 1004)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
            .addComponent(mLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(dExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(dLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(aUserLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(mLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aUserLabel)
                    .addComponent(dUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        mLabel.getAccessibleContext().setAccessibleName("Clinic Management System");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserFieldActionPerformed

    private void dExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dExitBtnActionPerformed
        Clinic clinic = new Clinic();
        clinic.setVisible(true);
        dispose();
    }//GEN-LAST:event_dExitBtnActionPerformed

    private void dLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        connection = Connector.ConnectDb();
        String user = dUserField.getText();
        String pass = String.valueOf(dPassField.getPassword());

        try {
            String sql = "SELECT * FROM doctor WHERE username = ? AND password = ?";
            prp = connection.prepareStatement(sql);
            prp.setString(1, user);
            prp.setString(2, pass);
            result = prp.executeQuery();

            if (result.next()) {
                String storedPass = result.getString("password");
                if (pass.equals(storedPass)) {
                    DoctorActivity dActivity = new DoctorActivity(user);
                    dActivity.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    connection.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_dLoginBtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Doctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JButton dExitBtn;
    private javax.swing.JButton dLoginBtn;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JTextField dUserField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label mLabel;
    // End of variables declaration//GEN-END:variables
}
