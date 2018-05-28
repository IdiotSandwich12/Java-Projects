/*

Timothy Jou
CO SCI 290

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIO{

public static void main(String[]args){
  
  String currentLine; //holds current line being read in file
  String filename = "Test.txt"; //holds the relative path of a file
  
  //trying to open a file to read
  try(BufferedReader br = new BufferedReader(new FileReader(filename))){
    
    //read each line in the file until the end of program
    while((currentLine = br.readLine()) != null){
      System.out.println(currentLine);
    }
    
    //if there is no file to open, the exception will be caught
  } catch(IOException e){
    e.printStackTrace();
  }
  
}
}