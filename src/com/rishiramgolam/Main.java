package com.rishiramgolam;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> mylist = new LinkedList<String>();
        mylist.add("one");
        mylist.add("two");
        mylist.add("three");
        mylist.add("four");
        mylist.add("five");
        mylist.add("six");
        mylist.add("seven");

        for (String item: mylist) {
            System.out.println(item);
        }

        System.out.println("==============================");
        ListIterator<String> myIter = mylist.listIterator();

        Scanner s = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        while (!quit) {
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    // next
                    if (forward && myIter.hasNext()) {
                        System.out.println(myIter.next());
                        forward = true;
                    } else {
                        myIter.next();
                        System.out.println(myIter.next());
                        forward = true;
                    }
                    break;
                case 2:
                    // previous
                    if (forward && myIter.hasPrevious()) {
                        myIter.previous();
                        System.out.println(myIter.previous());
                        forward = false;
                    } else {
                        System.out.println(myIter.previous());
                        forward = false;
                    }
                    break;
                default:
                    quit = true;
                    break;
            }


        }
    }
}
