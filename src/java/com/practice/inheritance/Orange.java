package com.practice.inheritance;

public class Orange extends Fruit {

    private String grownInCountry;

    public Orange(int daysToRipen, String grownInCountry){
        super(daysToRipen);
        this.grownInCountry = grownInCountry;
    }

    @Override
    public double pricePerUnit() {
        return 0.80;
    }

    @Override
    public String name() {
        return "orange";
    }

    public String getGrownInCountry(){
        return this.grownInCountry;
    }
}
