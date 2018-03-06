/*

Timothy Jou
CO SCI 290

Demo on Strings

*/

import java.util.Scanner;

public class TestStrings{

public static void main(String[]args){
  
  //instantiate the Scanner object
  Scanner input = new Scanner(System.in);
  
  //ask user a question
  System.out.println ("Are you rich? Yes or No?");
  
  //get answer from console
  String answer = input.next();
  answer = answer.toLowerCase();
  
  /*
  Examples below:
  answer.toLowercase() - makes all letters lowercase
  answer.toUppercase() - makes all letters uppercase
  answer.equals("some other string") - checks if two strings are exactly the same
  
  
  //check if answer is specifically Yes or No
  if (answer.equals("no")){ //"no" != "No"
    System.out.println ("That sucks!");
  }
  else{
    System.out.println ("Cool.");
  } 
  