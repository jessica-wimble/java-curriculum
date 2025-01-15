package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Change the value of testString to match the pattern below
 * Change the value of testString to matches with the pattern below
 *
 * Try playing around with the regex, and extend the code inside of if(found) to print out all the matcher groups
 */
public class Patterns {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^([a-d]+)(cdef)$", Pattern.CASE_INSENSITIVE);
        String testString = "";

        Matcher match = pattern.matcher(testString);
        boolean found = match.find();
        if (found) {
            System.out.println("Match!");
        }
    }
}
