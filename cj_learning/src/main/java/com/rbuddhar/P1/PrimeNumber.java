package com.rbuddhar.P1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        // Check if the given number is prime
        if (n < 2) {
            System.out.println(n + " is not a Prime Number");
            return;
        }
        if (n == 2 || n == 3) {
            System.out.println(n + " is a Prime Number");
            return;
        }
        boolean isPrime = true;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }

        // Print prime numbers up to given number
        System.out.println("Prime numbers up to " + n + ":");
        for (int num = 2; num <= n; num++) {
            if (num == 2 || num == 3) {
                System.out.print(num + " ");
                continue;
            }
            if (num % 2 == 0 || num % 3 == 0) {
                continue;
            }
            boolean isPrimeNum = true;
            for (int j = 5; j * j <= num; j += 6) {
                if (num % j == 0 || num % (j + 2) == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum) {
                System.out.print(num + " "); // Fixed: prints on the same line
            }
        }
    }
}
