package com.practice;

import com.practice.models.Cat;

/**
 * Look at the code below - when we call the increase age function, passing in cat, the ages of cat and cat2 are updated, can you explain why?
 * when we call the decrease age function, the ages of cat and cat2 in our main method remains the same - can you explain why?
 */
public class ObjectAssignment {

    public static void main(String[] args) {
        Cat cat = new Cat("Name", "breed", 12);
        Cat cat2 = cat;

        increaseAge(cat, 3);
        System.out.println("Cat current age: " + cat.getAge() + ", Cat2 current age: " + cat2.getAge());

        decreaseAge(cat, 5);
        System.out.println("Cat current age: " + cat.getAge() + ", Cat2 current age: " + cat2.getAge());

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));

    }

    public static void increaseAge(Cat cat, int yearsToAdd) {
        Cat olderCat = cat;
        olderCat.setAge(cat.getAge() + yearsToAdd);

        System.out.println("Cat age in increase age: " + cat.getAge());
    }

    public static void decreaseAge(Cat cat, int yearsToRemove) {
        cat = new Cat(cat.getName(), cat.getBreed(), cat.getAge() - yearsToRemove);

        System.out.println("Cat age in decrease age: " + cat.getAge());
    }
}
