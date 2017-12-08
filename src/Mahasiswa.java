/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author weare
 */
public class Mahasiswa {
    private Integer umur;
    private Boolean almameter = true;
    private String nama;
    private Integer nim = 12345;
    private Boolean pakaianBebas = true;
    private String tempatBelajar = "Kampus";
    
    public void penelitian () {        
        System.out.println("Mahasiswa melakukan penelitian");
    }
    public void demo () {
        System.out.println("Mahasiswa bisa demo");
    }
    public void setNama(String nama) {
        this.nama = nama; 
    }
    public String getNama() {
        return nama;
    }
     public void setUmur(int umur)    {
         this.umur = umur;
    }
     public int getUmur() {
         return umur;
    }
     public void setInfoMahasiswa(String nama, int umur) {
         this.nama = nama;
         this.umur = umur;
    }
     
   
     
            
    
    
}   
