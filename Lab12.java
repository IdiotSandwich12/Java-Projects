/*

Timothy Jou
CO SCI 290

  Lab 12
  
  Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	Note:
	Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic

*/

  import java.util.Scanner; // Initialize Scanner

  public class Lab12{

	public static void main(String[] args){ // Added brackets between String and args to define main method

		Scanner input = new Scanner(System.in); // Capitalized the 'S' in system.in
		int num; // Changed char to int

		System.out.println("This program will check if a number is even or odd..."); // Added quotation marks to create string 

		System.out.println("Please enter in a whole number..."); // Added semicolon for line to work

		num = input.nextInt(); // Removed int, num does not need to be initialized again. Also, fixed input to receive ints

		checkNum(num);

	}

	public static void checkNum(int num){ // Changed checkNums to checkNum, changed double in header to int. added static to header
		
		boolean potato2;
		int potato;
		
		potato = num % 2;
		
		if(potato == 0){
			potato2 = true;
		}
		else
			potato2 = false;
		
		if(potato2 == true){
			System.out.println("The number " + num + " is an even number.");
		}
		if(potato2 == false){
			System.out.println("The number " + num + " is an odd number.");
		
		

		//oops...  still need to implement

		}
	}
}