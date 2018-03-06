/*

Timothy Jou
CO SCI 290

- Use control structures to do string manipulation and user validation

Built in String functions:
str.length()
str.toLowerCase() - makes all letters lowercase
str.toUpperCase() - makes all letters uppercase
str.equals("some other string") - checks if two Strings are exactly the same
str.equalsIgnoreCase("no") - checks if two Strings are equal, regardless of case

*/

public class Logic1{

public static void main(String[]args){
  
  String str = "Java Rules!"; //length = 11
  int num = 10;
  
  for (int index = 0; index < str.length(); index++){
    //first iteration - index = 0 - "J" - index updates to 1...
    //second iteration - index = 1 - "a" - index updates to 2...
    System.out.println (str.charAt(index));
  }
  
  if (num % 2 == 0){
    System.out.println (str.charAt(index));
  }
  
  System.out.println (str.substring(0, 4))
  
}
}
  
  