package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 07-Feb-20
 **/
public class Day3 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        scanner.close();

        if(N % 2 == 1) {
            System.out.println("Weird");
        }else {
            if (N >= 2 && N <= 5) System.out.println("Not Weird");
            if (N >= 6 && N <= 20) System.out.println("Weird");
            if (N > 20) System.out.println("Not Weird");
        }
    }
}

