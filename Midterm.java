/*

Timothy Jou
CO SCI 290

- Midterm

*/

import java.util.Scanner;

public class Midterm{

public static void main(String[]args){

  Scanner input = new Scanner(System.in);

  System.out.println("Please enter a number. This will determine the size of two matrices.");
  int n = input.nextInt(); //Obtain user input
  
  System.out.println(); 
  // Separates a line between inputed and printed numbers. Easier to read on console.
    
  printMatrix(n);
    
  System.out.println();
  System.out.println();
  //Blank lines, separates matrices for clarity
    
  printMatrix2(n);
  
    }
  
  public static void printMatrix (int n){
    
    int matrix = 0;
    
    for(int a = 1; a <= n; a++){
      
      for(int b = 1; b <= n; b++){ //Need a nested loop to repeat something that is being repeated
        matrix = (0 + (int)(Math.random() * (11 - 0))); //Random generator
        System.out.print(matrix  + " "); //Print random numbers in a line
      }
    
      System.out.println(); //Skips a line, goes to next one
      
    }
    
  }
    
  public static void printMatrix2 (int n){ //Second matrix made with another method
    
    int matrix = 0;
    
    for(int c = 1; c <= n; c++){
      
      for(int d = 1; d <= n; d++){
        matrix = (0 + (int)(Math.random() * (11 - 0)));
        System.out.print(matrix  + " ");
      }
    
      System.out.println();
        
    }
   
 
  }
}