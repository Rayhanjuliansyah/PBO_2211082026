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
public class Hari {
    public static void main(String[] args){
        
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday", "Saturday"};
        
        System.out.println("===For Loop===");
        for(int i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }
        
        System.out.println("\n===Do While Loop===");
        int k = 0;
        do{
            System.out.println(days[k]);
            k++;
        }while (k<days.length);
        
        System.out.println("\n===While Loop===");
        int j = 0;
        while(j<days.length){
            System.out.println(days[j]);
            j++;
        }
    }
    
}
