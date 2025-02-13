package com.practice.inheritance;

public class Apple extends Fruit {

    public Apple(int daysToRipen) {
        super(daysToRipen);
    }

    @Override
    public double pricePerUnit() {
        return 0.40;
    }

    @Override
    public String name() {
        return "apple";
    }
}
