package com.rbuddhar.P1;

import java.util.Scanner;

public class M_PrintingStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int rows = input.nextInt();
        //StarsTriangle(rows);
        //StarsInvertedTriangle(rows);
        //StarsLeftTriangle(rows);
        //StarsInvertedLeftTriangle(rows);
        StarsRightTriangle(rows);

    }
    public static void StarsTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for(int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void StarsInvertedTriangle(int rows) {
        for (int i= 0; i<= rows-1; i++)
        {

            //This loop prints starting spaces for each row of pattern
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            //This loop prints stars and the space between stars for each row
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            //To move the cursor to new line after each row
            System.out.println();
        }
    }
    public static void StarsLeftTriangle(int rows) {
        for(int i= rows; i>=1; i--) {
            for(int j=rows; j>=i; j--) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void StarsInvertedLeftTriangle(int rows) {
        for(int i = rows; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void StarsRightTriangle(int rows) {
        return;
    }

    public static void StarsInvertedRightTriangle(int rows) {
        return;
    }

    public static void diamond(int rows) {
        return;
    }

    public static void square(int rows) {
        return;
    }

    public static void quadrilateral(int rows) {
        return;
    }
}


