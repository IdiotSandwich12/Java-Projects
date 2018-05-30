/*

Timothy Jou
Steven Lu
Emmanuel Maravilla
John Paul de Jesus

*/

import java.util.Scanner;

public class TextAdventure{

public static void main(String[]args){     
  
  String playerName;
  int playerChoice;
  String filename;
  
  filename = "Intro1.txt";
  readFile(filename);
  
  System.out.println(playername + ": Oh, sh-");
  
  
}
  
  public void readFile(String filename){
    
    String currentLine;
    
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      
    } catch(IOException e){
      e.printStackTrace();
    }