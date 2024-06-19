import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello user! I am Sentient AI aka SAi. Welcome to the illusion of choice game!");
            System.out.println("I'll play with you a simple game, try to defeat me if you dare!");

            System.out.print("First, choose the limit: ");
            int N = scanner.nextInt(); // Reading the limit from the user
            
            // Determine who starts based on N % 3
            String currentTurn;
            if (N % 3 == 1) {
                System.out.println("SAi wishes you to start the game.");
                currentTurn = "User";
            } else {
                System.out.println("Great! Let's start! Good luck!");
                currentTurn = "Computer";
            }

            int currentNumber = 0;

            // Game loop
            while (currentNumber < N) {
                if (currentTurn.equals("User")) {
                    // User's turn
                    int turns;
                    do {
                        System.out.print("How many turns do you wish? (Only 1 or 2): ");
                        turns = scanner.nextInt();
                        if (turns != 1 && turns != 2) {
                            System.out.println("Ha! That's wrong choice! Don't try to oversmart me human! ");
                        }
                    } while (turns != 1 && turns != 2);
                    
                    currentNumber += turns;
                    System.out.println("User chooses: " + formatTurns(currentNumber, turns));
                    if (currentNumber == N) {
                        System.out.println("User wins!");
                        return;
                    }
                    currentTurn = "Computer";
                } else {
                    // Computer's turn
                    int choices;
                    if ((N - currentNumber - 1) % 3 == 0) {
                        choices = 1;
                    } else {
                        choices = 2;
                    }
                    currentNumber += choices;
                    System.out.println("SAi chooses: " + formatTurns(currentNumber, choices));
                    if (currentNumber == N) {
                        System.out.println("SAi Wins! Better luck next time human! Adios!");
                        return;
                    }
                    currentTurn = "User";
                }
            }
        } // Scanner is automatically closed at the end of the try-with-resources block
    }
    
    // Helper method to format turns
    private static String formatTurns(int currentNumber, int turns) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < turns; i++) {
            sb.append(currentNumber - turns + i + 1);
            if (i < turns - 1) {
                sb.append(" and ");
            }
        }
        return sb.toString();
    }
}
