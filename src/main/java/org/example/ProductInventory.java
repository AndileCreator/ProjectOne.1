package org.example;
//Exercise 4.3: Product inventory
//Create a Product class with product ID, name, price, and stock quantity.
//Add methods to display details, add stock, reduce stock after a sale, and calculate stock value (price * quantity).
//Do not allow sales that exceed available stock.

public class ProductInventory {
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    public ProductInventory(String _productId, String _productName, double _price, int _quantity) {
        this.productId = _productId;
        this.productName = _productName;
        this.price = _price;
        this.quantity = _quantity;
    }

    public void displayDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public void stock(){
        double stockValue = 0;
        int stock = 50;
        stock -= quantity;
        if (stock >= quantity){
            price = price * quantity;
            System.out.println("Stock value is worth: " + price);
        } else {
            System.out.println("Not enough stock");
        }

    }
}
