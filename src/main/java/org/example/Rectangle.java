package org.example;
//Exercise 4.4: Rectangle
//Create a Rectangle class with width and height.
//Add methods for area (width * height) and perimeter (2 * (width + height)).
//Create two objects with different dimensions and display the results.

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double _width, double _height) {
        this.width = _width;
        this.height = _height;
    }

    public void area(){
        double area = width * height;
        System.out.println("Area of this rectangle: " + area);
    }

    public void perimeter(){
        double perimeter = width * height;
        System.out.println("Perimeter of this rectangle: " + perimeter);
    }
}
