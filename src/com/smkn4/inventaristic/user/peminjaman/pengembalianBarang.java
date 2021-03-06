/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smkn4.inventaristic.user.peminjaman;

import com.smkn4.inventaristic.util.MySqlConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Aip Ariyadi
 */
public class pengembalianBarang extends javax.swing.JFrame {

    /**
     * Creates new form permintaanBarang
     */
    Connection koneksi;
    public int no = 1;
    public pengembalianBarang() {
        initComponents();
        createTable();
        koneksi = MySqlConnection.getConnection();
        txt_barang.setForeground(new Color(0,0,0,0));
        txt_barang.setBackground(new Color(0,0,0,0));
        //mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        
        //membuat kordinat
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nis = new javax.swing.JLabel();
        txt_nama = new javax.swing.JLabel();
        txt_kelas = new javax.swing.JLabel();
        txt_barang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        btn_selesai = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        lblNotif = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_nis.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        txt_nis.setText("NIS");

        txt_nama.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        txt_nama.setText("Nama");

        txt_kelas.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        txt_kelas.setText("Kelas");

        txt_barang.setBorder(null);
        txt_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_barangKeyReleased(evt);
            }
        });

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Barang", "Kode Barang"
            }
        ));
        tbl_barang.setEnabled(false);
        jScrollPane1.setViewportView(tbl_barang);

        btn_selesai.setText("Selesai");
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        lblNotif.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNotif.setText("Scan Barcode Barang");

        judul.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        judul.setText("Pengembalian Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nama)
                            .addComponent(txt_nis)
                            .addComponent(txt_kelas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNotif)
                            .addComponent(btn_batal))
                        .addGap(18, 18, 18)
                        .addComponent(btn_selesai)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txt_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(judul)
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txt_nis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_kelas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(judul)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(lblNotif)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selesai)
                    .addComponent(btn_batal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_barangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_barangKeyReleased
        scanBarang();
    }//GEN-LAST:event_txt_barangKeyReleased

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        pengembalianBarang();
        pilihanMenu main = new pilihanMenu();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_selesaiActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        pilihanMenu main = new pilihanMenu();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_batalActionPerformed

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
            java.util.logging.Logger.getLogger(pengembalianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengembalianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengembalianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembalianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembalianBarang().setVisible(true);
            }
        });
    }
    
    
    
    public void scanBarang(){
       if(txt_barang.getText().length() == 12){
            String id_barang = txt_barang.getText();
            txt_barang.setText("");
            barangKembali(id_barang);
//            cekBarang(id_barang);
            System.out.println(id_barang);
        }
    }
    
    public void showIdentitas(String id) {
        try {
            Statement stat = koneksi.createStatement();
            String query = "SELECT nis, nama_siswa, kelas  FROM siswa WHERE nis = '"+id+"'";
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                txt_nis.setText(rs.getString(1));
                txt_nama.setText(rs.getString(2));
                txt_kelas.setText(rs.getString(3));
            }
            rs.close();
            stat.close();
            showBarang(id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    DefaultTableModel dtm;
    public void createTable(){
        String[] kolom = {"No", "Nama Barang", "Kode Barang"};
        dtm = new DefaultTableModel(null, kolom);
    }
    
    public void tambahBarang(String idBarang, String namaBarang) {
        dtm.addRow(new String[]{no + "", namaBarang, idBarang});
        no++;
    }
    
    public void gantiWarna() {
        //code untuk ganti warna
    }
    
    public void barangKembali(String id) {
        try {
            Statement stat = koneksi.createStatement();
            String query = "UPDATE rincian SET status_barang = 'Dikembalikan' WHERE rincian.id_barang = '"+ id +"'" ;
            System.out.println("Dikembalikan");
            System.out.println(query);
            stat.executeUpdate(query);
            //gantiWarna();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void pengembalianBarang() {
        try {
            String tanggal = getTanggal();
            String id = txt_nis.getText();
            Statement stat = koneksi.createStatement();
            String query = "UPDATE peminjaman SET tgl_kembali = '"+ tanggal +"', status_peminjaman = 'Sudah Dikembalikan' WHERE peminjaman.nis = '"+ id +"'" ;
            System.out.println(query);
            stat.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void showBarang(String nis) {
        try {
            Statement stat = koneksi.createStatement();
            String query = "SELECT rincian.id_barang, barang_masuk.nama_barang FROM barang_masuk, peminjaman, rincian, siswa WHERE rincian.id_peminjaman = peminjaman.id_peminjaman"
                    + " AND rincian.id_barang = barang_masuk.id_barang AND peminjaman.nis = siswa.nis AND peminjaman.nis = '"+nis+"' AND peminjaman.status_peminjaman = 'Belum Kembali'" ;
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                String idBarang = rs.getString(1);
                String namaBarang = rs.getString(2);
                tambahBarang(idBarang, namaBarang);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tbl_barang.setModel(dtm);
    }
    

    public String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel lblNotif;
    private javax.swing.JTable tbl_barang;
    private javax.swing.JTextField txt_barang;
    private javax.swing.JLabel txt_kelas;
    private javax.swing.JLabel txt_nama;
    private javax.swing.JLabel txt_nis;
    // End of variables declaration//GEN-END:variables
}
