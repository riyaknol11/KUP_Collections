package com.knoldus.task7;
import java.util.ArrayList;

public class CloneArrayList {
        public static void main(String[] args) {
            ArrayList<Integer> originalList = new ArrayList<>();
            originalList.add(1);
            originalList.add(2);
            originalList.add(4);
            originalList.add(6);

            //Printing original list using foreach loop
            System.out.println("Original array elements are : ");
            for (Integer list: originalList) {
                System.out.println(list);
            }

            // Using clone() method
            ArrayList<Integer> cloneList = (ArrayList<Integer>) originalList.clone();

           //Printing the cloned array using foreach loop
            System.out.println("Cloned array elements are : ");
            for (Integer list: cloneList) {
            System.out.println(list);
        }
    }
}
