package org.example;
//Create ArrayStatistics.
// Use an array of at least six integers to find the largest value, smallest value, and number of elements.
//Challenge: Count how many values are greater than or equal to 50.

public class HighestAndLowestValues {
    int [] ArrayStatistics;

    public HighestAndLowestValues(int [] _ArrayStatistics) {
        this.ArrayStatistics = _ArrayStatistics;
    }

    public void highestValue() {
        int max = ArrayStatistics[0];
        for (int i = 1; i < ArrayStatistics.length; i++) {
            if (ArrayStatistics[i] > max) {
                max = ArrayStatistics[i];
            }
        }
        System.out.println(max);
    }
    public void lowestValue(){
        int min = ArrayStatistics[0];
        for (int i = 1; i < ArrayStatistics.length; i++) {
            if (ArrayStatistics[i] < min) {
                min = ArrayStatistics[i];
            }
        }
        System.out.println(min);
    }

    public void numOfElements(){
        int size = ArrayStatistics.length;
        System.out.println("The number of elements in this List: " + size);
    }

    public void numGreaterEqual(){
        int count = 0;
        for (int i = 0; i < ArrayStatistics.length; i++) {
            if  ( ArrayStatistics[i] >= 50){
                count++;
            }
        }
        System.out.println("The numbers that are greater or equal to 50 are: " + count);
    }
}
