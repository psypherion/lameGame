# lameGame
## Game Title
: **Illusion of Choice**
___

"LameGame" is a simple yet intriguing two-player game where a human competes against a computer. The objective is to pick numbers sequentially until reaching a predefined limit. The catch? The computer uses a strategic algorithm to ensure it always wins, giving the illusion of choice to the player.

## Objective
Users will be given choices and the impression that they can win, but the system will always win!

## Game Rules
It is a two-player game between a human and a computer program. One player can choose one or two integers starting from 1, and the other must pick up the next one or two integers. There will be a predefined limit (user input); whoever gets to pick that integer wins the game!

## Game Algorithm

### Modulo 3 Strategy Explanation

#### Understanding Modulo 3

Numbers can be categorized based on their remainder when divided by 3:
- ( N % 3 == 0 ): Numbers that are multiples of 3.
- ( N % 3 == 1 ): Numbers that leave a remainder of 1.
- ( N % 3 == 2 ): Numbers that leave a remainder of 2.

### Algorithm Strategy

**Initial Position:**
- If ( N % 3 == 1 ), the computer lets the user start because the user is already in a losing position.

**Computer's Turn:**
- If ( N % 3 == 0 ) or ( N % 3 == 2 ):
  - The computer calculates ( (N - currentNumber - 1) % 3 ):
    - If the result is 0, the computer picks 1 number.
    - If the result is not 0, the computer picks 2 numbers.
  - This ensures that after the user's turn, the number left is congruent to 1 modulo 3, putting the user in a disadvantageous position.

**User's Turn:**
- The user picks 1 or 2 numbers, and the algorithm recalculates based on the new current number.

**Repeat:**
- Steps 2 and 3 are repeated until the game concludes with the computer winning by picking the last number.

### Example Scenario

Suppose ( N = 10 ):
- Initial state: ( currentNumber = 0 )
- Computer's Turn: ( (10 - 0 - 1) % 3 = 9 % 3 = 0 ) → Computer picks 1 number.
  - ( currentNumber = 1 )
- User's Turn: User picks 1 number → ( currentNumber = 2 )
- Computer's Turn: ( (10 - 2 - 1) % 3 = 7 % 3 = 1 ) → Computer picks 2 numbers.
  - ( currentNumber = 4 )
- Repeat steps until the game concludes with the computer picking the last number.

### Summary

This algorithm effectively uses modulo 3 to control the game and ensure a winning outcome for the computer by systematically forcing the user into positions where they cannot avoid leaving a number congruent to 1 modulo 3 after their turn. The simplicity and effectiveness of modulo 3 in categorizing game states make it an optimal choice for this game strategy.

## How to Run the Code

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/ky13-troj/lameGame.git
   cd lameGame
   ```
2. Running the Python Code
Run the Python game:
  ```bash
python lameGame.py
```
3. Running the Java Code
Compile and run the Java game:
  ```bash
javac Game.java
java Game
```
## How the Code Works
The game starts by prompting the user to choose a limit (N).
Based on N % 3, the game decides whether the user or the computer starts.
The game alternates turns between the user and the computer.
The computer uses a modulo 3 strategy to ensure it always wins if the user follows the rules.
The game ends when either the user or the computer reaches the chosen limit N, with the computer designed to win.
Enjoy playing my lamegame "Illusion of Choice" !
