package com.knoldus.task6;

import java.util.LinkedList;

public class SwapElements{
    public static void main(String[] args) {

        //Creating a linkedList and adding elements to it
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println("Before swapping : " + numbers);

        // Swap the numbers in the list
        int number_second = numbers.get(1);
        int number_third = numbers.get(2);
        numbers.set(1, number_third);
        numbers.set(2, number_second);

        System.out.println("After swapping : " + numbers);

    }
}