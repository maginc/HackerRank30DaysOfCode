package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 14-Feb-20
 **/
public class Day10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String binaryString = Integer.toBinaryString(n);
        char[] charArray = binaryString.toCharArray();
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i<charArray.length; i++){
            if (charArray[i] == '1') {
                count++;
            }else{
                if (count> maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if(maxCount>count){
        System.out.println(maxCount);
        } else {
            System.out.println(count);
        }
    }
}
