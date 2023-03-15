package com.knoldus.task12;
import java.util.LinkedList;

public class LinkedListImplementation {
        public static void main(String[] args)
        {
            LinkedList<Integer> numbers = new LinkedList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(4);
            numbers.add(3);

            System.out.println("The given list is: ");
            for(Integer index: numbers){
                System.out.print(index + " ");
            }

            System.out.println("\nPrinting first element by way one using peek: "+numbers.peek());
            System.out.println("\nPrinting first element by way two using peekFirst: "+numbers.peekFirst());
            System.out.println("\nPrinting first element by way three using getFirst: "+numbers.getFirst());

        }
    }
