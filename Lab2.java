/*

Timothy Jou
CO SCI 290

- Lab 2, for TestInput lecture

*/

import java.util.Scanner;

public class Lab2{
  public static void main(String[]args){
    
    int days = 0;
    String response = "";
    String name = "";
    String place = "";
    
    Scanner input = new Scanner(System.in);
    
    System.out.println ("Hey. Wake up. Come on, wake up! You alright? That crashing plane looks like it did quite a number on you. Do you remember your name?");
    
    name = input.next();
    
    System.out.println ("Good to know, " + name + ". We should set up a shelter, perhaps use whatever's left of the plane?");
    
    response = input.next();
    
    System.out.println ("Yo, " + name + " I'm back. Got some stuff set up, but not everything. Jeez, how long as it been since we got here? Have you been counting?");
    
    days = input.nextInt();
    
    System.out.println ("Huh. So we've been here for " + days + " days eh?");
    
    System.out.println ("You know, I've never really gotten to know you. Where you from, " + name + "?");
    
    place = input.next();
    
    System.out.println ("Ah, " + place + " eh? I heard that place was pretty nice.");
    
  }
  
}