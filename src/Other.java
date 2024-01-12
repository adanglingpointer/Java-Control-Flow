import static java.lang.StringTemplate.STR;

public class Other {
    public static void main(String[] args) {

        // casting an object as a string
        String var = "Hello World!";
        Object obj = var;
        String msg = (String) obj;
        System.out.println(obj); // Hello World!

        // JDK21 - string templating
        String[] arr = {"hello", "world"};
        System.out.printf("An array with %d elements", arr.length);
        // alternative of string template:
        System.out.println(STR."An array with \{arr.length} elements");
    }
}
