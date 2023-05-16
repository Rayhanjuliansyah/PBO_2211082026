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
public class LineExample {

    public static void main(String[] args) {

        Relation myLine = new Line();
        Line line1 = new Line(2, 5, 4, 7);
        Line line2 = new Line(2, 5, 2, 2);
        boolean lineA_lineB = myLine.isGreater(line1, line2);

        System.out.println("Line A > B " + lineA_lineB);
    }
}
