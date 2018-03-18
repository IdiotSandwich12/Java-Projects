/*

Timothy Jou
CO SCI 290

- Lab 7 (Book problem 5.1)

*/

import java.util.Scanner;

public class Lab7{
  
public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println ("This program will calculate the average and total of all numbers inputted by a user. Program ends as soon as 0 is inputted.");
  
  int positives = 0, negatives = 0, count = 0;
  float total = 0, average = 0;
  String str = input.next();
  int i = 0;
  
  
  while (i < str.length()){
    i += 1;
    
    
    if (Character.isDigit(str.charAt(i))){
      total += str.charAt(i);
      count++;
    }
    if (str.charAt(i) > 0){
      positives = positives + 1;
    }
    if (str.charAt(i) < 0){
      negatives = negatives + 1;
    }
    if (str.charAt(i) == 0){
      break;
    }
  }
  
  average = ((float)(total / count));
  
  System.out.println ("The number of positive numbers is " + positives);
  System.out.println ("The number of negative numbers is " + negatives);
  System.out.println ("The total of all numbers is " + total);
  System.out.println ("The average is " + average);
    
  
}
}