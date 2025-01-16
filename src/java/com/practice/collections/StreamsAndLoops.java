package com.practice.collections;

import com.practice.models.Dog;

import java.util.List;

/**
 * 1. Create a list of all the dogs
 * 2. Write code to filter the list to obtain a new list containing only labrador dogs using a for loop
 * 3. Rewrite step 2 using a stream
 * 4. Add to the stream to also only return labradors with age > 5
 * 5. Convert the original list into a map <String, Dog> where string = dog name, using a stream
 * 6. Write a method that takes in a list of dogs, and returns true if any of the dogs are a Collie (use a stream)
 * 7. write another method that takes in a list of dogs and a name, and returns the first dog matching that name (use a stream)
 */
public class StreamsAndLoops {

    public static void main(String[] args){
        Dog dog1 = new Dog("Rufus", "Havanese", 4);
        Dog dog2 = new Dog("Sam", "Labrador", 16);
        Dog dog3 = new Dog("Colin", "Labrador", 10);
        Dog dog4 = new Dog("Tim", "Collie", 1);
        Dog dog5 = new Dog("Paula", "Labrador", 3);

        List<Dog> dogs = null;

    }
}
