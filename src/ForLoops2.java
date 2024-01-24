import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForLoops2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "pear", "plum"};
        for (int counter=0; counter < fruits.length; counter++) {
            System.out.printf("The current fruit is %s%n", fruits[counter]);
        }

        // enhanced for loop
        for (String fruit : fruits) {
            System.out.printf("The current fruit is %s%n", fruit);
        }

        String people = """
                Flinstone, Fred, 1/1/1900
                Rubble, Barney, 2/2/1905
                Flinstone, Wilma, 3/3/1910
                Rubble, Betty, 4/4/1915
                """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})\\n";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

        while (mat.find()) {
            System.out.printf("%s %s %s%n", mat.group("firstName"), mat.group("lastName"), mat.group("dob"));
        }
    }
}
