package com.practice.inheritance;

/**
 * Create apple, cheese, pizza and orange objects.
 *
 * Add them all to a list, and loop through the list and print out their name and price per unit
 */

public class SuperMarketStore {

    public static void main(String[] args) {
        Apple apple = new Apple(7);
        Cheese cheese = new Cheese(40);
        Pizza pizza = new Pizza("pepperoni");
        Orange orange = new Orange(3, "Spain");


    }

}
