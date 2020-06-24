package com.company.lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i;

        System.out.println("Enter some number bigger than 9: ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        for (i = n; i != 0; i--) {
            if (i%2 == 0) {
                int allEven = i;
                ArrayList<Integer> myEvenNumbers = new ArrayList<Integer>();
                myEvenNumbers.add(i);
                allEven += i;
                System.out.println(allEven);
                for (int even : myEvenNumbers) {
                   // System.out.println(even);

                }
            }
          else {
                int allOdd = i;
                ArrayList<Integer> myOddNumbers = new ArrayList<Integer>();
                myOddNumbers.add(i);
                allOdd = i;
             //   System.out.println(allOdd);
                for (int odd : myOddNumbers) {
                  //  System.out.println(odd);

                }
            }
           // System.out.println(n);*/
        }




    }
}
