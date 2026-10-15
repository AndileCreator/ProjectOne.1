package org.example;
//Exercise 3.4: Separate even and odd numbers
//Create EvenOddArray.
//Count the even and odd values in an integer array.
//Challenge: Store the even and odd values in separate arrays or lists.

public class SeparateEvenAndOddNumbers {
    private int [] EvenOddArray;
    private int oddNumbers;
    private int evenNumbers;
    private int [] oddNumbersArray;
    private int [] evenNumbersArray;


    public SeparateEvenAndOddNumbers(int [] _EvenOddArray) {
        EvenOddArray = _EvenOddArray;
    }

    public void searchEvenOddNumbers() {
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int i = 0; i < EvenOddArray.length; i++) {
            if (EvenOddArray[i] % 2 == 0) {
                evenNumbers++;
            }else{
                oddNumbers++;
            }
        }
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
        System.out.println("Number of even numbers in this list are: " + evenNumbers);
        System.out.println("OddNumbers of odd numbers in this list are: " + oddNumbers);
    }
    public void sortingArray() {
        int [] evenNumbersArray = new int [evenNumbers];
        int [] oddNumbersArray = new int [oddNumbers];
        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int i = 0; i < EvenOddArray.length; i++) {
            if (EvenOddArray[i] % 2 == 0) {
                evenNumbersArray[evenNumbers++] =  EvenOddArray[i];
//                evenNumbers++;
            } else {
                oddNumbersArray[oddNumbers++] =  EvenOddArray[i];
//                oddNumbers++;
            }
        }
        System.out.println("List for even numbers: " + evenNumbersArray );
        System.out.println("List for odd numbers: " + oddNumbersArray);
    }
}
