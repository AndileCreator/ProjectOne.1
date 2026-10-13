package org.example;
//Create GradeCalculator and classify marks:
//Mark Grade
//80--100 Distinction 70--79 Merit 50--69 Pass 0--49 Fail Outside 0--100 Invalid mark
//Order conditions correctly so each mark receives one result.

public class GradeCalculator {
    private int marks;

    public GradeCalculator(int _marks){
        marks = _marks;
    }

    public void Outcome(){
        if (marks >= 80 && marks <= 100){
            System.out.println("Distinction");
        }
        else if (marks >= 70 && marks <= 79){
            System.out.println("Merit");
        }
        else if (marks >= 50 && marks <= 69){
            System.out.println("Pass");
        }
        else if (marks >= 0 && marks <= 49 ){
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
