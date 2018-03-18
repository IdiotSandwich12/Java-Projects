/*

Timothy Jou
CO SCI 290

- Lab 6 (Book problem 5.2)

*/

import java.util.Scanner;

public class Lab6{
  
public static void main(String[]args){
  
  int min = 1;
  int max = 15;
  int answer = 0;
  int numQuestions = 10;
  int correctCount = 0;
  int count = 0;
  long startTime = System.currentTimeMillis();
  
  Scanner input = new Scanner(System.in);
  
  while (count < numQuestions){
    int number1 = (min + (int)(Math.random() * (max - min)));
    int number2 = (min + (int)(Math.random() * (max - min)));
    
    System.out.println ("What is " + number1 + " plus " + number2 + "?");
    
    answer = input.nextInt();
    
    if (number1 + number2 == answer){
      System.out.println ("You are correct!");
      correctCount++;
    }
    else
      System.out.println ("Your answer is incorrect! " + "The answer should be " + (number1 + number2) + ".");
    
    count++;
    
  }
  
  long endTime = System.currentTimeMillis();
  long testTime = endTime - startTime;
  
  System.out.println ("Total number of correct answers is " + correctCount);
  System.out.println ("Total number of questions is " + count);
  System.out.println ("Total test time is " + (testTime / 1000) + " seconds.");
  
}
}
  