package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author Andris Magins
 * @created 05-Feb-20
 **/

public class Day1{

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int intVariable;
        double doubleVariable;
        String stringVariable;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        intVariable = scan.nextInt();
        doubleVariable = scan.nextDouble();
        scan.nextLine(); //this line scans everything after previous double number
        stringVariable = scan.nextLine();//and this line now scans new line


        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+intVariable);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + doubleVariable);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + stringVariable);

        scan.close();
    }
}