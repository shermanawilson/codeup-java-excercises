import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Continue?(y/n)?");
        String userInput = scanner.next();

        // DON'T DO THIS
        if ("I am a string" == "I am a string") {
            System.out.println("Strings are equal");
        }

        // Do this instead!
        if ("I am a string".equals("I am a string")) {
            System.out.println("Strings are equal");
        }


        String input = "Codeup Rocks!";

        input.equals("codeup rocks!"); // false
        input.equals("Codeup Rocks!"); // true

        input.equalsIgnoreCase("codeup rocks!"); // true
        input.equalsIgnoreCase("Codeup Rocks!"); // true

        input.startsWith("codeup"); // false
        input.startsWith("Codeup"); // true

        input.endsWith("rocks"); // false
        input.endsWith("rocks!"); // false
        input.endsWith("Rocks!"); // true




    }




}
