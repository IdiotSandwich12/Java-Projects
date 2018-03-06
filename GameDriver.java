import java.util.Scanner;

public class GameDriver {

public static void main(String[]args) {
  
  System.out.println ( "  ___    _____                         __   _     _           _ _ \n"             
                    + " / _ \\  /  __ \\                       / _| | |   (_)         (_) | \n"      
                    + "/ /_\\ \\ | /  \\/ __ _ ___  ___    ___ | |_  | |    _ _ __ ___  _| |_ ___ \n" 
                    + "|  _  | | |    / _` / __|/ _ \\  / _ \\|  _| | |   | | '_ ` _ \\| | __/ __| \n"
                    + "| | | | | \\__/\\ (_| \\__ \\  __/ | (_) | |   | |___| | | | | | | | |_\\__ \\ \n"
                    + "\\_| |_/  \\____/\\__,_|___/\\___|  \\___/|_|   \\_____/_|_| |_| |_|_|\\__|___/");
  
  Scanner input = new Scanner(System.in);
  int choice = 0;
  int max = 90;
  int min = 0;
  int device = 0;
  
  System.out.println ("Today was a fine day. Papers were to be reviewed, reports were to be written, and of course, cases to be cracked.");
  System.out.println ("Especially in regards to a certain individual only known as L, who has singlehandedly baffled the brightest minds of Andraza Metropolis's Authorities.");
  
  System.out.println ("You regarded this case as...");
  System.out.println ("Intriguing (Press 1)");
  System.out.println ("Apprehensive (Press 2)");
  
  choice = input.nextInt();
  
  if (choice == 1){
    System.out.println ("You regarded this case as intriguing. Why would a terrorist go out of their way to make sure innocents are unharmed? Quite a strange mindset.");
    choice = choice + 1;
  }
  else if (choice == 2){
    System.out.println ("You regarded this case as apprehensive. They are a threat to public safety, and have caused countless amounts of damage! Such a person must be stopped!");
  }
  
  System.out.println ("Your thoughts were interrupted by your office door opening loudly. A scraggly looking young lady barged in. A quick glance at her sigil told you she was a Monitor; a rookie in training aspiring to become an Inspector, as you are.");
  System.out.println ("Misa: I'm sorry I'm late! I'm Misa Lawrence, assigned to Inspector 275! My apologies, I never caught your name...");
  
  String name = input.next();
  
  System.out.println ("Misa: It's good to finally meet you in person, " + name + "!");
  
  System.out.println ("It's been year since you had an apprentice under your wing. It appears that this one has plenty of...");
  System.out.println ("Unguided Enthusiasm (Press 1)");
  System.out.println ("Foolish Naivety (Press 2)");
  
  choice = input.nextInt();
  
  if (choice == 1){
    System.out.println ("Come, have a seat Lawrence. Your enthusiasm is misguided, but not unwelcome. I'll bet we can make a fine Inspector out of you yet.");
    System.out.println ("Misa: Thank you! I'll certainly try my best!");
    choice = choice + 1;
  }
  else if (choice == 2){
    System.out.println ("That's Inspector " + name + " to you, Monitor. Take a seat. You have much to learn before even coming close to becoming an Inspector. And it ain't an easy job, kid.");
    System.out.println ("Misa: Oh, I'm sorry, Inspector " + name + "!" + " I'll try my best to keep up with whatever you have to teach me.");
  }
  
  int random = 0 + (int)(Math.random() * (90 - 0));
  
  if (random >= 0 && random <= 30){
    device = 1;
  }
  if (random >= 30 && random <= 60){
    device = 2;
  }
  if (random >= 60 && random <= 90){
    device = 3;
  }
  
  if (device == 1){
    System.out.println ("Let's get down to business, Lawrence. L struck again, this time, at the Monochrome Building. Whoever they are, they used a thermite charge to collapse the building.");
  }
  if (device == 2){
    System.out.println ("Let's get down to business, Lawrence. L struck again, this time, at the Monochrome Building. Whoever they are, they used several plastic sticky explosives to collapse the building.");
  }
  if (device == 3){
    System.out.println ("Let's get down to business, Lawrence. L struck again, this time, at the Monochrome Building. Whoever they are, they used a lot of traditional explosives to collapse the building.");
  }
  
  System.out.println ("Here. Take a look at these files over here. Tell me what you see...");
  System.out.println (" | TO BE CONTINUED | ");
  
  
  System.out.println  ( " _____                        _____ \n"                
                      + "|  __ \\                      |  _  | \n"               
                      + "| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ \n" 
                      + "| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__| \n"
                      + "| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ \\V /  __/ | \n"   
                      + " \\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| \n");   
                                                   
  
}
}