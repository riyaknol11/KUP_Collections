package com.knoldus.task13;
import java.util.*;
public class MinimumElement {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(10);
            list.add(5);
            list.add(20);
            list.add(3);
            list.add(15);

            System.out.println("The list is : " + list);
            //Collections.min() returns the minimum element in a collection.
            Integer min = Collections.min(list);
            System.out.println("Minimum element in the list is: " + min);
        }
    }

