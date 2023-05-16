/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rayhan_160323;

/**
 *
 * @author LABP1KOMP
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NomorTerbesar_BufferedReader {
    public static void main( String[] args ){ 
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[11];
        int terbesar = 0;
        for(int i=1;i+1<=a.length;i++){
            try {
                System.out.print("nomor "+i+" : ");
                a[i] = Integer.parseInt(dataIn.readLine());
                if(terbesar>a[i]){
                      terbesar=terbesar;
                }
                else{
                    terbesar = a[i];
                }
            }
            catch (IOException e) {
                System.out.println("Error!");
            }
        }
        System.out.println("Nomor terbesar adalah "+terbesar);
    }
}  