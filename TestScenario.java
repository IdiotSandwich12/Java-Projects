/*

Timothy Jou
CO SCI 290
Lab 3

*/

public class TestScenario{

public static void main(String[]args){
  
  int max = 100;
  int min = 0;
  
  int random = 0 + (int)(Math.random() * (100 - 0)));
  
  if (random > 0 && random <= 20){
    System.out.println ("Arcane Golemn has dropped a sack containing 200 gold!");
  }
  if (random > 20 && random <= 40){
    System.out.println ("Arcane Golemn has dropped a weapon: Void's Decree (one-handed sword)!");
  }
  if (random > 40 && random <= 60){
    System.out.println ("Arcane Golemn has dropped a weapon: Thundering Typhoon (staff)!");
  }
  if (random > 60 && random <= 80){
    System.out.println ("Arcane Golemn has dropped a weapon: Thirteenth Storm (sword and shield)!");
  }
  if (random > 80 && random <= 90){
    System.out.println ("Arcane Golemn has not dropped anything");
    System.out.println ("That is quite unfortunate.");
  }
  else if (random > 90 && random <= 100)
    System.out.println ("Arcane Golemn has dropped a spellbook: Comet's Fury!");
  
}

}
  
  