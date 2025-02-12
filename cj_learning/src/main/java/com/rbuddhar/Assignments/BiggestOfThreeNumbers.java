package com.rbuddhar.Assignments;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        System.out.println("The numbers you entered are: "+num1+", "+num2+", "+num3);
        //Using if else
        
        if(num1 > num2 && num1 > num3){
            System.out.println("The biggest number is " + num1);
        }else if(num2 > num3){
            System.out.println("The biggest number is " + num2);
        }else{
            System.out.println("The biggest number is " + num3);
        }



        //Using ternary operator
        //int big = (num1 > num2) && (num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
        //System.out.println("The biggest number is " + big);


    }
}
