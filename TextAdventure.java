/*

Timothy Jou
Steven Lu
John Paul de Jesus

*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TextAdventure{

public static void main(String[]args){     
  
  //Initialization of all the important variables and all that jazz
  
  //Variables needed for Part 1
  String playerName;
  String nextScene;
  int playerChoice;
  String filename;
  int random = 0;
  int knowledge = 0;
  
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
  
  //Variables needed for Part 3
  
  String storyOne, storyTwo, storyThree, storyFour, storyFive, storySix, storySeven, storyEight, storyNine, storyTen, storyDone;
  storyOne = "Enter 1 to read about Pepe the Frog.";
  storyTwo = "Enter 2 to read about Good Guy Greg.";
  storyThree = "Enter 3 to read about Grumpy Cat.";
  storyFour = "Enter 4 to read about Trump's Wall.";
  storyFive = "Enter 5 to read about INCREDIBILIS.";
  storySix = "Enter 6 to read about Daubeny.";
  storySeven = "Enter 7 to read about I Have the High Ground.";
  storyEight = "Enter 8 to read about Jager's ACOG.";
  storyNine = "Enter 9 to read about Graves' Cigar.";
  storyTen = "Enter 10 to read about Lolcats.";
  storyDone = "You already read that. You should read something else.";
  
  String copy1 = storyOne;
  String copy2 = storyTwo;
  String copy3 = storyThree;
  String copy4 = storyFour;
  String copy5 = storyFive;
  String copy6 = storySix;
  String copy7 = storySeven;
  String copy8 = storyEight;
  String copy9 = storyNine;
  String copy10 = storyTen;
  
  int fightChoice;
  int power = 0;
  int holder;
  int potato = 0;
  
  
  //Let's not forget about the scanner either. Inputs are important
  Scanner input = new Scanner(System.in);
  
  //Splash title screen
  System.out.println(
  "o.OOOo.                                             o          \n"
+ "O    `o                     o                     O            \n"
+ "o      O                                      O   o           \n"
+ "O      o                                     oOo  O           \n"
+ "o      O .oOoO' O   o       O  'OoOo.         o   OoOo. .oOo. \n"
+ "O      o O   o  o   O       o   o   O         O   o   o OooO' \n"
+ "o    .O' o   O  O   o       O   O   o         o   o   O O     \n"
+ "OooOO'   `OoO'o `OoOO       o'  o   O         `oO O   o `OoO' \n"
  + "                  o                                         \n"
  + "               OoO'                                         \n"
 + "o.OOOo.                                                      \n"
 + "O    `o                                                     \n"
 + "o      O          O                                         \n"
 + "O      o         oOo                                        \n"
 + "o      O .oOoO'   o   .oOoO' .oOo  .oOo  .oOoO' .oOo. .oOo. \n"
 + "O      o O   o    O   O   o  `Ooo. O     O   o  O   o OooO' \n"
 + "o    .O' o   O    o   o   O      O o     o   O  o   O O     \n"
 + "OooOO'   `OoO'o   `oO `OoO'o `OoO' `OoO' `OoO'o oOoO' `OoO'" );
  
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
  
  while(i <= 10){
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      System.out.println(storyOne);
      System.out.println(storyTwo);
      System.out.println(storyThree);
      System.out.println(storyFour);
      System.out.println(storyFive);
      System.out.println(storySix);
      System.out.println(storySeven);
      System.out.println(storyEight);
      System.out.println(storyNine);
      System.out.println(storyTen);
      System.out.println(" ");
      System.out.println("You have " + knowledge + " Knowledge.");
      System.out.println(" ");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      
      if(i < 4 && i >= 3){
        System.out.println("You have gathered some power from the memes. Though maybe, not enough...");
        filename = "RealEnd1.txt";
        readFile(filename);
        System.out.println("Enter 1 for Yes. Enter 2 for No.");
        fightChoice = input.nextInt();
        if(fightChoice == 1){
          i = 10;
          break;
        }
        else if(fightChoice == 2){
          potato++;
        }
      }
      
      playerChoice = input.nextInt();
      
      if(playerChoice == 1){
        if(copy1 == storyDone){
          System.out.println(storyDone);
          System.out.println(" ");
        }
        else if(copy1 != storyDone){
          filename = "End3.txt";
          readFile(filename);
          copy1 = storyDone;
          System.out.println(" ");
          System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
          System.out.println(" ");
          i++;
          knowledge += 100;
        }
      }
    if(playerChoice == 2){
      if(copy2 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy2 != storyDone){
        filename = "End4.txt";
        readFile(filename);
        copy2 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
    if(playerChoice == 3){
      if(copy3 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy3 != storyDone){
        filename = "End5.txt";
        readFile(filename);
        copy3 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
    if(playerChoice == 4){
      if(copy4 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy4 != storyDone){
        filename = "End6.txt";
        readFile(filename);
        copy4 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
    if(playerChoice == 5){
      if(copy5 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy5 != storyDone){
        filename = "End7.txt";
        readFile(filename);
        copy5 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
    if(playerChoice == 6){
      if(copy6 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy6 != storyDone){
        filename = "End8.txt";
        readFile(filename);
        copy6 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
    if(playerChoice == 7){
      if(copy7 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy7 != storyDone){
        filename = "End9.txt";
        readFile(filename);
        copy7 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
    if(playerChoice == 8){
      if(copy8 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy8 != storyDone){
        filename = "End10.txt";
        readFile(filename);
        copy8 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
    if(playerChoice == 9){
      if(copy9 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy9 != storyDone){
        filename = "End11.txt";
        readFile(filename);
        copy9 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
    if(playerChoice == 10){
      if(copy10 == storyDone){
        System.out.println(storyDone);
        System.out.println(" ");
      }
      else if(copy10 != storyDone){
        filename = "End12.txt";
        readFile(filename);
        copy10 = storyDone;
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        i++;
        knowledge += 100;
      }
    }
  }
  
  while(knowledge > 0){
    holder = RNG(random);
    if(holder >= 0 && holder <= 90){
      System.out.println("You have summoned a Normal Meme.");
      power += 1;
    }
    if(holder > 90 && holder <= 100){
      System.out.println("You have summoned a Dank Meme.");
      power += 3;
    }
    knowledge -= 100;
  }
  
  //Part 4 of the game
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd2.txt";
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd3.txt";
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd4.txt";
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd5.txt";
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd6.txt";
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd7.txt";
  readFile(filename);
  System.out.println("Press any key to continue.");
  nextScene = input.next();
  
  if(power >= 7){
    System.out.println(" ");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    filename = "RealEndGood.txt";
    readFile(filename);
    System.out.println("     |\\     /|(  ___  )|\\     /|  |\\     /|\\__   __/( (    /|( )( )( ) \n "
                     + "    ( \\   / )| (   ) || )   ( |  | )   ( |   ) (   |  \\  ( || || || | \n "
                     + "     \\ (_) / | |   | || |   | |  | | _ | |   | |   |   \\ | || || || | \n "
                     + "      \\   /  | |   | || |   | |  | |( )| |   | |   | (\\ \\) || || || | \n "
                     + "       ) (   | |   | || |   | |  | || || |   | |   | | \\   |(_)(_)(_) \n "
                     + "       | |   | (___) || (___) |  | () () |___) (___| )  \\  | _  _  _ \n "
                     + "       \\_/   (_______)(_______)  (_______)\\_______/|/    )_)(_)(_)(_) \n ");
  }
  else if(power <= 7){
    System.out.println(" ");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    filename = "RealEndBad.txt";
    readFile(filename);
    System.out.println("     |\\     /|(  ___  )|\\     /|  ( \\      (  ___  )(  ____ \\(  ____ \\( )( )( ) \n "
                     + "    ( \\   / )| (   ) || )   ( |  | (      | (   ) || (    \\/| (    \\/| || || | \n "
                     + "     \\ (_) / | |   | || |   | |  | |      | |   | || (_____ | (__    | || || | \n "
                     + "      \\   /  | |   | || |   | |  | |      | |   | |(_____  )|  __)   | || || | \n "
                     + "       ) (   | |   | || |   | |  | |      | |   | |      ) || (      (_)(_)(_) \n "
                     + "       | |   | (___) || (___) |  | (____/\\| (___) |/\\____) || (____/\\ _  _  _ \n "
                     + "       \\_/   (_______)(_______)  (_______/(_______)\\_______)(_______/(_)(_)(_) \n ");
  }
    
  
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