/*

Timothy Jou
CO SCI 290

- Lab 20

Declare a 2D array of integers with 5 rows and 6 columns.
Randomly assign each index an integer between 0 and 100.
Create a custom function that takes in a 2D array of integers and finds the sum of each row.
Each sum is saved into an array of integers that is returned by the function.

*/

public class Lab20{

public static void main(String[]args){
  
  int min = 0;
  int max = 100;
  int random = 0;
  int sum = 0;
  int single = 0;
  
  int[][]array = new int[5][6];
  
  for(int i = 1; i < 5; i++){
    for(int j = 1; j < 6; j++){
      array[i][j] = RNG(random);
      single = array[i][j];
      sum += single;
      System.out.println(array[i][j] + " ");
    }
  }
  
  System.out.println("The total is " + sum);

}
  
  public static int RNG(int random){
    
    int min = 0;
    int max = 100;
    
    random = min + (int)(Math.random() * max);
    return random;
  }
}