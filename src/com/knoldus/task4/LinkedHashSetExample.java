package com.knoldus.task4;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // Create a LinkedHashSet with some elements
        LinkedHashSet<String> nameSet = new LinkedHashSet<>();
        nameSet.add("John");
        nameSet.add("Riya");
        nameSet.add("Jasleen");
        nameSet.add("Mary");
        nameSet.add("Sahil");

        System.out.println( "Original set of name is : "+ nameSet);

        // Removing an element from the set
        nameSet.remove("Mary");

        System.out.println("New name set after removal of one element is : " + nameSet);
    }
}