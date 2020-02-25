package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 25-Feb-20
 **/
public class Day19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator2 = new Calculator2();
        int sum = myCalculator2.divisorSum(n);
        System.out.println("I implemented: " + myCalculator2.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator2 implements AdvancedArithmetic {
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n%i==0){
                sum = sum + i + n/i;
            }
        }
        if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n){
            sum -= Math.sqrt(n);
        }
        return sum;
    }
}