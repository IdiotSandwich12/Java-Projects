/*

Timothy Jou
Steven Lu
Emmanuel Maravilla
John Paul de Jesus

*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextAdventure{

public static void main(String[]args){     
  
  //Initialization of all the important variables and all that jazz
  
  //Variables needed for Part 1
  String playerName;
  String nextScene;
  int playerChoice;
  String filename;
  int random;
  int money;
  
  //Variable needed for Part 2
  String optionOne = "Who is Kar'm? And what does he have to do with me?";
  String optionTwo = "Why am I here?";
  String optionThree = "What is the Datascape?";
  String optionFour = "Why are you helping me?";
  String optionFive = "What's a 'Grand Memer'?";
  String optionSix = "How do we beat Kar'm?";
  String optionSeven = "What is that green thing you're able to use? Is is magic?";
  String optionDone = "I've already told you that. Ask me something else.";
  String One = optionOne;
  String Two = optionTwo;
  String Three = optionThree;
  String Four = optionFour;
  String Five = optionFive;
  String Six = optionSix;
  String Seven = optionSeven;
  int i = 1;
  
  //Let's not forget about the scanner either. Inputs are important
  Scanner input = new Scanner(System.in);
  
  //Part 1 of game
  filename = "Intro1.txt";
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  filename = "Intro2.txt";
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  readFile(filename);
  System.out.println(" > Please enter what you wish to be called throughout the game. Names matter, after all! < ");
  playerName = input.next();
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  System.out.println("Kar'm: Oh, cool. I mean, QUITE AN...UNINTERESTING NAME. NOW THEN, PREPARE TO DIE, FILTH.");
  System.out.println("(K'arm raises his staff, and directs bluish white energy at you, in the shape of the letters 'FB'.)");
  System.out.println(playerName + ": Oh, sh-");
  filename = "Intro3.txt";
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  filename = "Intro4.txt";
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  filename = "Intro5.txt";
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  readFile(filename);
  System.out.println("Enter 1 for the red door, or enter 2 for the blue door.");
  playerChoice = input.nextInt();
  
  if(playerChoice == 1){
    filename = "IntroRed.txt";
  }
  else if(playerChoice == 2){
    filename = "IntroBlue.txt";
  }
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  readFile(filename);
  
  //Part 2 of the game
  filename = "Mid1.txt";
  readFile(filename);
  
  while(i <= 7){
    System.out.println("Enter 1 for " + optionOne);
    System.out.println("Enter 2 for " + optionTwo);
    System.out.println("Enter 3 for " + optionThree);
    System.out.println("Enter 4 for " + optionFour);
    System.out.println("Enter 5 for " + optionFive);
    System.out.println("Enter 6 for " + optionSix);
    System.out.println("Enter 7 for " + optionSeven);
    System.out.println(" ");
    
    playerChoice = input.nextInt();
    
    if(playerChoice == 1){
      if(One == optionDone){
        System.out.println(optionDone);
        System.out.println(" ");
      }
      else if(One != optionDone){
      filename = "Mid2.txt";
      readFile(filename);
      System.out.println(playerName + ": Hang on, what?");
      filename = "Mid2.5.txt";
      readFile(filename);
      One = optionDone;
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      i++;
      }
    }
    if(playerChoice == 2){
      if(Two == optionDone){
        System.out.println(optionDone);
        System.out.println(" ");
      }
      else if(Two != optionDone){
      filename = "Mid3.txt";
      readFile(filename);
      Two = optionDone;
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      i++;  
      }
    }
    if(playerChoice == 3){
      if(Three == optionDone){
        System.out.println(optionDone);
        System.out.println(" ");
      }
      else if(Three != optionDone){
      filename = "Mid4.txt";
      readFile(filename);
      Three = optionDone;
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      i++;
      }
    }
    if(playerChoice == 4){
      if(Four == optionDone){
        System.out.println(optionDone);
        System.out.println(" ");
      }
      else if(Four != optionDone){
      filename = "Mid5.txt";
      readFile(filename);
      Four = optionDone;
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      i++;
      }
    }
    if(playerChoice == 5){
      if(Five == optionDone){
        System.out.println(optionDone);
        System.out.println(" ");
      }
      else if(Five != optionDone){
      filename = "Mid6.txt";
      readFile(filename);
      Five = optionDone;
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      i++;
      }
    }
    if(playerChoice == 6){
      if(Six == optionDone){
        System.out.println(optionDone);
        System.out.println(" ");
      }
      else if(Six != optionDone){
      filename = "Mid7.txt";
      readFile(filename);
      Six = optionDone;
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      i++;
      }
    }
    if(playerChoice == 7){
      if(Seven == optionDone){
        System.out.println(optionDone);
        System.out.println(" ");
      }
      else if(Seven != optionDone){
      filename = "Mid8.txt";
      readFile(filename);
      Seven = optionDone;
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      i++;
      }
    }
  }
  
  filename = "Mid9.txt";
  readFile(filename);
  
  //Part 3 of the game

}
  
  public static void readFile(String filename){
    
    String currentLine;
    
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
    }
      catch(IOException e){
      e.printStackTrace();
    }
  }
  
  public static int RNG(int random){
    
    int min = 1;
    int max = 100;
    random = min + (int)(Math.random() * max);
    
    return random;
  }
}