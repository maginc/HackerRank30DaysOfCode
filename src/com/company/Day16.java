package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 25-Feb-20
 **/
public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            System.out.println(Integer.parseInt(S));
        }catch (NumberFormatException ex){
            System.out.println("Bad string");
        }
    }
}
