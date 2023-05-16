/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rayhan_120423;

/**
 *
 * @author Rayhan
 */
public class StudentRecordExample {
    public static void main(String[] args){
          StudentRecordExam student = new StudentRecordExam();
          System.out.println("nama  :"+student.getName());
          System.out.println("alamat  :"+student.getAddress());
          System.out.println("umur  :"+student.getAge());
          System.out.println("nilai mtk  :"+student.getMathGrade());
          System.out.println("nilai sains  :"+student.getScienceGrade());
          System.out.println("average  :"+student.getAverage());
      }
}
