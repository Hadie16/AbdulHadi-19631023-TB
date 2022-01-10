/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;




import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import konfigurasi.Konfigurasi;

/**
 *
 * @author hadie
 */
public class MahasiswaForm extends javax.swing.JFrame {

     
    String[] NamaKolom ={"NPM","NAMA LENGKAP","TEMPAT LAHIR","TANGGAL LAHIR","JENIS KELAMIN","ALAMAT","NO TELEPON"};
    int[] LebarKolom ={110,270,150,120,100,170,120};
    String SQL = "SELECT*FROM mahasiswa";
    /**
     * Creates new form mahasiswaForm
     */
    public MahasiswaForm() throws SQLException {
        initComponents();
          this.setLocationRelativeTo(null);
        new Konfigurasi().setJudulKolom(tableMhs, NamaKolom);
        new Konfigurasi().setTampilTabel(tableMhs,NamaKolom, SQL );
        new Konfigurasi().setLebarJudulKolom(tableMhs, LebarKolom);


        /* Set the Nimbus look and feel */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMhs = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboJenis_Kelamin = new javax.swing.JComboBox<>();
        textTempat = new javax.swing.JTextField();
        textNPM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textNo_Telp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        dateTanggal = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAlamat = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        buttonUbah = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonCetak = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        textCari = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        tableMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NPM", "NAMA LENGKAP", "Tempat Lahir", "Tanggal Lahir", "JENIS KELAMIN", "ALAMAT", "NO TELEPON"
            }
        ));
        tableMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMhs);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nama Lengkap");

        comboJenis_Kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Data-", "Laki-Laki", "Perempuan", " " }));

        textTempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTempatActionPerformed(evt);
            }
        });

        jLabel3.setText("Tempat Lahir");

        jLabel4.setText("Tanggal Lahir");

        jLabel5.setText("Jenis Kelamin");

        jLabel8.setText("Alamat");

        textNo_Telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNo_TelpActionPerformed(evt);
            }
        });

        jLabel1.setText("NPM");

        jLabel9.setText("No Telepon");

        dateTanggal.setDateFormatString("yyyy-MM-dd");

        textAlamat.setColumns(20);
        textAlamat.setRows(5);
        jScrollPane2.setViewportView(textAlamat);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonBatal.setText("Batal");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(buttonUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(buttonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboJenis_Kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNPM, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTempat, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textNo_Telp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNPM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textTempat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(dateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboJenis_Kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNo_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonCetak.setText("Cetak");
        buttonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCetakActionPerformed(evt);
            }
        });

        jButton4.setText("KEMBALI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        textCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCariKeyReleased(evt);
            }
        });

        jLabel7.setText("Cari Data");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("DATA MAHASISWA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159)
                .addComponent(buttonCetak)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(buttonCetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCetakActionPerformed
        new Konfigurasi().laporan("src/laporan/LaporanMahasiswa.jrxml","SELECT*FROM mahasiswa");
    }//GEN-LAST:event_buttonCetakActionPerformed

    private void textTempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTempatActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed

        try {
            if (textNPM.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"NPM belum diisi");
                textNPM.requestFocus();
            }else
            if(textNama.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Nama belum diisi");
                textNama.requestFocus();
            }else
            if(textTempat.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Tempat Lahir belum diisi");
                textTempat.requestFocus();
            }else
            if(comboJenis_Kelamin.getSelectedItem()==" -Pilih Data- "){
                JOptionPane.showMessageDialog(null,"Jenis Kelamin belum diisi");
                comboJenis_Kelamin.requestFocus();
            } else
            if(textAlamat.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"ALamat belum diisi");
                textAlamat.requestFocus();
            }else
            if(textNo_Telp.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Nomor Telp belum diisi");
                textNo_Telp.requestFocus();
            } else
            if (new Konfigurasi().getDuplikasi("mahasiswa","npm",textNPM.getText())==true){
                JOptionPane.showMessageDialog(null,"NPM sudah terdaftar");
                java.sql.Statement st = new Konfigurasi().getKoneksi.createStatement();
                java.sql.ResultSet rs = st.executeQuery("SELECT*FROM mahasiswa WHERE npm='"+textNPM.getText()+"'");
                if(rs.next()){
                    textNama.setText(rs.getString("nama_mhs"));
                    textTempat.setText(rs.getString("tempat_lahir"));
                    SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                    dateTanggal.setDate(dt.parse(rs.getString("tgl_lahir")));
                    comboJenis_Kelamin.setSelectedItem(String.valueOf(rs.getString("jenis_kelamin")));
                    textAlamat.setText(rs.getString("alamat"));
                    textNo_Telp.setText(rs.getString("no_telp"));
                }
            }
            else{
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
                String TGL =sdf.format(dateTanggal.getDate());
                String[] NK = {"npm","nama_mhs","tempat_lahir","tgl_lahir","Jenis_kelamin","alamat","no_telp"};
                String[] isinya ={textNPM.getText(),textNama.getText(),textTempat.getText(),TGL,String.valueOf(comboJenis_Kelamin.getSelectedItem()),textAlamat.getText(),textNo_Telp.getText()};
                new Konfigurasi().Simpan("mahasiswa", NK, isinya);

               new Konfigurasi().setTampilTabel(tableMhs,NamaKolom, SQL);
               new Konfigurasi().setLebarJudulKolom(tableMhs, LebarKolom);
               bersih();
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }

    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        try{

            if (
                (textNPM.getText().isEmpty()) && (textNama.getText().isEmpty()) && (textTempat.getText().isEmpty()) && (dateTanggal.getDate().equals(null)) && (textAlamat.getText().isEmpty()) &&  (textNo_Telp.getText().isEmpty()) && (comboJenis_Kelamin.getSelectedItem()==".: Pilih Data :.") ){
                JOptionPane.showMessageDialog(null,"Silahkan pilih data sebelum proses ubah");
                tableMhs.requestFocus();
            } else{
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
                String TGL =sdf.format(dateTanggal.getDate());
                String[] F = {"nama_mhs","tempat_lahir","tgl_lahir","Jenis_kelamin","alamat","no_telp"};
                String[] isinya ={textNama.getText(),textTempat.getText(),TGL,String.valueOf(comboJenis_Kelamin.getSelectedItem()),textAlamat.getText(),textNo_Telp.getText()};
                new Konfigurasi().Ubah("mahasiswa", "npm", textNPM.getText(), F, isinya);
                 
                new Konfigurasi().setTampilTabel(tableMhs,NamaKolom, SQL);
                new Konfigurasi().setLebarJudulKolom(tableMhs, LebarKolom);
                bersih();
            }
        } catch (Exception e) {
            System.out.print(e.toString());

    }//GEN-LAST:event_buttonUbahActionPerformed
    }
    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        try {
            if (
                (textNPM.getText().isEmpty()) &&(textNama.getText().isEmpty())&&(textTempat.getText().isEmpty())&& (dateTanggal.getDate().equals(null)) && (textAlamat.getText().isEmpty()) &&(textNo_Telp.getText().isEmpty())&&(comboJenis_Kelamin.getSelectedItem()==".:Pilih Data:.")) {
                JOptionPane.showMessageDialog(null,"Silahkan pilih data sebelum proses hapus ");
                tableMhs.requestFocus();
            } else{

                new Konfigurasi().Hapus("mahasiswa", "npm", textNPM.getText());
               new Konfigurasi().setTampilTabel(tableMhs,NamaKolom, SQL);
               new Konfigurasi().setLebarJudulKolom(tableMhs, LebarKolom);
                  bersih();   


            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void textCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyPressed

    }//GEN-LAST:event_textCariKeyPressed

    private void textCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyReleased
        String SQLCari ="SELECT*FROM mahasiswa WHERE npm LIKE '%"+textCari.getText()+"%' OR nama_mhs LIKE '%"+textCari.getText()+"%' ";
        new Konfigurasi().setJudulKolom(tableMhs, NamaKolom);
        new Konfigurasi().cariData(tableMhs, NamaKolom, SQLCari);
        new Konfigurasi().setLebarJudulKolom(tableMhs, LebarKolom);
    }//GEN-LAST:event_textCariKeyReleased

    private void textNo_TelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNo_TelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNo_TelpActionPerformed
       void bersih(){
            textNPM.setText("");
            textNama.setText("");
            textTempat.setText("");
            dateTanggal.setCalendar(null);
            comboJenis_Kelamin.setSelectedIndex(0);
            textAlamat.setText("");
            textNo_Telp.setText("");
       }
    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
bersih();

    }//GEN-LAST:event_buttonBatalActionPerformed

    private void tableMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMhsMouseClicked
        // TODO add your handling code here:
        

try {
int row = tableMhs.rowAtPoint(evt.getPoint());

String npm = tableMhs.getValueAt(row, 0).toString();
String nama = tableMhs.getValueAt(row, 1).toString();
String tempat = tableMhs.getValueAt(row, 2).toString();
String tanggal = tableMhs.getValueAt(row, 3).toString();
String jenis = tableMhs.getValueAt(row, 4).toString();
String alamat = tableMhs.getValueAt(row, 5).toString();
String telp = tableMhs.getValueAt(row, 6).toString();

textNPM.setText(String.valueOf(npm));
textNama.setText(String.valueOf(nama));
textTempat.setText(String.valueOf(tempat));
SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
dateTanggal.setDate(dt.parse(String.valueOf(tanggal)));

comboJenis_Kelamin.setSelectedItem(String.valueOf(jenis));
textAlamat.setText(String.valueOf(alamat));
textNo_Telp.setText(String.valueOf(telp));
} catch (Exception e) {
}
    }//GEN-LAST:event_tableMhsMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {


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
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {


                try {
                    new MahasiswaForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
      
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonCetak;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JComboBox<String> comboJenis_Kelamin;
    private com.toedter.calendar.JDateChooser dateTanggal;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableMhs;
    private javax.swing.JTextArea textAlamat;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textNPM;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNo_Telp;
    private javax.swing.JTextField textTempat;
    // End of variables declaration//GEN-END:variables
}