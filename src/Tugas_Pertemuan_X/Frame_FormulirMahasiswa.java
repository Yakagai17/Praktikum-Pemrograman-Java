/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Pertemuan_X;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aganinggar
 */
public class Frame_FormulirMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form Frame_FormulirMahasiswa
     */
    public Frame_FormulirMahasiswa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanle_Isi_Form = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTF_nim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTF_nama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_prodi = new javax.swing.JTextField();
        jTF_ipk = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jB_tambah = new javax.swing.JButton();
        jB_ubah = new javax.swing.JButton();
        jB_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_dataMahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Formulir Mahasiswa");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("NIM");

        jTF_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_nimActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nama");

        jTF_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_namaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Program Studi");

        jTF_prodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_prodiActionPerformed(evt);
            }
        });

        jTF_ipk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_ipkActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("IPK");

        jB_tambah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB_tambah.setText("Tambah");
        jB_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_tambahActionPerformed(evt);
            }
        });

        jB_ubah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB_ubah.setText("Ubah");
        jB_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ubahActionPerformed(evt);
            }
        });

        jB_hapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB_hapus.setText("Hapus");
        jB_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_hapusActionPerformed(evt);
            }
        });

        jT_dataMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Program Studi", "IPK"
            }
        ));
        jT_dataMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_dataMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_dataMahasiswa);

        javax.swing.GroupLayout jPanle_Isi_FormLayout = new javax.swing.GroupLayout(jPanle_Isi_Form);
        jPanle_Isi_Form.setLayout(jPanle_Isi_FormLayout);
        jPanle_Isi_FormLayout.setHorizontalGroup(
            jPanle_Isi_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanle_Isi_FormLayout.createSequentialGroup()
                .addGroup(jPanle_Isi_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanle_Isi_FormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanle_Isi_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_prodi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_ipk, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jTF_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTF_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanle_Isi_FormLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel6))
                    .addGroup(jPanle_Isi_FormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jB_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_ubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_hapus)))
                .addContainerGap())
            .addGroup(jPanle_Isi_FormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanle_Isi_FormLayout.setVerticalGroup(
            jPanle_Isi_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanle_Isi_FormLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_ipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanle_Isi_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_tambah)
                    .addComponent(jB_ubah)
                    .addComponent(jB_hapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanle_Isi_Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanle_Isi_Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_nimActionPerformed

    private void jTF_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_namaActionPerformed

    private void jTF_prodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_prodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_prodiActionPerformed

    private void jTF_ipkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_ipkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_ipkActionPerformed

    private void jB_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_tambahActionPerformed
        DefaultTableModel model = (DefaultTableModel) jT_dataMahasiswa.getModel();
        model.addRow(new Object[]{jTF_nim.getText(),jTF_nama.getText(),jTF_prodi.getText(),jTF_ipk.getText()});
        JOptionPane.showMessageDialog(this, "Data berhasil ditambahakan");
        jTF_nim.setText("");
        jTF_nama.setText("");
        jTF_prodi.setText("");
        jTF_ipk.setText("");
        
    }//GEN-LAST:event_jB_tambahActionPerformed

    private void jB_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ubahActionPerformed
        DefaultTableModel model = (DefaultTableModel) jT_dataMahasiswa.getModel();
        model.setValueAt(jTF_nim.getText(), jT_dataMahasiswa.getSelectedRow(), 0);
        model.setValueAt(jTF_nama.getText(), jT_dataMahasiswa.getSelectedRow(), 1);
        model.setValueAt(jTF_prodi.getText(), jT_dataMahasiswa.getSelectedRow(), 2);
        model.setValueAt(jTF_ipk.getText(), jT_dataMahasiswa.getSelectedRow(), 3);
        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
        jTF_nim.setText("");
        jTF_nama.setText("");
        jTF_prodi.setText("");
        jTF_ipk.setText("");
    }//GEN-LAST:event_jB_ubahActionPerformed

    private void jB_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_hapusActionPerformed
        int respon = JOptionPane.showConfirmDialog(this, "Apakah data Mahasiswa akan di hapus ?", "Konfimasi", JOptionPane.YES_NO_OPTION);
        if (respon == JOptionPane.YES_OPTION) {
        DefaultTableModel model = (DefaultTableModel) jT_dataMahasiswa.getModel();
        model.removeRow(jT_dataMahasiswa.getSelectedRow());
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
        }
        
        
    }//GEN-LAST:event_jB_hapusActionPerformed

    private void jT_dataMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_dataMahasiswaMouseClicked
        DefaultTableModel model = (DefaultTableModel) jT_dataMahasiswa.getModel();
        jTF_nim.setText(model.getValueAt(jT_dataMahasiswa.getSelectedRow(), 0).toString());
        jTF_nama.setText(model.getValueAt(jT_dataMahasiswa.getSelectedRow(), 1).toString());
        jTF_prodi.setText(model.getValueAt(jT_dataMahasiswa.getSelectedRow(), 2).toString());
        jTF_ipk.setText(model.getValueAt(jT_dataMahasiswa.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jT_dataMahasiswaMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_FormulirMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_FormulirMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_FormulirMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_FormulirMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_FormulirMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_hapus;
    private javax.swing.JButton jB_tambah;
    private javax.swing.JButton jB_ubah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanle_Isi_Form;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_ipk;
    private javax.swing.JTextField jTF_nama;
    private javax.swing.JTextField jTF_nim;
    private javax.swing.JTextField jTF_prodi;
    private javax.swing.JTable jT_dataMahasiswa;
    // End of variables declaration//GEN-END:variables
}