package com.knoldus.task9;

import java.util.Collections;
import java.util.LinkedList;
public class ShuffleElements {
    public static void main(String[] args)
    {
        LinkedList<Integer> shuffledList = new LinkedList<>();
        shuffledList.add(10);
        shuffledList.add(9);
        shuffledList.add(14);
        shuffledList.add(8);
        shuffledList.add(16);
        shuffledList.add(1);

        System.out.println("The list before shuffling elements: ");
        for(Integer list : shuffledList){
            System.out.print(list +" ");
        }
        Collections.shuffle(shuffledList);
        System.out.println("\nThe list after shuffling elements: ");
        for(Integer list: shuffledList)
        {
            System.out.print(list +" ");
        }
    }
}