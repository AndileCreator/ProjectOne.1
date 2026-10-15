package org.example;
//Exercise 3.3: Search an array
//Create ArraySearch. Search an integer array for a target value.
//Display its index if found, or Value not found otherwise.
//Challenge: Report every matching index if the target appears more than once.

public class SearchAnArray {
    int [] ArraySearch;
    int target;
    boolean found = false;

    public SearchAnArray(int [] _ArraySearch, int _target) {
        this.ArraySearch = _ArraySearch;
        this.target = _target;
    }
    public void targetValueIndex(){
        int i = 0;
        while (i < ArraySearch.length) {
            if (ArraySearch[i] == target) {
                System.out.println("Target found at Index: " + i);
                found = true;
            }
            i++;
        }
        if (!found) {
            System.out.println("Value not found");
        }
    }
    public void foundTimes(){
        int times = 0;
        for (int i = 0; i < ArraySearch.length; i++) {
            if (ArraySearch[i] == target) {
                times++;
            }
        }
        System.out.println("The target value was found " + times + " times");
    }
}
