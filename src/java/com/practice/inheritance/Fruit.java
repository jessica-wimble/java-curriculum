package com.practice.inheritance;

public abstract class Fruit implements SuperMarketItem {

    private int daysToRipen;

    public Fruit(int daysToRipen){
        this.daysToRipen = daysToRipen;
    }

    public int getDaysToRipen() {
        return this.daysToRipen;
    }

}
