/*

Timothy Jou
CO SCI 290

- Lab 11 (book problem 6.17)

*/

import java.util.Scanner;

public class Lab11{

  public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number. This will determine the size of the matrix.");
    int n = input.nextInt();
    
    printMatrix(n);

    }
  
  public static void printMatrix (int n){
    
    int matrix = 0;
    
    for(int i = 1; i <= n; i++){
      
      for(int j = 1; j <= n; j++){
        matrix = (0 + (int)(Math.random() * (2 - 0)));
        System.out.print(matrix  + " ");
      }
    
      System.out.println();
    
    }
   
      
   
 
  }
}