package org.example;

public class Car {
    private String color;
    private String brand;
    private String model;
    private int year;

    public Car(String _color, String _brand, String _model, int _year) {
        this.color = _color;
        this.brand = _brand;
        this.model = _model;
        this.year = _year;
    }
    public void display() {
        System.out.println("The color of this car is: " + color +"\n"+ "This car brand is: " + brand + "\n"+ "The model of this car is: " + model + "\n"+ "The year it was made: " + year);
    }
}
