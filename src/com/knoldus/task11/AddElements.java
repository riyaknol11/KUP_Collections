package com.knoldus.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddElements{
        public static void main(String [] args){

            List<String> names = new ArrayList<String>();
            names.add("Riya");
            names.add("Jasleen");
            names.add("Sahil");
            System.out.println("List before adding the elements : ");
            for (String index: names){
                System.out.print(index + " ");
            }
            Collections.addAll(names,"John","Mary");
            System.out.println("\nAfter adding elements:");
            for (String index: names){
                System.out.print(index+" ");
            }

        }
    }

