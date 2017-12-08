/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author weare
 */
public class Profile {
    int a,b,c;
    String nama="satu";
    int umur;
    String jenisKelamin;
    Boolean mahasiswa;
    int tinggi;
    int berat;
    Boolean rambutHitam;
    String alamat;
    
//    public Profile(String nama) {
//        this.nama = nama;
//        
//    }

    public void setNama(String nama) {
        this.nama = nama;
   }
    public String getNama() {
        return "Nama saya adalah "+ nama;
   }
    public void setUmur(int umur) {
        this.umur = umur;
   }
    public int getUmur() {
        return umur;
    }
    public void setProfile(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public void setPendidikan(Boolean mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    public Boolean getPendidikan() {
        return mahasiswa;
    }
    public void setJenisKelamin(String jenisKelaminku) {
        this.jenisKelamin = jenisKelaminku;
    }
    public String getJK() {
        return jenisKelamin;
        
    }
           
}
