package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 10-Feb-20
 **/
public class Day6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String s;

        for (int i = 0; i < T; i++) {
            s = scan.next();

            for (int j = 0; j < s.length(); j++) {

                if (j % 2 == 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(s.charAt(j));
                }

            }
            System.out.println();
        }

    }

}
