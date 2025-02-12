package com.rbuddhar.Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for which you want to calculate the factorial: ");
        int n = input.nextInt();
        int fact = 1;
        // factorial of a number n is 1*2*3*....*n
        if(n>=1) {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of " + n + " is " + fact);
        }else if(n==0) {
            System.out.println("The factorial of " + n + " is : 0");
        }else{
            System.out.println("Invalid input!");
        }
    }
}
