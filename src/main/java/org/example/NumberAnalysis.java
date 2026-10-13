package org.example;
//Create NumberAnalysis.
// Determine whether an integer is positive, negative, or zero, and whether it is even or odd.
// Remember that zero is even.

public class NumberAnalysis {
    private int number;

    public NumberAnalysis(int _number) {
        number = _number;
    }

    public void Check(){
        if (number > 0){
            System.out.println("Positive integer");
        }
        else if  (number < 0){
            System.out.println("Negative integer");
        }
        else {
            System.out.println("Zero");
        }
    }

    public void OddEven(){
        if (number % 2 == 0){
            System.out.println("Even number");
        }
        else if  (number % 2 == 1){
            System.out.println("Odd number");
        }
    }
}
