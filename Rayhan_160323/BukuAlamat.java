/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rayhan_160323;

/**
 *
 * @author Lenovo
 */
public class BukuAlamat {
    public static void main( String[] args ){ 
        String [][]entry = {{"Florence", "735-1234", "Manila"},
                        {"Joyce", "983-3333", "Quezon City"},
                        {"Becca", "456-3322", "Manila"}};
        int n=0,m=0;
        for(m=0;m<entry.length;m++){
            System.out.println("Name  : "+entry[m][n]);
            System.out.println("Tel #       : "+entry[m][n+1]);
            System.out.println("Address     : "+entry[m][n+2]);
            System.out.println("");
        }
        
    }
}
