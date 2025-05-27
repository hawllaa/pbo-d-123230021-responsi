/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.*;
import Model.*;
import javax.swing.*;
import javax.swing.table.*;

public class TabelPabrik extends javax.swing.JFrame {
    public TabelPabrik() {
        initComponents();
        ControllerPabrik controller;
        controller = new ControllerPabrik(this);
        controller.showAllPabrik();
        hideColumn(TablePabrik, 0);
        hideColumn(TablePabrik, 2);
        hideColumn(TablePabrik, 3);
        hideColumn(TablePabrik, 4);
        hideColumn(TablePabrik, 5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblProduk = new javax.swing.JTextField();
        lblUnit = new javax.swing.JTextField();
        lblJam = new javax.swing.JTextField();
        lblTenaga = new javax.swing.JTextField();
        lblBiaya = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePabrik = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Produk");

        jLabel2.setText("Jml Unit");

        jLabel3.setText("Jml Tenaga Kerja");

        jLabel4.setText("Jam Kerja");

        jLabel5.setText("Biaya Bahan Baku");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblUnitActionPerformed(evt);
            }
        });

        lblTenaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTenagaActionPerformed(evt);
            }
        });

        lblBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBiayaActionPerformed(evt);
            }
        });

        TablePabrik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Produk", "Biaya Tenaga Kerja", "Efisiensi", "Total Biaya Produksi"
            }
        ));
        TablePabrik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePabrikMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePabrik);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Pabrik Bela Negara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addGap(33, 33, 33)
                                .addComponent(btnUpdate)
                                .addGap(30, 30, 30)
                                .addComponent(btnDelete))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblBiaya))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblTenaga))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblJam))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblUnit))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTenaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUnitActionPerformed

    private void lblTenagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTenagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTenagaActionPerformed

    private void lblBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBiayaActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        ControllerPabrik controller;
        controller = new ControllerPabrik(this);
        controller.insertPabrik();
        controller.showAllPabrik();
        hideColumn(TablePabrik, 0);
        hideColumn(TablePabrik, 2);
        hideColumn(TablePabrik, 3);
        hideColumn(TablePabrik, 4);
        hideColumn(TablePabrik, 5);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void hideColumn(JTable table, int colIndex){
        TableColumn column = table.getColumnModel().getColumn(colIndex);
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setPreferredWidth(0);
        column.setWidth(0);
        column.setResizable(false);
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int baris = TablePabrik.getSelectedRow();
        ControllerPabrik controller;
        controller = new ControllerPabrik(this);
        if(baris != -1){
            controller.deletePabrik(baris);
            controller.showAllPabrik();
            hideColumn(TablePabrik, 0);
            hideColumn(TablePabrik, 2);
            hideColumn(TablePabrik, 3);
            hideColumn(TablePabrik, 4);
            hideColumn(TablePabrik, 5);
            baris = -1;
        } else{
            JOptionPane.showMessageDialog(null, "Data Belum di pilih.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int baris = TablePabrik.getSelectedRow();
        ControllerPabrik controller;
        controller = new ControllerPabrik(this);
        if(baris != -1){
            int id = Integer.parseInt(TablePabrik.getValueAt(baris, 0).toString());
            controller.updatePabrik(baris);
            controller.showAllPabrik();
            hideColumn(TablePabrik, 0);
            hideColumn(TablePabrik, 2);
            hideColumn(TablePabrik, 3);
            hideColumn(TablePabrik, 4);
            hideColumn(TablePabrik, 5);
            baris = -1;
        } else{
            JOptionPane.showMessageDialog(null, "Data Belum di pilih.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void TablePabrikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePabrikMouseClicked
        Integer baris = TablePabrik.getSelectedRow();
        lblProduk.setText(TablePabrik.getValueAt(baris, 1).toString());
    }//GEN-LAST:event_TablePabrikMouseClicked

    public static void main(String args[]) {
   
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
            java.util.logging.Logger.getLogger(TabelPabrik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelPabrik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelPabrik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelPabrik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelPabrik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePabrik;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblBiaya;
    private javax.swing.JTextField lblJam;
    private javax.swing.JTextField lblProduk;
    private javax.swing.JTextField lblTenaga;
    private javax.swing.JTextField lblUnit;
    // End of variables declaration//GEN-END:variables

 
    public JTable getTablePabrik() {
        return TablePabrik;
    }

    public void setTablePabrik(JTable TablePabrik) {
        this.TablePabrik = TablePabrik;
    }

    public float getLblBiaya() {
        float nilailblBiaya = Float.parseFloat(lblBiaya.getText());
        return nilailblBiaya;
    }

    public void setLblBiaya(JTextField lblBiaya) {
        this.lblBiaya = lblBiaya;
    }

    public float getLblJam() {
        float nilailblJam = Float.parseFloat(lblJam.getText());
        return nilailblJam;
    }

    public void setLblJam(JTextField lblJam) {
        this.lblJam = lblJam;
    }

    public String getLblProduk() {
        return lblProduk.getText();
    }

    public void setLblProduk(JTextField lblProduk) {
        this.lblProduk = lblProduk;
    }

    public float getLblTenaga() {
        float nilailblTenaga = Float.parseFloat(lblTenaga.getText());
        return nilailblTenaga;
    }

    public void setLblTenaga(JTextField lblTenaga) {
        this.lblTenaga = lblTenaga;
    }

    public float getLblUnit() {
        float nilailblUnit = Float.parseFloat(lblUnit.getText());
        return nilailblUnit;
    }

    public void setLblUnit(JTextField lblUnit) {
        this.lblUnit = lblUnit;
    }
}
