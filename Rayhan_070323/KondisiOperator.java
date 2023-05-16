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
public class KondisiOperator {
    public static void main (String[] args){
        
        String status = "";
        int grade = 80;
        
        status = (grade >= 60)?"Passed":"Fail";
        
        System.out.println(status);
    }
}
