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
		double test1, test2, test3, average;
		char grade;
      Scanner sc = new Scanner(System.in);

	// Acquire three test scores from user.
	System.out.print("Enter test score #1: ");
		test1 = sc.nextDouble();

	System.out.print("Enter test score #2: ");
      test2 = sc.nextDouble();

	System.out.print("Enter test score #3: ");
      test3 = sc.nextDouble();

	// Find the score average.
	average = (test1 + test2 + test3) / 3;

	// Establish the grade.
	if (average >= 90 && average <= 100)
	{
		grade = 'A';
	}
	else if (average >= 80 && average <= 89)
   {
      grade = 'B';
   }
   else if (average >= 70 && average <=79)
   {
      grade = 'C';
   }
   else if (average >= 60 && average <=69)
   {
      grade = 'D';
   }
   else
   {
      grade = 'F';
    }
   
   // Print the average score.
   System.out.println("Average score: " + average);
   
   // Print the letter grade.
   System.out.println("Letter: " = grade);
   
   }
   
}