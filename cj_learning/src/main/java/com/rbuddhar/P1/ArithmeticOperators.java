package com.rbuddhar.P1;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Enter any 2 numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(" "+a+ " +"+" "+b+" = "+(a+b));
        System.out.println(" "+a+ " -"+" "+b+" = "+(a-b));
        System.out.println(" "+a+ " *"+" "+b+" = "+(a*b));

        //System.out.println(" "+a+ " %"+" "+b+" = "+(a%b));
        if(b != 0){
            System.out.println(" "+a+ " /"+" "+b+" = "+(a/b));
        }
        else{
            System.out.println(" we cannot divide by "+b);
        }

    }
}

