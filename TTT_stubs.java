import java.util.*; 

class TTT_stubs{

   public static void main(String argv[]){
   
   // set up, board, display board, symbol and gameState (ongoing, tie, win)
      char []playBoard = {'#','#','#','#','#','#','#','#','#'};
      char[][] displayBoard = {{' ','|',' ','|',' '},
                              {'-','+','-','+','-'}, 
                              {' ','|',' ','|',' '},
                              {'-','+','-','+','-'}, 
                              {' ','|',' ','|',' '}};
   
      char symbol = 'X';
      int gameState = 0; 
      while(gameState ==0){
      // 0: continue (game not over)
      // 1: tie
      // 2: last player who made a move won
      
      // take turn
         int choice = makeChoice(playBoard,symbol); 
      
      //update boards
         playBoard[choice] = symbol; 
         updateBoard(displayBoard,choice, symbol);
      
      // game state 0: ongoing 1: tie 2: win
         gameState = getGameState(playBoard); 
      
      // display 
         display(displayBoard);
         symbol = togglePlayer(symbol);
      }//while
      
     // rewind to previous player, who won
      reportResults(gameState, togglePlayer(symbol)); 
   }// main

   static void reportResults(int state, char player){
        
   }

   static char togglePlayer(char s){
      return('Z');
   }
   static int getGameState(char [] b){
      return(0);  
   }


   static char[][] updateBoard(char [][] db, int ch, char sym){
      return (db);
   }
   
   static void display(char [][]b){                  
   }
   
   static int makeChoice(char []b, char s){
      return(0);
   } //make choice
   
}// TTT
