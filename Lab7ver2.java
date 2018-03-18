/*

Timothy Jou
CO SCI 290

- Lab 7 (Book problem 5.1)

*/

import java.util.Scanner;

public class Lab7ver2{
  
public static void main(String[]args){
  
  int count = 0, positive = 0, negative = 0;
  float average = 0, total = 0;
  
  System.out.println ("This program will calculate the average of all numbers inputted by a user. Program ends as soon as a 0 is inputted.");
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter a number: ");
  
  int num = input.nextInt();
  
  while((num = input.nextInt()) != 0){
        total = total + num;
        ++count;
    if(num > 0){
        positive = positive + 1;
    } 
    if(num < 0){
        negative = negative + 1;
    }
  }

     average = (total/count);

     System.out.println("The number of positive numbers is " + positive);
     System.out.println("The number of negative numbers is " + negative);
     System.out.println("The total is " + total);
     System.out.println("The average is " + average);
    
}
}