/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rayhan_060423;
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    public BukuAlamat(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class DataAlamat {
    private BukuAlamat[] daftarAlamat;
    private int jumlahData;

    public DataAlamat() {
        daftarAlamat = new BukuAlamat[100];
        jumlahData = 0;
    }

    public void tambahData(BukuAlamat data) {
        if (jumlahData < 100) {
            daftarAlamat[jumlahData] = data;
            jumlahData++;
            System.out.println("Data berhasil ditambahkan");
        } else {
            System.out.println("Buku alamat sudah penuh");
        }
    }

    public void hapusData(int index) {
        if (index >= 0 && index < jumlahData) {
            for (int i = index; i < jumlahData - 1; i++) {
                daftarAlamat[i] = daftarAlamat[i+1];
            }
            jumlahData--;
            System.out.println("Data berhasil dihapus");
        } else {
            System.out.println("Index tidak valid");
        }
    }

    public void tampilkanData() {
        System.out.println("Daftar Buku Alamat");
        System.out.println("-------------------");
        for (int i = 0; i < jumlahData; i++) {
            BukuAlamat data = daftarAlamat[i];
            System.out.println("Nama: " + data.getNama());
            System.out.println("Alamat: " + data.getAlamat());
            System.out.println("Nomor Telepon: " + data.getNomorTelepon());
            System.out.println("Email: " + data.getEmail());
            System.out.println("-------------------");
        }
    }

    public void updateData(int index, BukuAlamat data) {
        if (index >= 0 && index < jumlahData) {
            daftarAlamat[index] = data;
            System.out.println("Data berhasil diupdate");
        } else {
            System.out.println("Index tidak valid");
        }
    }
}

