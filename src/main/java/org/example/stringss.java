package org.example;

import java.util.Scanner;

public class stringss {
    public static void main(String args[]) {
        System.out.println("Enter your First word");
        Scanner sc1 = new Scanner(System.in);
        String Word1 = new String(sc1.next());
        System.out.println("ENter you Second Word");
        Scanner sc2 = new Scanner(System.in);
        String Word2 = new String(sc2.next());

        if (Word1.equalsIgnoreCase(Word2)) {
            System.out.println("The Two Words are Identical ");
        } else {
            System.out.println("The Two Words are NOT Identical ");

        }

        System.out.println("The second program");

        System.out.println("Enter your First word");
        Scanner sc3 = new Scanner(System.in);
        String Word3 = new String(sc1.next());
        System.out.println("Enter your First word");
        Scanner sc4 = new Scanner(System.in);
        String Word4 = new String(sc1.next());
        if (Word3.contains(Word4)) {
            System.out.println("The Two Words are parts from each other ");
        }
        else
        {
            System.out.println("The two words are not a oart from each other ");
        }
    }
}