/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Ke'Ondrae
 */

import java.util.Scanner; 
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        char [][] board = new char [3][3];
        
       //Board Layout
       board[0][0] = ' ';      board[1][0] = ' ';     board[2][0] = ' ';
       board[0][1] = ' ';      board[1][1] = ' ';     board[2][1] = ' ';
       board[0][2] = ' ';      board[1][2] = ' ';     board[2][2] = ' ';
       
       gameIntro();
        

        
           
        
    }
    
    
   static void genBoard (char [][] board){
   
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
   
   }  
   
   
   static void gamePlay(char [][] board){
    char playerOne = 'X';
    char playerTwo = 'O';
  
        //Space
        System.out.println();

        //Gen board
         genBoard(board);
         
         //Player One move
        playerOneMove(playerOne);
        
        //space
        System.out.println();
        
          genBoard(board);
          
          //space
        System.out.println();
        
        //Player Two Move
        playerTwoMove(playerTwo);
        
         //space
        System.out.println();
       
       genBoard(board);
   }
   
   static void playerOneMove(char playerOne, char [][] board, String playerOneName){
        int rowNum;
        int columnNum;
        
        Scanner userInput = new Scanner(System.in);
        
     System.out.println(playerOneName + " Its your turn");
        
        System.out.println("Enter a row number 0-2.");
            rowNum = userInput.nextInt(); 
            
        System.out.println("Now column number 0-2.");
            columnNum = userInput.nextInt();
            
        board[columnNum][rowNum] = playerOne;
   
   }
   
   
  static void playerTwoMove(char playerTwo, char [][] board,String playerTwoName){
      int rowNum;
      int columnNum;
      Scanner userInput = new Scanner(System.in);
      
   System.out.println(playerTwoName + " Its your turn");
        
        System.out.println("Enter a row number 0-2.");
            rowNum = userInput.nextInt(); 
            
        System.out.println("Now column number 0-2.");
            columnNum = userInput.nextInt();
            
        board[columnNum][rowNum] = playerTwo;    
  } 
  
  static boolean playerOneWinCheck(char [][] board, char playerOne){
  
      if((board [0][0] == playerOne && board [1][0] == playerOne && board [2][0] == playerOne) ||
         (board [0][1] == playerOne && board [1][1] == playerOne && board [2][1] == playerOne) ||
         (board [0][2] == playerOne && board [1][2] == playerOne && board [2][2] == playerOne) ||
         (board [0][0] == playerOne && board [1][1] == playerOne && board [2][2] == playerOne) ||
         (board [2][0] == playerOne && board [1][1] == playerOne && board [0][2] == playerOne) ||
         (board [0][0] == playerOne && board [0][1] == playerOne && board [0][2] == playerOne) ||
         (board [1][0] == playerOne && board [1][1] == playerOne && board [1][2] == playerOne) ||
         (board [2][0] == playerOne && board [1][2] == playerOne && board [2][2] == playerOne)    ){
      
      return true;
      
      }
      else{
      
          
          System.out.println("Player One has won the game.");
            return false;
      }    
      
      //Board [+][0] is first row
      //Board [+][1] is second row
      //Board [+][2] is third row
      //Board [0,0], [1,1], [2,2] is diagnal top left to bottom right
      //Board [2,0], [1,1], [0,2] is diagnal top right to bottom left
      
      
      //Board Layout here because I forgot what that layout was 
//       board[0][0] = ' ';      board[1][0] = ' ';     board[2][0] = ' ';
//       board[0][1] = ' ';      board[1][1] = ' ';     board[2][1] = ' ';
//       board[0][2] = ' ';      board[1][2] = ' ';     board[2][2] = ' ';
          
  }
  
   static boolean playerTwoWinCheck(char [] [] board, char playerTwo){
  
  
      if((board [0][0] == playerTwo && board [1][0] == playerTwo && board [2][0] == playerTwo) ||
         (board [0][1] == playerTwo && board [1][1] == playerTwo && board [2][1] == playerTwo) ||
         (board [0][2] == playerTwo && board [1][2] == playerTwo && board [2][2] == playerTwo) ||
         (board [0][0] == playerTwo && board [1][1] == playerTwo && board [2][2] == playerTwo) ||
         (board [2][0] == playerTwo && board [1][1] == playerTwo && board [0][2] == playerTwo) || 
         (board [0][0] == playerTwo && board [0][1] == playerTwo && board [0][2] == playerTwo) ||
         (board [1][0] == playerTwo && board [1][1] == playerTwo && board [1][2] == playerTwo) ||
         (board [2][0] == playerTwo && board [1][2] == playerTwo && board [2][2] == playerTwo)     ){
      
      return true;
      
      }
      else{
      
           System.out.println("Player Two has won the game.");
          return false;
      
      }    
  }
   
   static void gameIntro (){
       Scanner userInput = new Scanner(System.in);
       String playerOneName;  
       String playerTwoName;
       
   //Start of intro
        System.out.println("Welcome to the Tic Tac Tow game, This is a two player game. Player one please enter your name.");
            playerOneName = userInput.next();  
            
        System.out.println("Player two please enter your name.");
            playerTwoName = userInput.next();
            
        System.out.println("Okay lets get started.");    
        System.out.println(playerOneName + " is \"X\" and " + playerTwoName + " is \"O\" ");
        //End of intro    
        
   }
  
  
}


