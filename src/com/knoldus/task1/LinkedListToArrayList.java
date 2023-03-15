package com.knoldus.task1;

import java.util.LinkedList;

public class LinkedListToArrayList {
    public static void main(String[] args) {

        // Creating a LinkedList with 5 objects
        LinkedList<String> studioList = new LinkedList<>();
        studioList.add("Java");
        studioList.add("Scala");
        studioList.add("DevOps");
        studioList.add("Test Automation");
        studioList.add("AI");

        // Converting the LinkedList to an Array
        String[] student_array = studioList.toArray(new String[0]);


        for (String studio : studioList) {
            System.out.println(studio);
        }
    }
}