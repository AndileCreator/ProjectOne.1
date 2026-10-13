package org.example;
//Exercise 2.1: Pass or fail
//Create PassOrFail. If a mark is 50 or higher, display Pass; otherwise, display Fail.
//Challenge: Reject marks below 0 or above 100.

public class PassOrFail {
    private int marks;

    public PassOrFail(int _marks){
        marks= _marks;
    }

    public void Pass(){
        if (marks >= 50){
        System.out.println("Pass");
        }
    }
    public void Fail(){
        if (marks < 50){
            System.out.println("Fail");
        }
    }
    public void Invalid(){
        if (marks < 0 || marks > 100){
            System.out.println("Invalid");
        }
    }
}
