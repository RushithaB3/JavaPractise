package com.rbuddhar.P1;

import java.util.Scanner;

public class BiggestOf_n_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers you would like to enter: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        int i ;
        int max = arr[0];
        System.out.println("Enter elements of array: ");
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        max = arr[0];
        for (i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Biggest is :"+max);
    }
}
