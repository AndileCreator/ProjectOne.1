package org.example;
//Exercise 1.2: Shopping total
//Create ShoppingTotal. Store a product name, unit price, and quantity. Calculate and display the total cost.
//Challenge: Apply a discount percentage and display the final amount.

public class ShoppingTotal {
    private String pdName;
    private double unitPrice;
    private int quantity;
    private double cost;
    private double totCost;
    private double percentage;

    public ShoppingTotal(String _pdName, double _unitPrice, int _quantity, double _percentage) {
        pdName = _pdName;
        unitPrice = _unitPrice;
        quantity = _quantity;
        percentage = _percentage;
    }
    public void cost() {
        cost = unitPrice * quantity;
    }

    public void totalCost() {
        cost();
        totCost = cost - (cost * percentage);
        System.out.println("Total Cost is: " + "R" + totCost);
    }
}
