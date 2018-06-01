/*

Timothy Jou
CO SCI 290

- Lab 18

*/

import java.util.Scanner;

public class Lab18{

public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  
  double[] numbers = new double[10];
  
  System.out.println("Please enter ten numbers: ");
  
  for(int i = 0; i < numbers.length; i++){
    numbers[i] = input.nextDouble();
  }
  
  System.out.println("The minimum number is: " + min(numbers));
  
}

  public static double min(double[] array) {
    
    double min = array[0];
    
    for (double i: array){
      if (i < min){
        min = i;
      }
    }
    return min;
    
  }
}