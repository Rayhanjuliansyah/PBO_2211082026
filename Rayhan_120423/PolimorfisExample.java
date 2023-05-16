/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rayhan_120423;

/**
 *
 * @author AMIR
 */
public class PolimorfisExample {
    public static void main( String[] args )
{
    Person ref;
    Student student = new Student();
    Employee emp = new Employee();
    student.setName("BUDI");
    student.setAddress("PADANG");
    emp.setName("DONI");
    emp.setAddress("BUKITTINGI");
    ref = student;
    String temp = ref.getName(); 
    //System.out.println( temp );
    ref = emp; 
   String temp1 = ref.getName(); 
   // System.out.println( temp1 );
    printinformation(student);
    printinformation(emp);
 
 } 
    public static void printinformation( Person p){
        if(p instanceof Student){
            System.out.println("nama student :"+p.getName());
            System.out.println("alamat student :"+p.getAddress());
        }else if(p instanceof Employee){
            System.out.println("nama employee :"+p.getName());
            System.out.println("alamat employee :"+p.getAddress());
    }
}
}
