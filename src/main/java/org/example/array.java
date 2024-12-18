package org.example;

import java.util.Scanner;

public class array {
    public static void main(String args[]){
int sum ;
int[] myArr = new int[3] ;
System.out.println("Welcome to your array ");
System.out.println("Enter element #1 ");
        Scanner sc = new Scanner(System.in) ;
        myArr[0]= Integer.parseInt(sc.next());
System.out.println("Enter element #2");
Scanner sc1 =new Scanner(System.in) ;
myArr[1]= Integer.parseInt(sc1.next()) ;
System.out.println("Enter element #3");
Scanner sc2 =new Scanner(System.in) ;
myArr[2]= Integer.parseInt(sc2.next()) ;

sum = myArr[0] +myArr[1]+myArr[2];
System.out.println("The total is = "+sum);




    }



}
