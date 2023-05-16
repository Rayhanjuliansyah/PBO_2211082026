/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rayhan_120423;

/**
 *
 * @author Rayhan
 */
public class StudentRecord {
    protected String name;
    protected String address;
    protected int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average;
    protected  static int studentCount;
     
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address =address;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age =age;
    }
    public double getMathGrade(){
        return mathGrade;
    }
    public void setMethGrade(double mathGrade){
        this.mathGrade =mathGrade;
    } public double getEnglishGrade(){
        return englishGrade;
    }
    public void setEnglishGrade(double englishGrade){
        this.englishGrade =englishGrade;
    } public double getScienceGrade(){
        return scienceGrade;
    }
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade =scienceGrade;
    }
     public double getAverage(){
        return average;
    }
    
}
