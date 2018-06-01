/*

Timothy Jou
CO SCI 290

*/

public class Lab15{

public static void main(String[]args){
  
  int num = 0;
  
  while(Math.pow(num + 1, 3) < 12000){
    num++;
  }
  
  System.out.println("The largest integer, that when cubed is less than 12,000, is " + num + ".");
  
 }
}

