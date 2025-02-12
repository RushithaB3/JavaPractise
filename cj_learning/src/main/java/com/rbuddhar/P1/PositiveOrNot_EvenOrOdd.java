package com.rbuddhar.P1;

import java.util.Scanner;

public class PositiveOrNot_EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();

        if (num >= 1) {
            System.out.println(num + " is positive");
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        } else if (num == 0) {
            System.out.println(num + " is neither positive nor negative");
        } else if (num < 0) {
            System.out.println(num + " is negative");
            if (num % 2 == 0) {
                System.out.println(num + " is even negative");
            } else {
                System.out.println(num + " is odd negative");
            }
        } else {
            System.out.println(num + " is invalid!");
        }
    }
}
