/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rayhan_160323;
import javax.swing.*;
/**
 *
 * @author maita
 */
public class NomorTerbesar_JoptionPane {
    public static void main(String [] args){
    int[] a = new int[11];
    String[] n = new String[11];
        int terbesar = 0;
        for(int i=1;i+1<=a.length;i++)
        {
            System.out.print(i+") "); //menampilkan array ke
            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-"+i+" :");
            a[i] = Integer.parseInt(n[i]);
            if(terbesar>a[i]){
                terbesar=terbesar;
                System.out.println(a[i]); //menampilkan terbesar dicommandline
            }
            else{
                terbesar=a[i];
                System.out.println(terbesar); //menampilkan terbesar di commandline
            }
        }
        String hasil="Terbesar adalah "+terbesar;

        JOptionPane.showMessageDialog(null,hasil); 
    }
}