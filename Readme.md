# CS611-Assignment 1
# Tic Tac Toe and other variants
---------------------------------------------------------------------------
- Name: Amogh Mittal
- Email: amittal2@bu.edu
- Student ID: U65464717

## Files
---------------------------------------------------------------------------

Main.java - Executes the file, calls playGame method from Game Admin

Piece.java - Defines a piece, attributes associated with a piece (here symbol)

Player.java - Defines the attributes of a player like name, symbol and score

Board.java - Defines a board structure which can be used for any board game with n x n grid, also contains method for placing pieces in the board

GameAdmin.java - The first step of user interface where the user chooses game and game mode, basically sets up the game

BoardGame.java - The parent class for any board game, has all the basic attributes and methods which are common in  most board games

TicTacToeController.java - Extends the BoardGame.java class and lets user play the Tic tac toe game according to the Tic Tac Toe game rules

OrderAndChaosController.java - Extends the BoardGame.java class and lets user play the Order and Chaos game according to the Order and Chaos game rules





## Notes
---------------------------------------------------------------------------
User can play single player (with CPU playing random moves) as well as multiplayer game modes

User can play multiple games and keep record of the total points won against CPU or other user

User can change game after every round and total points of all results are added in the tally

User can play Tic Tac Toe on boards as big as 10 x 10 size

User can Quit the game by pressing Q


## How to compile and run
---------------------------------------------------------------------------
Your directions on how to run the code. Make sure to be as thorough as possible!

1. Navigate to the directory <<#YourCodeDirectory>> after unzipping the files
2. Run the following instructions:
   javac *.java
   java Main


## Input/Output Example
---------------------------------------------------------------------------
Please give us a full execution of what we should see on the screen. Label each text with input and output. For example:

```
    < PLAY THROUGH HERE >
    
Playing with CPU example : 
#Output
Welcome!
1. Tic Tac Toe
2. Order and Chaos
Q. Quit game
Choose one from (1, 2 or Q): 1 (#Input)
#Output
1. Single Player
2. Multiplayer
Choose a game mode (1 or 2): 1 (#Input)
Enter Player 1 name: Amogh (#Input)
Enter board size (3-10): 4 (#Input)
#Output
- - - - 
- - - - 
- - - - 
- - - - 
Amogh's turn (X)
Enter row and column (0-3): 0 0 (#Input)
X - - - 
- - - - 
- - - - 
- - - - 
CPU's turn (O)
CPU placed at: 2, 1
X - - - 
- - - - 
- O - - 
- - - - 
Amogh's turn (X)
Enter row and column (0-3): 1 1 (#Input)
X - - - 
- X - - 
- O - - 
- - - - 
CPU's turn (O)
CPU placed at: 3, 3
X - - - 
- X - - 
- O - - 
- - - O 
Amogh's turn (X)
Enter row and column (0-3): 0 2 (#Input)
X - X - 
- X - - 
- O - - 
- - - O 
CPU's turn (O)
Invalid move!
Invalid move!
CPU placed at: 1, 0
X - X - 
O X - - 
- O - - 
- - - O 
Amogh's turn (X)
Enter row and column (0-3): 0 1 (#Input)
X X X - 
O X - - 
- O - - 
- - - O 
CPU's turn (O)
CPU placed at: 0, 3
X X X O 
O X - - 
- O - - 
- - - O 
Amogh's turn (X)
Enter row and column (0-3): 1 2 (#Input)
X X X O 
O X X - 
- O - - 
- - - O 
CPU's turn (O)
Invalid move!
CPU placed at: 3, 0
X X X O 
O X X - 
- O - - 
O - - O 
Amogh's turn (X)
Enter row and column (0-3): 2 2 (#Input)
X X X O 
O X X - 
- O X - 
O - - O 
CPU's turn (O)
Invalid move!
CPU placed at: 3, 2
X X X O 
O X X - 
- O X - 
O - O O 
Amogh's turn (X)
Enter row and column (0-3): 1 3 (#Input)
X X X O 
O X X X 
- O X - 
O - O O 
CPU's turn (O)
Invalid move!
CPU placed at: 3, 1
X X X O 
O X X X 
- O X - 
O O O O 
CPU wins!
Scores:
Amogh: 0
CPU: 1
Game Over!
Press Enter to continue or 'Q' to quit
(#Input)
1. Tic Tac Toe
2. Order and Chaos
Q. Quit game
Choose one from (1, 2 or Q): 2 (#Input)
1. Single Player
2. Multiplayer
Choose a game mode (1 or 2): 1 (#Input)
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 0 0 (#Input)
Enter symbol (X or O): x (#Input)
X - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
CPU's turn
CPU placed X at: 3, 3
X - - - - - 
- - - - - - 
- - - - - - 
- - - X - - 
- - - - - - 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 1 1 (#Input)
Enter symbol (X or O): x (#Input)
X - - - - - 
- X - - - - 
- - - - - - 
- - - X - - 
- - - - - - 
- - - - - - 
CPU's turn
CPU placed X at: 2, 0
X - - - - - 
- X - - - - 
X - - - - - 
- - - X - - 
- - - - - - 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 2 2 (#Input)
Enter symbol (X or O): x (#Input)
X - - - - - 
- X - - - - 
X - X - - - 
- - - X - - 
- - - - - - 
- - - - - - 
CPU's turn
CPU placed X at: 3, 1
X - - - - - 
- X - - - - 
X - X - - - 
- X - X - - 
- - - - - - 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 4 4 (#Input)
Enter symbol (X or O): x (#Input)
X - - - - - 
- X - - - - 
X - X - - - 
- X - X - - 
- - - - X - 
- - - - - - 
Order wins!
Scores:
Amogh (Order): 1
CPU (Chaos): 1
Game Over!
Press Enter to continue or 'Q' to quit
q (#Input)
Thanks for playing!

2 Player Game example : 

#Output
Welcome!
1. Tic Tac Toe
2. Order and Chaos
Q. Quit game
Choose one from (1, 2 or Q): 2 (#Input)
1. Single Player
2. Multiplayer
Choose a game mode (1 or 2): 2 (#Input)
Enter Player 1 name: Amogh (#Input)
Enter Player 2 name: Amey (#Input)
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 0 0 (#Input)
Enter symbol (X or O): o (#Input)
O - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
Amey's turn
Enter row and column (0-5): 1 5 (#Input)
Enter symbol (X or O): x (#Input)
O - - - - - 
- - - - - X 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 1 1 (#Input)
Enter symbol (X or O): o (#Input)
O - - - - - 
- O - - - X 
- - - - - - 
- - - - - - 
- - - - - - 
- - - - - - 
Amey's turn
Enter row and column (0-5): 2 5 (#Input)
Enter symbol (X or O): x (#Input)
O - - - - - 
- O - - - X 
- - - - - X 
- - - - - - 
- - - - - - 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 3 3 (#Input)
Enter symbol (X or O): o (#Input)
O - - - - - 
- O - - - X 
- - - - - X 
- - - O - - 
- - - - - - 
- - - - - - 
Amey's turn
Enter row and column (0-5): 4 5 (#Input)
Enter symbol (X or O): o (#Input)
O - - - - - 
- O - - - X 
- - - - - X 
- - - O - - 
- - - - - O 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 2 2 (#Input)
Enter symbol (X or O): o (#Input)
O - - - - - 
- O - - - X 
- - O - - X 
- - - O - - 
- - - - - O 
- - - - - - 
Amey's turn
Enter row and column (0-5): 0 5 (#Input)
Enter symbol (X or O): x (#Input)
O - - - - X 
- O - - - X 
- - O - - X 
- - - O - - 
- - - - - O 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 0 3 (#Input)
Enter symbol (X or O): x (#Input)
O - - X - X 
- O - - - X 
- - O - - X 
- - - O - - 
- - - - - O 
- - - - - - 
Amey's turn
Enter row and column (0-5): 0 4 (#Input)
Enter symbol (X or O): o (#Input)
O - - X O X 
- O - - - X 
- - O - - X 
- - - O - - 
- - - - - O 
- - - - - - 
Amogh's turn
Enter row and column (0-5): 4 4 (#Input)
Enter symbol (X or O): o (#Input)
O - - X O X 
- O - - - X 
- - O - - X 
- - - O - - 
- - - - O O 
- - - - - - 
Order wins!
Scores:
Amogh (Order): 1
Amey (Chaos): 0
Game Over!
Press Enter to continue or 'Q' to quit
(#Input)
1. Tic Tac Toe
2. Order and Chaos
Q. Quit game
Choose one from (1, 2 or Q): 1 (#Input)
1. Single Player
2. Multiplayer
Choose a game mode (1 or 2): 2 (#Input)
Enter board size (3-10): 5 (#Input)
- - - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Amogh's turn (X)
Enter row and column (0-4): 0 0 (#Input)
X - - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Amey's turn (O)
Enter row and column (0-4): 1 0 (#Input)
X - - - - 
O - - - - 
- - - - - 
- - - - - 
- - - - - 
Amogh's turn (X)
Enter row and column (0-4): 0 1 (#Input)
X X - - - 
O - - - - 
- - - - - 
- - - - - 
- - - - - 
Amey's turn (O)
Enter row and column (0-4): 4 4 (#Input)
X X - - - 
O - - - - 
- - - - - 
- - - - - 
- - - - O 
Amogh's turn (X)
Enter row and column (0-4): 0 2 (#Input)
X X X - - 
O - - - - 
- - - - - 
- - - - - 
- - - - O 
Amey's turn (O)
Enter row and column (0-4): 3 3 (#Input)
X X X - - 
O - - - - 
- - - - - 
- - - O - 
- - - - O 
Amogh's turn (X)
Enter row and column (0-4): 0 3 (#Input)
X X X X - 
O - - - - 
- - - - - 
- - - O - 
- - - - O 
Amey's turn (O)
Enter row and column (0-4): 2 3 (#Input)
X X X X - 
O - - - - 
- - - O - 
- - - O - 
- - - - O 
Amogh's turn (X)
Enter row and column (0-4): 0 5 (#Input)
Invalid move!
Enter row and column (0-4): 0 4 (#Input)
X X X X X 
O - - - - 
- - - O - 
- - - O - 
- - - - O 
Amogh wins!
Scores:
Amogh: 2
Amey: 0
Game Over!
Press Enter to continue or 'Q' to quit
Q (#Input)
Thanks for playing!


