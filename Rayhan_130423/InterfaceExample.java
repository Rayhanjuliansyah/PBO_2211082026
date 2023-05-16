/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rayhan_130423;

/**
 *
 * @author Rayhan
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        
        System.out.println("11 dan 12 "+
            myInteger.isEqual(10,11));
        System.out.println("10.4 dan 10.4 " +
                myDouble.isEqual(10.4,10.4));
    }
}
