package org.example;
//Exercise 3.1: Store student marks
//Create StudentMarks with an integer array of five marks.
//Print each mark using a loop, then calculate and display the total and average.
public class StoreStudentMarks {
    int [] marks;
    int sum;

    public StoreStudentMarks(int [] _marks) {
        marks = _marks;
    }
    public void StoredMarks(){
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    public void SumMarks(){
        for (int mark = 0; mark < marks.length; mark++) {
            sum += marks[mark];
        }
        System.out.println("The total student marks are: " + sum);
    }

    public void AvgMarks(){

        int avg = 0;
        avg = sum / 5;
        System.out.println("The avarage student mark is: " + avg);
    }
}
