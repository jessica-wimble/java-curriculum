package com.practice.collections;

import com.practice.models.Car;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Override the equals method so that car and car2 return equals.
 *
 * What is a set?
 *
 * Create a new hash set with car and car2, how many items do you expect in the set?
 *
 * Create a new hash map with a car as the key and a string value as the value
 *
 * Override the hashcode of car and see if the results are different
 */
public class HashSetsAndMaps {

    public static void main(String[] args){
        Car car = new Car("ford", 3);
        Car car2 = new Car("ford", 3);

        Set<Car> carSet = new HashSet<>();


        HashMap<Car, String> carHashMap = new HashMap<>();

    }
}
