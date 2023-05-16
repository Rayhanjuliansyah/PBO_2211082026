/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rayhan_080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author AMIR
 */
public class nilai {
     public static void main(String[] args){
         BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
         String name ="";
         int number =0;
         try{
             System.out.print("please enter hallo:");
             name = dataIn.readLine();
             System.out.print("number :");
             number = Integer.parseInt(dataIn.readLine());
            }catch( IOException e ){
             System.out.println("ERROR!");
         }
         System.out.println("String "+name+" !");
         
         
     }
}
