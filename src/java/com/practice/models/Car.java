package com.practice.models;

public class Car {

    private String make;
    private int age;

    public Car(String make, int age){
        this.make = make;
        this.age = age;
    }

    public String getMake() {
        return make;
    }

    public int getAge() {
        return age;
    }

}
