   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalilul.model;

/**
 *
 * @author HP
 */
public class Anggota {
    private String kodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;
    
     public Anggota(){
        
    }
     
     public Anggota(String kodeAnggota,String namaAnggota, String alamat, String jenisKelamin){
       this.namaAnggota = namaAnggota;
       this.kodeAnggota = kodeAnggota;
       this.alamat = alamat;
       this.jenisKelamin= jenisKelamin;
     }
     
     //kode anggota
     public void setKodeAnggota(String kodeAnggota){
         this.kodeAnggota = kodeAnggota;
     }
     public String getKodeAnggota(){
         return kodeAnggota;
     }
     
     //nama anggota
      public void setNamaAnggota(String namaAnggota){
         this.namaAnggota = namaAnggota;
     }
     public String getNamaAnggota(){
         return namaAnggota;
     }
     
     // alamat
      public void setAlamat(String Alamat){
         this.alamat = alamat;
     }
     public String getAlamat(){
         return alamat;
     }
     
     // jenis kelamin
     public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

//    public void getAlamat() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//     
}


