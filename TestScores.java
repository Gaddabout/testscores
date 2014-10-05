// Test Scores and Grade for Module 3
// Author: Matthew Self
// Date: Sunday, Sept. 14, 2014
// Class: CIS163AA 27873
// Instructor: John Austin
// Assignment: Write a program that has variables to hold three test scores. The program should ask the user to enter three test scores and then assign the values entered to the variables. The program should display the average of the test scores and the letter grade that is assigned for the test score average.

package testscores;
import java.util.Scanner;

public class TestScores
{

   public static void main (String[] args)
   {
      double score1,score2,score3;
      double average;
      char grade;
      Scanner keyboard = new Scanner(System.in);
   
   // Acquire three test scores from user.
      System.out.print("Enter test score #1: ");
      score1 = keyboard.nextDouble();
   
      System.out.print("Enter test score #2: ");
      score2 = keyboard.nextDouble();
   
      System.out.print("Enter test score #3: ");
      score3 = keyboard.nextDouble();
   
   // Find the score average.
      average = calcAverage (score1,score2,score3);
      System.out.println("The test score average is " + average);
   
   // Establish the grade.
      grade = determineGrade(average);
      System.out.println("The cumulative letter grade is " + grade);
   }
   public static double calcAverage (double score1,double score2,double score3) 
   { 
      return (score1+score2+score3)/3; 
   } 
   public static char determineGrade (double score1) 
   { 
      if (score1 >=90) 
         return 'A'; 
      if (score1 >=80) 
         return 'B'; 
      if (score1 >=70) 
         return 'C'; 
      if (score1 >=60) 
         return 'D'; 
      return 'F'; 
   } 
} 
