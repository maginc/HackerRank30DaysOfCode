package com.company;

import java.util.Scanner;

/**
 * @author Andris Magins
 * @created 18-Feb-20
 **/
public class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }





    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
     String calculate(){
         String result = "";
         int sum = 0;
         for (int score :testScores){
             sum +=score;
         }
         int avgScore = sum/testScores.length;

         if(avgScore >=90 && avgScore <=100){
             result = "O";
         }
         if (avgScore >=80 && avgScore <90){
             result = "E";
         }
         if(avgScore >=70 && avgScore <80){
             result = "A";
         }
         if(avgScore >= 55 && avgScore <70){
             result = "P";
         }
         if (avgScore >=40 && avgScore<55){
             result = "D";
         }
         if (avgScore <40){
             result = "T";
         }


       return result;
    }

}