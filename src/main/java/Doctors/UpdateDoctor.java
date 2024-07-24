/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Doctors;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Admins.DoctorManagement;
import Main.Connector;
import Main.Clinic;

/**
 *
 * @author mehmetkilic
 */
public class UpdateDoctor extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    String id;
    String name;
    int age;
    String gender;
    String blood;
    String dept;
    String email;
    String phone;
    String Status;
    String address;
    int room;
    String status;
    String username;
    String password;

    public UpdateDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Id", "Name", "Age", "Gender", "Blood Group", "Department", "Email Address", "Status", "Address", "Phone Number", "Room Number", "Username"};
        defaultTableModel.setColumnIdentifiers(columns);
        dUTable.setModel(defaultTableModel);
        loadData();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select id,name,age,gender,blood,dept,phone,email,status,address,room,username from doctor";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[15];
            while (rs.next()) {
                columnData[0] = rs.getString("id");
                columnData[1] = rs.getString("name");
                columnData[2] = rs.getInt("age");
                columnData[3] = rs.getString("gender");
                columnData[4] = rs.getString("blood");
                columnData[5] = rs.getString("dept");
                columnData[6] = rs.getString("phone");
                columnData[7] = rs.getString("email");
                columnData[8] = rs.getString("status");
                columnData[9] = rs.getString("address");
                columnData[10] = rs.getInt("room");
                columnData[11] = rs.getString("username");
              //  columnData[11] = rs.getString("password");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dUTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Doctor info !");

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Update Doctor");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dUTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {"", "", "", ""},
                {"", "", null, ""},
                {"", null, "", ""}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dUTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dUTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dUTable);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(556, 556, 556)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Clinic clinic = new Clinic();
        clinic.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        DoctorManagement dManagement = new DoctorManagement();
        dManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void dUTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dUTableMouseClicked
        int row = dUTable.getSelectedRow();
        String rid = (dUTable.getValueAt(row, 0).toString());
        String rname = (dUTable.getValueAt(row, 1).toString());
        int rage = Integer.parseInt((dUTable.getValueAt(row, 2).toString()));
        String rgender = (dUTable.getValueAt(row, 3).toString());
        String rblood = (dUTable.getValueAt(row, 4).toString());
        String rdept = (dUTable.getValueAt(row, 5).toString());
        String rphone = (dUTable.getValueAt(row, 6).toString());
        String remail = (dUTable.getValueAt(row, 7).toString());
        String rstatus = (dUTable.getValueAt(row, 8).toString());
        String raddress = (dUTable.getValueAt(row, 9).toString());
        int rroom = Integer.parseInt((dUTable.getValueAt(row, 10)).toString());
        String rusername = (dUTable.getValueAt(row, 11).toString());
      //  String rpassword = (dUTable.getValueAt(row, 11).toString());
        
        id = rid;
        name = rname;
        age = rage;
        gender = rgender;
        blood = rblood;
        dept = rdept;
        email = remail;
        phone = rphone;
        address = raddress;
        status = rstatus;
        room = rroom;
        username = rusername;
      //  password = rpassword;
    }//GEN-LAST:event_dUTableMouseClicked

    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        connection = Connector.ConnectDb();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Database connection is not established");
            return;
        }
//
//        // Debugging: Print captured values
//        System.out.println("Updating Doctor with details:");
//        System.out.println("ID: " + id);
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Gender: " + gender);
//        System.out.println("Blood Group: " + blood);
//        System.out.println("Department: " + dept);
//        System.out.println("Phone: " + phone);
//        System.out.println("Email: " + email);
//        System.out.println("Status: " + status);
//        System.out.println("Address: " + address);
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);

        String sql = "UPDATE doctor SET id = ?, name = ?, age = ?, gender = ?, blood = ?, dept = ?, phone = ?, email = ?, status = ?, address = ?, room = ?, username = ? WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, gender);
            ps.setString(5, blood);
            ps.setString(6, dept);
            ps.setString(7, phone);
            ps.setString(8, email);
            ps.setString(9, status);
            ps.setString(10, address);
            ps.setInt(11, room);
            ps.setString(12, username);
           // ps.setString(12, password);
            ps.setString(13, id); // The id for the WHERE clause

            int rowsAffected = ps.executeUpdate();
        //    System.out.println("Rows affected: " + rowsAffected);

            if (rowsAffected > 0) {
                defaultTableModel.getDataVector().removeAllElements();
                defaultTableModel.fireTableDataChanged();
                loadData();
                JOptionPane.showMessageDialog(null, "Data Updated");
            } else {
                JOptionPane.showMessageDialog(null, "No matching record found to update");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dUTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
