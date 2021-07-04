import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        //Create a 3 by 3 array that represents the dimensions of the board
        char[][] obstructionBoard = new char[3][3];

        //Starts the board with empty values (dashes)
        for(int i = 0; i < 3; i++) {
            for(int m = 0; m < 3; m++) {
                obstructionBoard[i][m] = '-';
            }
        }

        //Scanner for user input
        Scanner playerInout = new Scanner(System.in);
        System.out.println("Welcome to the Obstruction Game (AKA Tic Tac Toe)!");
        System.out.print("Player one, please enter your name ");
        String playerOne = playerInout.nextLine();
        System.out.print("Player two, please enter your name ");
        String playerTwo = playerInout.nextLine();

        //pOne boolean variable created for the first player. True if its player one's turn to play, false otherwise.
        boolean pOne = true;

        //gameCompleted boolean variable created and use if for conditional statement
        boolean gameCompleted = false;
        while(!gameCompleted) {

            //call drawObstructionBoard method to draw the board
            drawObstructionBoard(obstructionBoard);

            //displays the which player's turn it is
            if(pOne) {
                System.out.println(playerOne + "'s Turn (x):");
            } else {
                System.out.println(playerTwo + "'s Turn (o):");
            }

            //Char variable created which stores x or o based at who's turn it is
            char c = '-';
            if(pOne) {
                c = 'x';
            } else {
                c = 'o';
            }

           //Column and row variables created in order to represent the indexes which correlate to a position on the board
            int row = 0;
            int column = 0;

            //while loop which if statement that states only break out of the while loop only once user is at a position that is valid
            while(true) {

                 //Requires user to input where they want their position to be at
                System.out.print("Enter 0, 1, or 2 for the row: ");
                row = playerInout.nextInt();
                System.out.print("Enter 0, 1, or 2 for the column: ");
                column = playerInout.nextInt();

                //Check if the row and col are 0, 1, or 2
                if(row < 0 || column < 0 || row > 2 || column > 2) {
                    //prints friendly message that the position in not within bounds
                    System.out.println("This number and position is not within the bounds, choose 0, 1, or 2");


                } else if(obstructionBoard[row][column] != '-') {
                    //prints friendly message that the position has already been taken
                    System.out.println("This position has already been taken, please choose another position");


                } else {
                    //else break loop as position chosen is valid
                    break;
                }

            }

            //the position set at row and column to c
            obstructionBoard[row][column] = c;

            //verifies if either player has won the match
            if(playerWins(obstructionBoard) == 'x') {
                System.out.println(playerOne + " has won the match!");
                gameCompleted = true;
            } else if(playerWins(obstructionBoard) == 'o') {
                System.out.println(playerTwo + " has won the match!");
                gameCompleted = true;
            } else {

                //if statement to check for a draw, displays out a message that it's a tie if no players has won
                if(boardIsFull(obstructionBoard)) {
                    System.out.println("It's a draw!");
                    gameCompleted = true;
                } else {
                    //Switches pOne (player1) to false to change player turns
                    pOne = !pOne;
                }

            }

        }

        //call drawObstructionBoard method to draw the board
        drawObstructionBoard(obstructionBoard);

    }

    //Create method to draw the board
    public static void drawObstructionBoard(char[][] obstructionBoard) {
        System.out.println("Board:");
        for(int i = 0; i < 3; i++) {
            //The inner for loop prints out each row of the obstructionBoard
            for(int m = 0; m < 3; m++) {
                System.out.print(obstructionBoard[i][m]);
            }
            //empty print statement to seperate out the rows
            System.out.println();
        }
    }

    //Create method to verify if a player has won the game and return the win char array value
    public static char playerWins(char[][] obstructionBoard) {

        //verifies each row
        for(int r = 0; r < 3; r++) {
            if(obstructionBoard[r][0] == obstructionBoard[r][1] && obstructionBoard[r][1] == obstructionBoard[r][2] && obstructionBoard[r][0] != '-') {
                return obstructionBoard[r][0];
            }
        }

        //verifies each column
        for(int c = 0; c < 3; c++) {
            if(obstructionBoard[0][c] == obstructionBoard[1][c] && obstructionBoard[1][c] == obstructionBoard[2][c] && obstructionBoard[0][c] != '-') {
                return obstructionBoard[0][c];
            }
        }

        //verifies the diagonals
        if(obstructionBoard[0][0] == obstructionBoard[1][1] && obstructionBoard[1][1] == obstructionBoard[2][2] && obstructionBoard[0][0] != '-') {
            return obstructionBoard[0][0];
        }
        if(obstructionBoard[2][0] == obstructionBoard[1][1] && obstructionBoard[1][1] ==  obstructionBoard[0][2] && obstructionBoard[2][0] != '-') {
            return obstructionBoard[2][0];
        }

        //returns empty string if there is no winner yet
        return ' ';

    }

    //Create a method to verify whether all position within the board are filled in
    public static boolean boardIsFull(char[][] obstructionBoard) {
        for(int i = 0; i < 3; i++) {
            for(int m = 0; m < 3; m++) {
                if(obstructionBoard[i][m] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
