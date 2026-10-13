package org.example;
//Exercise 3.1: Store student marks
//Create StudentMarks with an integer array of five marks.
//Print each mark using a loop, then calculate and display the total and average.
public class StoreStudentMarks {
    int [] marks;

    public StoreStudentMarks(int [] _marks) {
        marks = _marks;
    }
    public void StoredMarks(){
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

//    public void SumMarks(){
//        int i = 0;
//        for (int mark i = 0; i < mark.length; i++) {
//            i += marks[i];
//            System.out.println("Student total marks :" + marks);
//        }
//    }
}
