/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehan2026.model;

/**
 *
 * @author asus
 */
public class Peminjaman {
    private String nobp;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;
    
    public Peminjaman(){
    
    }
    public Peminjaman(String nobp, String kodeBuku, String tglPinjam, String tglKembali){
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }
    
}
