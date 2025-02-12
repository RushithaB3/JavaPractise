package com.rbuddhar.P1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        // Check if the given number is prime
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println(n+" is a Prime number");
        }else{
            System.out.println(n+" is not a Prime number");
        }

        // Print prime numbers up to given number
        System.out.println("Prime numbers upto : "+n);
        for(int i =1; i <= n; i++){
            count = 0;
            for(int j =1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            } if(count == 2){
                System.out.print(i+" ");
            }
        }
    }
}

