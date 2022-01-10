/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konfigurasi;

/**
 *
 * @author ASUS
 */
public class AmbilKRS {
    int sks;
    String kode,namaMakul;//,kelas;//, namaDosen; //kontakDosen;
   // boolean ambil;

    public AmbilKRS(String kode, String namaMakul,int sks){
        this.kode = kode;
        this.namaMakul = namaMakul;
        this.sks = sks;

    }

    public AmbilKRS(String string,String string0, int aInt, int aInt0){ //,String string0,int aInt3, int aInt4){ //String string1){//, int aInt1, int aInt2) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaMakul() {
        return namaMakul;
    }

    public void setNamaMakul(String namaMakul) {
        this.namaMakul = namaMakul;
    }

    public int getSKS() {
        return sks;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }

//    public String getKelas() {
//        return kelas;
//    }
//
//    public void setKelas(String kelas) {
//        this.kelas = kelas;
//    }
//    public boolean isAmbil() {
//        return ambil;
//    }
//
//    public void setAmbil(boolean ambil) {
//        this.ambil = ambil;
//    }

//    public String getKontakDosen() {
//        return kontakDosen;
//    }
//
//    public void setKontakDosen(String kontakDosen) {
//        this.kontakDosen = kontakDosen;
//    }
//
//    public boolean isAktif() {
//        return aktif;
//    }
//
//    public void setAktif(boolean aktif) {
//        this.aktif = aktif;
//    }

//    public Object getAngka() {
//        
//        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//
}
