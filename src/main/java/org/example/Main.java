package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StudentDetails John = new StudentDetails();
        System.out.println("Student name is:" + John.stdName);
        System.out.println("Student age is:" + John.stdAge);
        System.out.println("Student average marks are:" + John.avgMarks);
        System.out.println("Is the student registered" + John.isReg);
    }
}
