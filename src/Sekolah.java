/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author weare
 */
public class Sekolah extends Profile {
    String wali;
    String kelas;
    String nis;

//    public Sekolah(String nama) {
//        super(nama);
//    }

   
   

    public String getWali() {
        return wali;
    }

    public void setWali(String wali) {
        this.wali = wali;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
   }
    
}
