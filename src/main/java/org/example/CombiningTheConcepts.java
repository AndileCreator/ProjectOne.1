package org.example;
//Exercise 5.1: Student results system
//Create a Student class with student number, name, and an array of three marks.
//Add methods to calculate the average, determine whether the student passed (average at least 50), and display a summary.
//In a separate main class, create at least three student objects, display their averages and results, count how many passed, and identify the student with the highest average.
//Validation: Marks must be between 0 and 100.

public class CombiningTheConcepts {
    private String stdName;
    private String stdNumber;
    int [] marks;

    public CombiningTheConcepts(String _stdName, String _stdNumber, int [] _marks) {
        this.stdName = _stdName;
        this.stdNumber = _stdNumber;
        this.marks = _marks;
    }

    public void calcAverage(){
        int sum = 0;
        int average = 0;
        for (int i = 0; i < marks.length; i++){
            sum += marks[i];
            average = sum/marks.length;
        }
        System.out.println("The average is " + average);
        if (average >= 50){
            System.out.println("Student Passed!!");
        }else{
            System.out.println("Student Failed!!");
        }
    }
    public void validation(){
    }
}
