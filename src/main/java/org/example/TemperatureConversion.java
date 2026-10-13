package org.example;
//Exercise 1.3: Temperature conversion
//Create TemperatureConverter. Convert Celsius to Fahrenheit using:
//FAHRENHEIT = (CELSIUS * 9 / 5) + 32
//Display both values. Challenge: Convert Fahrenheit back to Celsius.

public class TemperatureConversion {
    private int FAHRENHEIT;
    private int CELSIUS;

    public TemperatureConversion(int _FAHRENHEIT, int _CELSIUS) {
        FAHRENHEIT = _FAHRENHEIT;
        CELSIUS = _CELSIUS;
    }

    public void fa(){
        FAHRENHEIT = (CELSIUS * 9 / 5) + 32;
        System.out.println("Fahrenheit is: " + FAHRENHEIT);
    }
    public void ce(){
        CELSIUS = ((FAHRENHEIT - 32) * 5) / 9;
        System.out.println("Celsius is: " + CELSIUS);
    }
}
