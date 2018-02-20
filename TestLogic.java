public class TestLogic {

public static void main(String[]args) {
  
  int grade = 90;
  
  //simple if statement
  if (grade > 90) {
    System.out.println ("A");
  }
  
  //two way if-else statement
  if (grade > 90) {
    System.out.println ("Grade is an A");
  }
  else
    System.out.prinln ("Grade is not an A");
  
  //multi if/else/else-if statement
  if (grade > 90) {
    System.out.println ("A");
  }
  else if (grade => 80) {
    System.out.println ("B");
  }
  else if (grade => 70) {
    System.out.println ("C");
  }
  else {
    System.out.println ("F");
  }
  
  /*
  
  Logical Operators:
  
  ! - NOT
  != - Not Equal To
  == - is equal to
  && - AND
  || - OR
  
  */