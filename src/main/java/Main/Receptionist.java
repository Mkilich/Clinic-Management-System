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

import Receptionist.ReceptionistActivity;

/**
 *
 * @author mehmetkilic
 */
public class Receptionist extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String username;

    public Receptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
        mLabel = new java.awt.Label();
        dUser = new javax.swing.JLabel();
        rUserField = new javax.swing.JTextField();
        plbl = new javax.swing.JLabel();
        rPassField = new javax.swing.JPasswordField();
        rExitBtn = new javax.swing.JButton();
        rLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist");
        setPreferredSize(new java.awt.Dimension(1000, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(null);

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Clinic Management System");
        getContentPane().add(mLabel);
        mLabel.setBounds(0, 34, 1000, 70);

        dUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dUser.setText("Username:");
        getContentPane().add(dUser);
        dUser.setBounds(262, 168, 116, 29);

        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(rUserField);
        rUserField.setBounds(388, 168, 279, 29);

        plbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        plbl.setText("Password:");
        getContentPane().add(plbl);
        plbl.setBounds(261, 302, 109, 29);

        rPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassFieldActionPerformed(evt);
            }
        });
        getContentPane().add(rPassField);
        rPassField.setBounds(388, 302, 279, 29);

        rExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        rExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rExitBtn.setText("Home");
        rExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(rExitBtn);
        rExitBtn.setBounds(388, 404, 91, 35);

        rLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        rLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rLoginBtn.setText("Login");
        rLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(rLoginBtn);
        rLoginBtn.setBounds(576, 404, 91, 35);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserFieldActionPerformed

    private void rPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPassFieldActionPerformed

    private void rExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rExitBtnActionPerformed
        Clinic hospital = new Clinic();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_rExitBtnActionPerformed

    private void rLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String user = rUserField.getText();
        String pass = String.valueOf(rPassField.getPassword());

        try {
            String sql = "SELECT * FROM receptionist WHERE username = ? AND password = ?";
            prp = connection.prepareStatement(sql);
            prp.setString(1, user);
            prp.setString(2, pass);
            result = prp.executeQuery();

            if (result.next()) {
                String storedPass = result.getString("password");
                if (pass.equals(storedPass)) {
                    ReceptionistActivity rActivity = new ReceptionistActivity();
                    rActivity.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    username = user;
                    rActivity.User(username);
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
    }//GEN-LAST:event_rLoginBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Receptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dUser;
    private java.awt.Label mLabel;
    private javax.swing.JLabel plbl;
    private javax.swing.JButton rExitBtn;
    private javax.swing.JButton rLoginBtn;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rUserField;
    // End of variables declaration//GEN-END:variables
}
