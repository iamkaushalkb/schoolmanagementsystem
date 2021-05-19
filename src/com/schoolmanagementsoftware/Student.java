package com.schoolmanagementsoftware;
/*
 This Class helps to keep
 track of students like fees details, name, grades.
*/
public class Student {

    // Instance variables with private access modifiers
    // Using Private access modifiers for privacy purposes
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // Constructor to create new Student object by initializing
    // Id represents the unique value of students
    // Name represents the name of the students
    // Grade represents the standard level of students
    // Considering the fees for every students is $30,000
    // Considering the initial fee paid is 0
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not Altering the students name, id
    // Altering Students grade
    // Parameter Grade is the new Grade of Student
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Updating feesPaid Entry
    // Parameter fees is the fees paid by Student
    public void updateFeesPaid(int fees){
        // Continuously Adding Fees after being paid every time
        feesPaid+=fees;
    }

    // Using Getter
    // Returning ID of student
    public int getId(){
        return id;
    }

    // Returning NAME of student
    public String getName(){
        return  name;
    }

    // Returning feesPaid of student
    public int getFeesPaid(){
        return  feesPaid;
    }

    // Returning feesTotal of student
    public int getFeesTotal(){
        return  feesTotal;
    }
}