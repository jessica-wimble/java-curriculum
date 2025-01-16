package com.practice;

import com.practice.models.Cat;

/**
 * 1. why does cat.equals(cat2) evaluate to false?
 * 2. why does cat == cat2 evaluate to false?
 * 3. why does cat3 == cat2 evaluate to true;
 * 3. override the equals method in Cat, such that cat.equals(cat2) is true according to the equality of the properties of cat
 * 4. Change a property of one of the cat or cat2 and verify cat.equals(cat2) not longer returns true
 * 5. why should we also override the hashcode when we override equals?
 */
public class Equality {

    public static void main(String[] args){
        Cat cat = new Cat("Josie", "tabby", 3);
        Cat cat2 = new Cat("Josie", "tabby", 3);
        Cat cat3 = cat2;

        System.out.println(cat.equals(cat2));
        System.out.println(cat == cat2);
        System.out.println(cat3 == cat2);
    }
}
