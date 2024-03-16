import java.util.Scanner;

public class PongGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME!!");
        System.out.println("press 1 for pong game");
        System.out.println("press 2 for Tic Tac Toe");
        System.out.println("press 3 for Sudoku solver");
        int a = sc.nextInt();
if(a==1) {GameFrame frame = new GameFrame();}
    //    --------------------------------------------------------------
               //sudoku

      if(a==3) {
          System.out.println("Enter number row-wise to insert into sudoku:");
          System.out.println("Inplace place of empty grid use 0:");
        /*  int[][] board = {
                  {7, 0, 2, 0, 5, 0, 6, 0, 0},
                  {0, 0, 0, 0, 0, 3, 0, 0, 0},
                  {1, 0, 0, 0, 0, 9, 5, 0, 0},
                  {8, 0, 0, 0, 0, 0, 0, 9, 0},
                  {0, 4, 3, 0, 0, 0, 7, 5, 0},
                  {0, 9, 0, 0, 0, 0, 0, 0, 8},
                  {0, 0, 9, 7, 0, 0, 0, 0, 5},
                  {0, 0, 0, 2, 0, 0, 0, 0, 0},
                  {0, 0, 7, 0, 4, 0, 2, 0, 3}
                 }; */
          int[][] board = new int[9][9];
          for(int i=0; i<9;i++)
          {
              for(int j=0; j<9;j++)
              {
                  board[i][j]=sc.nextInt();
              }
          }
          SudokuSolver.printBoard(board);

          if (SudokuSolver.solveBoard(board)) {
              System.out.println("Solved successfully!");
          } else {
              System.out.println("Unsolvable board :(");
          }

          SudokuSolver.printBoard(board);
      }
        //*********************************
        //tic tac toe
        if(a==2) {
            int replay;
            TicTacToe game = new TicTacToe();
            game.in = new Scanner(System.in);
            System.out.println("Welcome to Tic Tac Toe");
            System.out.println("Use numbers 1-9 to select a square");
            System.out.println("_1_|_2_|_3_|");
            System.out.println("_4_|_5_|_6_|");
            System.out.println("_7_|_8_|_9_|");
            System.out.println("Player X's turn");
            game.play();
            System.out.println("Would you like to play again?(1 = Yes & 2 = No): ");
            replay = game.in.nextInt();
            while (replay != 2) {
                game.init();
                game.play();
                System.out.println("Would you like to play again?(1 = Yes & 2 = No): ");
                replay = game.in.nextInt();
            }
            game.in.close();
            System.out.println("How about a nice game of pong :p");

        }

    }
}



//*********************************


//*********************************


//*********************************

