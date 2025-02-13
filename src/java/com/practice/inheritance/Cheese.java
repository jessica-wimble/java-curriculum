package com.practice.inheritance;

public class Cheese implements SuperMarketItem {

    private int maturedAge;

    public Cheese(int maturedAge){
        this.maturedAge = maturedAge;
    }

    @Override
    public double pricePerUnit() {
        return 4.0;
    }

    @Override
    public String name() {
        return "cheese";
    }

    public int maturedAgeInYears(){
        return this.maturedAge;
    }
}
