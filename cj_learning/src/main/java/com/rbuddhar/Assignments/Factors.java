package com.rbuddhar.Assignments;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count=0;
        System.out.print("Factors of " + num + " are : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(" " + i);
                count++;
            }
        }System.out.println("\nNo of factors for " + num + " is : " + count);
    }
}
