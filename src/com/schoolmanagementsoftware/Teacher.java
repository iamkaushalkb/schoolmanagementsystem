package com.schoolmanagementsoftware;
/*
 This Class helps to keep
 track of teacher like name, salary.
*/
public class Teacher {

    // Instance variables with private access modifiers
    // Using Private access modifiers for privacy purposes
    private int id;
    private String name;
    private int salary;

    // Constructor to create new Teacher object by initializing
    // Id represents the unique value of teacher
    // Name represents the name of the teacher
    // Salary represent the salary of teacher
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Returning ID of Teacher
    public int getId(){
        return id;
    }

    // Returning NAME of Teacher
    public String getName(){
        return  name;
    }

    // Returning Salary of Teacher
    public int getSalary(){
        return  salary;
    }

    // Setting Salary Entry
    // Parameter salary is the salary received by Teacher
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
