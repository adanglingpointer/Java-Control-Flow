import java.util.Random;

public class IfElseConditionals {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(3) + 1; // 1, 2, or 3
        System.out.printf("Generated number is: %d.%n", randomNum);

        if (randomNum == 3) {
            System.out.println("We've got a winner!");
        } else {
            System.out.println("We've got a loser =[");
        }
    }
}
