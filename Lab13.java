/*

Timothy Jou
CO SCI 290

- Lab 13

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab13{
  
  public static void main(String[]args){
    
    String currentLine;
    String filename = "Lab13Test.txt";
    
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
    }
    
    catch(IOException e){
      e.printStackTrace();
    }
    
    
  }
}