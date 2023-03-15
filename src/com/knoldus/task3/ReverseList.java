package com.knoldus.task3;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList{
    public static void main(String[] args) {

        // Create an ArrayList with 5 objects
        ArrayList<Integer> reversedList = new ArrayList<>();
        reversedList.add(10);
        reversedList.add(20);
        reversedList.add(30);
        reversedList.add(40);
        reversedList.add(50);

        System.out.println("Original List: "+ reversedList);

        // Using the reverse function of collection
        Collections.reverse(reversedList);

        System.out.println("Reversed List"+ reversedList);
    }
}