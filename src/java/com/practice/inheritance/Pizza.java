package com.practice.inheritance;

public class Pizza implements SuperMarketItem {

    private String topping;

    public Pizza(String topping){
        this.topping = topping;
    }

    @Override
    public double pricePerUnit() {
        return 2.30;
    }

    @Override
    public String name() {
        return "pizza";
    }

    public String getTopping(){
        return this.topping;
    }
}
