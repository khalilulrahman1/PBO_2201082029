/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalilul.model;

/**
 *
 * @author HP
 */
public class Buku {
    private String KodeBuku;
    private String Judul;
    private String Pengarang;
    private String Penerbit;

    public Buku() {
    }

    public Buku(String KodeBuku, String Judul, String Pengarang, String Penerbit) {
        this.KodeBuku = KodeBuku;
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
    }

    public String getKodeBuku() {
        return KodeBuku;
    }

    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }
    
    
}
