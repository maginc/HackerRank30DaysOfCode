package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 11-Feb-20
 **/
public class Day7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();

        for(int a = arr.length-1; a>=0; a--){

            System.out.print(arr[a]+" ");
        }

    }
}
