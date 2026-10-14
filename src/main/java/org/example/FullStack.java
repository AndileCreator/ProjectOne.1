package org.example;

public class FullStack {
    private String name;
    private int age;
    private String gender;
    private boolean isEmployed;

    public FullStack(String _name, int _age, String _gender) {
        this.name = _name;
        this.age = _age;
        this.gender = _gender;
        this.isEmployed = false;
    }

    public void showDetails() {
        System.out.println("The name of the student is: " + this.name + "\n" + "The age of the student: " + this.age + "\n" + "This student is a: " +  this.gender + "\n" + "Is this student employed?: " + this.isEmployed);
    }
}
