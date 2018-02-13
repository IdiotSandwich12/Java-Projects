import java.util.Scanner;

public class TestInput{
  
  //main method = starting point of application
  
  public static void main(String[]args){
      
    //datatype variableName = expression
    //1. Identifiers can only start with a letter, _, or S
    //2. Identifiers with multiple values are camelCased
    //e.g. - numOfStudents, name, interestRate
    
    //primitive datatypes
    // int: integer, whole number => 3, 2147483647, 102, -11
    //double: decimal number => 3.33, 0.2, 0.33333, -33.33
    //char: single character inside single quotation => '3', '!', ' '
    //boolean: true or false => true, false
    
    //object/reference datatypes
    //String: chracters surrounded with double quotations => "potatoes", "cat"
    /*There are other objects in Java that comes with Java by default, and those that are custom
       => Objects/class that comes with Java: Scanner, System, etc Objects
       => Customer classes: Zombie, SpaceInvader, Person, etc
    */
    
    final double PI_VALUE = 3.1415; // constants are all capital letters; multiple words separated by underscores
    
    int numStudents = 29;
    double averageGPA = 3.78;
    String name = "";
    boolean gameOver = false; //or true
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println ("Hi, please give me your name");
    
    name = input.next(); //.next() is for String types
    
    System.out.println ("Hi " + name);
    
    System.out.println ("How old are you, " + name + "?");
    
    age = input.nextInt(); //.nextInt() is for int types
    
    System.out.println ("Awesome! Your name is " + name + "," + " and you are " + age + " years old!");
    
    /*
    Arithmethic Operators
    + addition
    - subtraction
    * mulitplication
    / division
    = assignment operator, equals
    
    Programming math operations follow the same order of operations as in regular, real life Math. (), exponents, multiplication/division, addition/subtraction, from left to right.
    
    */
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24;
    
    System.out.println ("You are " + month + " months old OR " + days + " days old OR " + hours + " hours old!");
    
    //double for user input is input.nextDouble();
    //
    
  }
  
}
    