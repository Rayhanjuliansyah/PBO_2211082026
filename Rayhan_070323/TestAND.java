/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rayhan_070323;

/**
 *
 * @author AMIR
 */
public class TestAND {
    public static void main(String[]args){
        int i = 0;
        int j = 10;
        boolean test = false;
        //demo&&
        test = (i > 10) && (j++ > 9); //jika yg pertama salah yg selanjutnya tidak dikerjakan
        System.out.println(i);
        System.out.println(j); 
        System.out.println(test);
        //demo&
        test = (i > 10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
