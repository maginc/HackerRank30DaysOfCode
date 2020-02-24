package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 24-Feb-20
 **/
public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    // Add your code here
    //This is one way to solve problem, because we know input value constraints,
    // will not work if constraints is unknown

    int computeDifference(){
        int n=elements.length;
        int min=100;
        int max=1;

        for(int i=0;i<n;++i)
        {
            if(elements[i]<min){

            }
            if(elements[i]>max){
                max=elements[i];
            }
        }
        maximumDifference=max-min;


        return maximumDifference;
    }

} //
