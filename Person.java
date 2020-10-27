package com.sarmale;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int weight = 0;
    private int length = 0;
    private int height = 0;

//    Now a person object has object variables name and birthday. The variable name is a string, which itself is an object; the variable birthday is a SimpleDate object.
//    Both variables contain a reference to an object. Therefore a person object contains two references.

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person(String name) {
        this(name, 0, 0, 0);
    }
//
//    public Person(String name, int age, int height, int weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.height = height;
//    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }


    public int getHeight() {
        return this.height;
    }

//    public void growOlder() {
//        this.age = this.age + 1;
//    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

//    public double bodyMassIndex() {
//        double heightPerHundred = this.height / 100.0;
//        return this.weight / (heightPerHundred * heightPerHundred);
//    }



    public String toString() {
        return this.name + ", born on " + this.birthday;
    }

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        System.out.println(muhammad);
        System.out.println(pascal);
    }

}

