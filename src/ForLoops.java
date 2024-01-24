import java.util.Random;

public class ForLoops {

    public static final int MAX_ALLOWED_TRIES = 4;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        System.out.printf("Random number is %d.%n", randomNum);
        String guessedNumText = null;
        int wrongGuessCount = 1;

        for (; wrongGuessCount <= MAX_ALLOWED_TRIES; wrongGuessCount++) {
            guessedNumText = System.console().readLine("Please guess a number between 1 and 10: ");
            if (guessedNumText.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(guessedNumText);
                if (guessedNum == randomNum) {
                    String tryText = wrongGuessCount == 1 ? "try" : "tries";
                    System.out.printf("The random number was %d. You guessed in %d %s%n", randomNum, wrongGuessCount, tryText);
                    break;
                } else {
                    System.out.printf("You didn't get it!%n");
                    continue;
                }
                // System.out.println("This line would be unreachable");
            }
        }

        if (wrongGuessCount >= MAX_ALLOWED_TRIES) {
            System.out.printf("You had %d incorrect guesses.  The number was %d%n", wrongGuessCount - 1, randomNum);
        }
        System.out.println("Program ended%n");

    }
}
