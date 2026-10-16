package org.example;
//Exercise 3.5: Reverse an array
//Create ReverseArray.
//Display the array in reverse order without changing the original array.
//Challenge: Reverse the array in place by swapping elements.

import java.util.Arrays;

public class ReverseAnArray {
    private int [] unReversedArray;
    private int [] reversedArray;

    public ReverseAnArray(int [] _UnReversedArray) {
        this.unReversedArray = _UnReversedArray;
    }

    public void reverse() {
        int[] _UnReversedArray = new int[0];
        int [] reversedArray = new int [_UnReversedArray.length];
        for (int i = 0; i < _UnReversedArray.length; i++) {
            reversedArray[i] = _UnReversedArray[_UnReversedArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
