/*

Timothy Jou
CO SCI  290

Demo topics are:
- increment/decrement operators
- augmented assignment operators
- type-casting with int, double, and char

*/

public class DemoBoolean {

//start of application

public class void main(String[]args) {
  
  int num = 1;
  num = num + 1; // increment num by 1
  num++; //post-increment
  ++num; //pre-increment
  
  num = 1;
  int count = ++num; //pre-increment, count 2, num 2
  System.out.println ("count " + count + " num " + num);
  num = 1;
  count = num++; //post-increment, count 1, num 2
  System.out.println ("count " + count + " num " + num);
  
  count = num--; //post-decrement
  count = --num; //pre-decrement
  
  //examples of augmented assignment operators
  num += 2; //equivalent to => num = num + 2
  num *= 2; //equivalent to => num = num * 2
  num /= 2; //equivalent to => num = num / 2
  num -= 2; //equivalent to => num = num - 2
  
  num = 2;
  double num2 = 3.0;
  
  System.out.println ("Double wins: " + num * num2);
  System.out.println ("Casting a double to int: " + (int) num2); //lose the decimal part
  System.out.println ("Casting an int to a double: " + (double) num); //turns the 2 into a 2.0
  System.out.println ("Casting a char to an int: " + (int) 'c'); //turns the c into 99
  
  int numZombies = 3;
  int actualZombies = 100;
  
  if (numZombies == actualZombies)
    System.out.println ("You might survive this apocalypse.");
    System.out.println ("Oh no!");
  else
    System.out.println ("You might not survive this apocalypse.");
  
  //Generating a random number
  //Math.pow(3, 2); 3^2
  System.out.println (Math.random()); //random number between 0 and 1
  
  //formula for any range use ==> Min + (Math.random() * (Max - Min))
  System.out.println (5 + (int)(Math.random() * (10 - 5)));