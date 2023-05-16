/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rayhan_300323;

/**
 *
 * @author LABP1KOMP
 */
public class Aritmatika {

    public static int tambah(int a, int b) {
        return a + b;
    }

    public boolean cekganjil(int x) {
        return (x % 2 != 0);
    }

    /*    public void getganjil(int x) {
        for (int i = 0; i <= x * 2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
     */
    public int[] getganjil(int x) {
        int[] ganjil = new int[x]; // inisialisasi array dengan panjang x
        int a = 1;
        for (int i = 0; i < ganjil.length; i++) {
            ganjil[i] = a; // isi elemen array dengan angka ganjil
            a += 2;
        }
        return (ganjil);
    }
}
