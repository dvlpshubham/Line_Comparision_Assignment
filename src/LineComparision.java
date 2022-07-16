package com.blz.javaproject;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        //Scanner which is added to take values from the user
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner Scan = new Scanner(System.in);
        //Input values from the user
        System.out.println("Enter the Values of the line X1 and Y1");
        System.out.println("Enter the value of X1 :  ");
        int X1 = Scan.nextInt();
        System.out.println("Enter the value of Y1 :  ");
        int Y1 = Scan.nextInt();
        System.out.println("Enter the Values of the line X2 and Y2");
        System.out.println("Enter the value of X2 :  ");
        int X2 = Scan.nextInt();
        System.out.println("Enter the value of Y2 :  ");
        int Y2 = Scan.nextInt();
        System.out.println("Enter the Values for the 2nd Line");
        // Line Two Initiated values from User
        System.out.println("Enter the Values of the line Y3 and X3");
        System.out.println("Enter the value of X3 :  ");
        int X3 = Scan.nextInt();
        System.out.println("Enter the value of Y3 :  ");
        int X4 = Scan.nextInt();
        System.out.println("Enter the Values of the line Y4 and X4");
        System.out.println("Enter the value of X4 :  ");
        int Y3 = Scan.nextInt();
        System.out.println("Enter the value of Y4 :  ");
        int Y4 = Scan.nextInt();

        double length = Math.sqrt((X2 - X1) * (Y2 - Y1) + (Y2 - Y1) * (Y2 - Y1));
        System.out.println("The length of the line is  : " +length);

        double length2 = Math.sqrt((X4 - X3) * (Y4 - Y3) + (Y4 - Y3) * (Y4 - Y3));
        System.out.println("The length of the line is  : " +length2);

        if(length == length2)
        {
            System.out.println("The Lines Segments are Equal");
        }
        else{
            System.out.println("The Lines Segments are not Equal");
        }

    }

}