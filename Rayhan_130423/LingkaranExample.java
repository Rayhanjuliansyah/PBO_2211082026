/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rayhan_130423;

/**
 *
 * @author Rayhan
 */
public class LingkaranExample {

    public static void main(String[] args) {

        Relation myLingkaran = (Relation) new Lingkaran();
        Lingkaran l1 = new Lingkaran(14);
        Lingkaran l2 = new Lingkaran(21);
        boolean isGreator = myLingkaran.isGreater(l1, l2);
        boolean isLess = myLingkaran.isLess(l1, l2);
        boolean isEqual = myLingkaran.isEqual(l1, l2);

        System.out.println("Lingkaran A > B " + isGreator + "\n"
                + "Lingkaran A > B " + isLess + "\n"
                + "Lingkaran A = B " + isEqual);
    }

}
