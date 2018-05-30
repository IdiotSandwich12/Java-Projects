/*

Timothy Jou
CO SCI 290

- Lab 9 (book problem 6.3)

*/

import java.util.Scanner;

public class Lab9{
  
public static void main (String[]args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter an integer.");
  int number = input.nextInt();
  
  System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome." );                                    
  
}
                     
  public static boolean isPalindrome(int number){
    
    return number == reverse(number) ? true : false;
  }
                     
    public static int reverse(int number){
      String reverse = "";
      String str = number + "";
      
      for(int potato = str.length() - 1; potato >= 0; potato--){
        reverse += str.charAt(potato);
      
      }
      
      return Integer.parseInt(reverse);
    }
    
}
      