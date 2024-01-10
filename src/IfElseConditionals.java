import java.util.Random;

public class IfElseConditionals {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(3) + 1; // 1, 2, or 3
        System.out.printf("Generated number is: %d.%n", randomNum);

        if (randomNum == 3) {
            System.out.println("We've got a winner!");
        } else if (randomNum == 2) {
            System.out.println("No winner here =[");
        } else {
            System.out.println("We've got a loser =[");
        }

        // A bad if else if statement:
        /*
        String command = null;
        if (command.equals("stop")) {
            System.out.println("Stopping now...");
        } else if (command.equals("go")) {
            System.out.println("Going now...");
        }
        // throws an error:
        //  Cannot invoke "String.equals(Object)" because "command" is null
        */

        // An alternative:
        String command = null;
        if ("stop".equals(command)) {
            System.out.println("Stopping now...");
        } else if ("go".equals(command)) {
            System.out.println("Going now...");
        }
        // results in no output

    }
}
