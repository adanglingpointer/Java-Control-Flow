import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(5) + 1;
        System.out.printf("Generated number is: %d.%n", randomNum);

        switch (randomNum) {
            case 1:
                System.out.println("The color is RED");
                break;
            case 2:
                System.out.println("The color is BLUE");
                break;
            case 3:
                System.out.println("The color is GREEN");
                break;
            case 4:
                System.out.println("The color is PURPLE");
                break;
            default:
                System.out.println("The color is WHATEVER");
        }

        // new switch capability since Java 14
        String card = "ace";
        int currentTotalValue = 15;

        int currentValue = switch (card) {
            case "king", "queen", "jack" -> 10;
            case "ace" -> {
                if (currentTotalValue < 11) {
                    yield 11;
                } else {
                    yield 1;
                }
            }
            default -> Integer.parseInt(card);
        };
        System.out.printf("Current Card Value: %d%n", currentValue);
        System.out.printf("Total value: %d%n", currentTotalValue + currentValue);

        // new pattern matching for switches in JDK 21

    }
}
