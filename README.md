# Tic Tac Toe - Java Console Game

This is a simple **Tic-Tac-Toe** game implemented in Java. The game is designed for two players who take turns choosing positions on a 3x3 grid. Player 1 plays with the symbol `"X"` and Player 2 with `"O"`. The first player to get three of their symbols in a row (horizontally, vertically, or diagonally) wins the game. If all nine squares are filled without a winner, the game ends in a tie.

## Features

- Two-player gameplay (Player 1 as `"X"` and Player 2 as `"O"`)
- Interactive user input for choosing grid positions
- Validation of user input to avoid invalid or duplicate choices
- Display of the game board after each move
- Win detection based on rows, columns, and diagonals
- Announcement of the winner or a tie

## How to Play

1. **Run the game**: When you start the game, a 3x3 grid is displayed with numbers 1 to 9 representing the positions on the board.

2. **Choose a position**: Player 1 will be prompted to choose a position for `"X"`, followed by Player 2 who will choose a position for `"O"`. 

3. **Invalid input**: If a player inputs an invalid position (a number out of the 1-9 range or a position already occupied), the program will exit with an error message.

4. **Winning conditions**: The game checks for a winner after each move. A player wins if they get three of their symbols in a row horizontally, vertically, or diagonally.

5. **Tie**: If all positions are filled and no player has won, the game ends in a tie.



