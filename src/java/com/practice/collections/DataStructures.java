package com.practice.collections;

import com.practice.collections.data.Dog;

/**
 * 1. Create a new Dog array (Dog[]) containing all of the dogs below
 * 2. Create a new array list (ArrayList<Dog>) and add all the dogs to this list
 *
 * 3. print out the size of the dog array list
 * 4. print out the length of the dog array
 *
 * 5. retrieve the second element in the dog array
 * 6. retrieve the second element in the dog list
 *
 * 7. Create a new map containing all the dogs, where the key is the dog name and the value is the dog object
 * 8. Create a new set containing all the dogs.
 *
 * 9. What are the differences between an Array and an arraylist?
 *
 * 10. What is the difference between a set and a list?
 *
 * 11. What is the difference between List.of() and new ArrayList<>();
 * (hint, try creating a List<Dog> using the List.of() annotation, then try adding another dog to the list and see what happens)
 */

public class DataStructures {
    public static void main(String[] args){
        Dog dog1 = new Dog("Rufus", "Havanese", 4);
        Dog dog2 = new Dog("Colin", "Labrador", 10);
        Dog dog3 = new Dog("Tim", "Collie", 1);

    }
}
