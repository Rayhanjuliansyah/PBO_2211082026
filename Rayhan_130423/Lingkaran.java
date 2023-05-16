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
public class Lingkaran implements Relation {

    private double radius;

    public Lingkaran() {
        radius = 0;
    }

    public Lingkaran(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getLuas() {
        return Math.PI * radius * radius;
    }

    public boolean isGreater(Object a, Object b) {
        Lingkaran A = (Lingkaran) a;
        Lingkaran B = (Lingkaran) b;
        return A.getRadius() > B.getRadius();
    }

    public boolean isLess(Object a, Object b) {
        Lingkaran A = (Lingkaran) a;
        Lingkaran B = (Lingkaran) b;
        return A.getRadius() < B.getRadius();

    }

    public boolean isEqual(Object a, Object b) {
        Lingkaran A = (Lingkaran) a;
        Lingkaran B = (Lingkaran) b;
        return A.getRadius() == B.getRadius();
    }

}
