/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rayhan_060423;
import java.util.Scanner;

public class BukuAlamatData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataAlamat dataAlamat = new DataAlamat();
        int pil;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    input.nextLine();
                    String nama = input.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    String alamat = input.nextLine();
                    System.out.print("Masukkan Nomor Telepon : ");
                    String nomorTelepon = input.nextLine();
                    System.out.print("Masukkan Email : ");
                    String email = input.nextLine();
                    BukuAlamat data = new BukuAlamat(nama, alamat, nomorTelepon, email);
                    dataAlamat.tambahData(data);
                    break;

                case 2:
                    System.out.print("Masukkan Index : ");
                    int index = input.nextInt();
                    dataAlamat.hapusData(index);
                    break;

                case 3:
                    dataAlamat.tampilkanData();
                    break;

                case 4:
                    System.out.print("Masukkan Index : ");
                    index = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    alamat = input.nextLine();
                    System.out.print("Masukkan Nomor Telepon : ");
                    nomorTelepon = input.nextLine();
                    System.out.print("Masukkan Email : ");
                    email = input.nextLine();
                    data = new BukuAlamat(nama, alamat, nomorTelepon, email);
                    dataAlamat.updateData(index, data);
                    break;

                case 5:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        } while (pil != 5);
    }
}
