/*

Timothy Jou
CO SCI 290

- Lab 8 (book problem 6.2)

*/

import java.util.Scanner;

public class Lab8{
  
public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please input a number.");
  int number = input.nextInt();
  
  int sum = 0;
  
  while(number > 0){
    sum += number % 10;
    number /= 10;
  }
  
  System.out.println("The sum of all digits of is " + sum);
  
}
}