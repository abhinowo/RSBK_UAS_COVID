
package covid;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
        this.setTitle("FORM GEJALA ASISTENSI COVID-19");
        String []book={"Nama","Umur","Kelamin","Alamat","Hp","Pekerjaan"};
        DefaultTableModel model=new DefaultTableModel(book,0);
        tblAkun.setModel(model);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAkun = new javax.swing.JTable();
        btnDaftar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tvAkun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAkun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        )
    );
    tblAkun.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblAkunMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tblAkun);

    btnDaftar.setText("Daftar");
    btnDaftar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDaftarActionPerformed(evt);
        }
    });

    btnLogin.setText("Login");
    btnLogin.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLoginActionPerformed(evt);
        }
    });

    jLabel1.setText("Masuk Sebagai :");

    tvAkun.setText("-");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tvAkun)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                    .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnLogin)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDaftar)
                    .addComponent(jLabel1)
                    .addComponent(tvAkun)))
            .addContainerGap(43, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        Daftar a = new Daftar();
        a.setVisible(true);
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void tblAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAkunMouseClicked
        int row=tblAkun.getSelectedRow();
        tvAkun.setText(tblAkun.getModel().getValueAt(row, 0).toString());
        
    }//GEN-LAST:event_tblAkunMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        asisten b = new asisten();
        int row=tblAkun.getSelectedRow();
        
        String coba;
        
        String a = tvAkun.getText();
        if(a == "-"){
           JOptionPane.showMessageDialog(null, "Anda tidak terdaftar!"); 
        } else {
           String nama = tblAkun.getModel().getValueAt(row, 0).toString();
           coba = tblAkun.getModel().getValueAt(row, 1).toString();
           int Umur = Integer.parseInt(coba);
           String Kelamin = tblAkun.getModel().getValueAt(row, 2).toString();
           String Alamat = tblAkun.getModel().getValueAt(row, 3).toString();
           coba = tblAkun.getModel().getValueAt(row, 4).toString();
           int Hp = Integer.parseInt(coba);
           String Pekerjaan = tblAkun.getModel().getValueAt(row, 5).toString();
        
           b.setEt(nama,Umur,Kelamin,Alamat,Hp,Pekerjaan);
           b.setVisible(true); 
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed


    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblAkun;
    private javax.swing.JLabel tvAkun;
    // End of variables declaration//GEN-END:variables

    static void tambah(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel)tblAkun.getModel();
        model.addRow(dataRow);
    }
    
    static void hapus(String nama){
        int row = tblAkun.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblAkun.getModel();
        for(int a=0; a<row; a++){
            String cek = model.getValueAt(a, 0).toString();
            
            if(cek.equals(nama)){
                model.removeRow(a);
            }
        }
    }
    
    
}
