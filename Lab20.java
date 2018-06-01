/*

Timothy Jou
CO SCI 290

- Lab 20

*/

public class Lab20{

public static void main(String[]args){
  
  int min = 0;
  int max = 100;
  int row;
  int col;
  int random;
  
  int[][]array = new int[5][6];
  
  random = min + (int)(Math.random() * max);
  
  for(row = 1; row < 5; row++){
    for(col = 1; col < 6; col++){
      System.out.println(array[row][col]);
    }
  }
 
  
}
}