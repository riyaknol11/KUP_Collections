package com.knoldus.task2;
import java.util.ArrayList;

public class ReplaceListObjects {
        public static void main(String[] args) {

            // Create an ArrayList with 5 objects
            ArrayList<String> nameList = new ArrayList<>();
            nameList.add("Riya");
            nameList.add("Jasleen");
            nameList.add("Sahil");
            nameList.add("John");
            nameList.add("Aayush");


            // Replace all elements with one new object
            String groupName = "Globalites";

            for (int index = 0; index < nameList.size(); index++) {
                nameList.set(index, groupName);
            }

            for (String name : nameList) {
                System.out.println(name);
            }

        }

    }
