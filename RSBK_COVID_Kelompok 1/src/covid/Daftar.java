/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form Daftar
     */
    public Daftar() {
        initComponents();
        this.setTitle("FORM PENDAFTARAN GEJALA COVID-19");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        etPekerjaanD = new javax.swing.JTextField();
        etHpD = new javax.swing.JTextField();
        etAlamatD = new javax.swing.JTextField();
        etUmurD = new javax.swing.JTextField();
        etNamaD = new javax.swing.JTextField();
        btnSimpanD = new javax.swing.JButton();
        btnKembaliD = new javax.swing.JButton();
        rbPria = new javax.swing.JRadioButton();
        rbWanita = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("Umur");

        jLabel3.setText("Kelamin");

        jLabel4.setText("Alamat");

        jLabel5.setText("Nomor Hp");

        jLabel6.setText("Pekerjaan");

        btnSimpanD.setText("Simpan");
        btnSimpanD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanDActionPerformed(evt);
            }
        });

        btnKembaliD.setText("Kembali");
        btnKembaliD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliDActionPerformed(evt);
            }
        });

        rbPria.setText("Pria");
        rbPria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPriaActionPerformed(evt);
            }
        });

        rbWanita.setText("Wanita");
        rbWanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbWanitaActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(etPekerjaanD))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etAlamatD)
                            .addComponent(etHpD)
                            .addComponent(etUmurD)
                            .addComponent(etNamaD, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbPria)
                                .addGap(18, 18, 18)
                                .addComponent(rbWanita)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKembaliD, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpanD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(etNamaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(etUmurD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rbPria)
                            .addComponent(rbWanita))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(etAlamatD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(etHpD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(etPekerjaanD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembaliD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanDActionPerformed

            String nama;
            int Umur;
            String Kelamin = "-";
            String Alamat ;
            int Hp;
            String Pekerjaan;
        
        if(etNamaD.getText().isEmpty() || etUmurD.getText().isEmpty() || etAlamatD.getText().isEmpty() || etHpD.getText().isEmpty() || etPekerjaanD.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Ada kolom yang belum terisi!"); 
        } else {
            nama = etNamaD.getText();
            Umur = Integer.parseInt(etUmurD.getText());
            if(rbPria.isSelected()){
                Kelamin = "Pria";
            } else if (rbWanita.isSelected()){
                Kelamin = "Wanita";
            }
            Alamat = etAlamatD.getText();
            Hp = Integer.parseInt(etHpD.getText());
            Pekerjaan = etPekerjaanD.getText();

            Main.tambah(new Object[]{
                                        nama,
                                        Umur,
                                        Kelamin,
                                        Alamat,
                                        Hp,
                                        Pekerjaan
            });

            JOptionPane.showMessageDialog(null, "Berhasil Mendaftar!");

            this.setVisible(false);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        }
        
    }//GEN-LAST:event_btnSimpanDActionPerformed

    private void btnKembaliDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliDActionPerformed
        this.setVisible(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnKembaliDActionPerformed

    private void rbWanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbWanitaActionPerformed
        if(rbWanita.isSelected()){
            rbPria.setSelected(false);
        }
    }//GEN-LAST:event_rbWanitaActionPerformed

    private void rbPriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPriaActionPerformed
        if(rbPria.isSelected()){
            rbWanita.setSelected(false);
        }
    }//GEN-LAST:event_rbPriaActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembaliD;
    private javax.swing.JButton btnSimpanD;
    private javax.swing.JTextField etAlamatD;
    private javax.swing.JTextField etHpD;
    private javax.swing.JTextField etNamaD;
    private javax.swing.JTextField etPekerjaanD;
    private javax.swing.JTextField etUmurD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbPria;
    private javax.swing.JRadioButton rbWanita;
    // End of variables declaration//GEN-END:variables
}
