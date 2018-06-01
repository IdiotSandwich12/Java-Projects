/*

Timothy Jou
CO SCI 290

- Lab 22

*/

import java.util.*;

public class Lab22{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                          };
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    
    System.out.println("Let's play Connect Four!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2 for col");
      col = input.nextInt();
      move(row, col);
      if(checkWinnerX() || checkWinnerO()){
        gameOver = true;
      }
    }
    
  }//end of main method
  
  /*
    This method prints the Tic Tac Toe board
    with updated moves by players.
  */
  public static void printBoard(){
    
    System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | " + board[0][3] + " | " + board[0][4] + " | " + board[0][5]);
    System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | " + board[1][3] + " | " + board[1][4] + " | " + board[1][5]);
    System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + " | " + board[2][4] + " | " + board[2][5]);
    System.out.println(board[3][0] + " | " + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + " | " + board[3][4] + " | " + board[3][5]);
    System.out.println(board[4][0] + " | " + board[4][1] + " | " + board[4][2] + " | " + board[4][3] + " | " + board[4][4] + " | " + board[4][4]);
    System.out.println(board[5][0] + " | " + board[5][1] + " | " + board[5][2] + " | " + board[5][3] + " | " + board[5][4] + " | " + board[5][5]);
 
  }//end of printBoard
  
  public static void changeXO(){
    
    if(xo == 'o'){
      xo = 'x';
    }
    else{
      xo = 'o';
    }
    
  }//end of changeXO
  
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  public static void move(int row, int col){
    
    if(board[row][col] == ' '){
      board[row][col] = xo;
      changeXO();
    }
    else
      System.out.println("There is already a character there. Please try another spot.");
    
  }//end of move
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  public static boolean checkWinner(){
    
    if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == board[0][3] && (board[0][0] == 'x' || board [0][0] == 'o'))
      return true;
    else if(board[0][1] == board[0][2] && board[0][2] == board[0][3] && board[0][3] == board[0][4] && (board[0][1] == 'x' || board[0][1] == 'o'))
      return true;
    else if(board[0][2] == board[0][3] && board[0][3] == board[0][4] && board[0][4] == board[0][5] && (board[0][2] == 'x' || board[0][2] == 'o'))
      return true;
    
    else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == board[1][3] && (board[1][0] == 'x' || board[1][0] == 'o'))
      return true;
    else if(board[1][1] == board[1][2] && board[1][2] == board[1][3] && board[1][3] == board[1][4] && (board[1][1] == 'x' || board[1][1] == 'o'))
      return true;
    else if(board[1][2] == board[1][3] && board[1][3] == board[1][4] && board[1][4] == board[1][5] && (board[1][2] == 'x' || board[1][2] == 'o'))
      return true;
    
    else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] == board[2][3] && (board[2][0] == 'x' || board[2][0] == 'o'))
      return true;
    else if(board[2][1] == board[2][2] && board[2][2] == board[2][3] && board[2][3] == board[2][4] && (board[2][1] == 'x' || board[2][1] == 'o'))
      return true;
    else if(board[2][2] == board[2][3] && board[2][3] == board[2][4] && board[2][4] == board[2][5] && (board[2][2] == 'x' || board[2][2] == 'o'))
      return true;
    
    else if(board[3][0] == board[3][1] && board[3][1] == board[3][2] && board[3][2] == board[3][3] && (board[3][0] == 'x' || board[3][0] == 'o'))
      return true;
    else if(board[3][1] == board[3][2] && board[3][2] == board[3][3] && board[3][3] == board[3][4] && (board[3][1] == 'x' || board[3][1] == 'o'))
      return true;
    else if(board[3][2] == board[3][3] && board[3][3] == board[3][4] && board[3][4] == board[3][5] && (board[3][2] == 'x' || board[3][2] == 'o'))
      return true;
    
    else if(board[4][0] == board[4][1] && board[4][1] == board[4][2] && board[4][2] == board[4][3] && (board[4][0] == 'x' || board[4][0] == 'o'))
      return true;
    else if(board[4][1] == board[4][2] && board[4][2] == board[4][3] && board[4][3] == board[4][4] && (board[4][1] == 'x' || board[4][1] == 'o'))
      return true;
    else if(board[4][2] == board[4][3] && board[4][3] == board[4][4] && board[4][4] == board[4][5] && (board[4][2] == 'x' || board[4][2] == 'o'))
      return true;
    
    else if(board[5][0] == board[5][1] && board[5][1] == board[5][2] && board[5][2] == board[5][3] && (board[5][0] == 'x' || board[5][0] == 'o'))
      return true;
    else if(board[5][1] == board[5][2] && board[5][2] == board[5][3] && board[5][3] == board[5][4] && (board[5][1] == 'x' || board[5][1] == 'o'))
      return true;
    else if(board[5][2] == board[5][3] && board[5][3] == board[5][4] && board[5][4] == board[5][5] && (board[5][2] == 'x' || board[5][2] == 'o'))
      return true;
    
    
    
    
    
    
    
    
    
    
    
    else
      return false;
    
}//end class
