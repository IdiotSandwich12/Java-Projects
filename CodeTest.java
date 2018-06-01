//A random canvas that I use to test short chunks of code.
//I don't like running through long threads. Not healthy for my sanity.

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeTest{

public static void main(String[]args){
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd2.txt";
  readFile(filename);
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd3.txt";
  readFile(filename);
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd4.txt";
  readFile(filename);
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd5.txt";
  readFile(filename);
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd6.txt";
  readFile(filename);
  
  System.out.println(" ");
  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
  System.out.println(" ");
  filename = "RealEnd7.txt";
  readFile(filename);
  
  if(power >= 7){
    System.out.println(" ");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    filename = "RealEndGood.txt";
    readFile(filename);
  }
  else if(power <= 7){
    System.out.println(" ");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    filename = "RealEndBad.txt";
    readFile(filename);
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