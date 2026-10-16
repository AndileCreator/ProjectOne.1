package org.example;
//Exercise 4.1: Student class
//Create a Student class with name (String), studentNumber (String), and mark (double).
//Add a constructor, displayDetails(), and hasPassed() which returns true when the mark is at least 50.
//In StudentApp, create at least two Student objects and call their methods.

public class StudentClass {
    private String name;
    private String studentNumber;
    private double mark;
    private boolean passed = false;

    public StudentClass(String _name, String _studentNumber, double _mark) {
        this.name = _name;
        this.studentNumber = _studentNumber;
        this.mark = _mark;
    }

    public void displayDetails() {
        System.out.println("Student name is: " + this.name);
        System.out.println("Student Number is: " + this.studentNumber);
        System.out.println("Mark scored by student: " + this.mark);
    }

    public void hasPassed() {
        if (mark >= 50){
            this.passed = true;
            System.out.println("This has student Passed!");
        }else {
            System.out.println("This has student Failed!");
        }
    }
}
