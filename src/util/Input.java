package util;


import java.util.Scanner;

public class Input {
    public static Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public static String getString() {
//        System.out.println("Say something: ");
        String userInput = scanner.nextLine();
        return userInput;
    }


    public static boolean yesNo() {
        System.out.println("Do you like candy? (y/n)?");
        String usersResponse = scanner.nextLine();
        if (usersResponse.equals("yes") || usersResponse.contains("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max) {

        System.out.println("Give an integer between 1-10:");
        int userResponse = scanner.nextInt();


        if (userResponse < min || userResponse > max) {
            System.out.println("Yay! " + userResponse + " is within the range");
            return getInt(min, max);
        } else {
            System.out.println("");
            return userResponse;
        }
    }

    public static int getInt() {
        System.out.println("Enter a number: ");
        String s = getString();
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Not a number. Try again!");
            return getInt();
        }
    }

    double getDouble(double min, double max) {

        System.out.println("Give an integer between 1-10:");
        double userResponse = scanner.nextDouble();
        if (userResponse < min || userResponse > max) {
            System.out.println("Yay! " + userResponse + " is within the range");
            return getDouble(min, max);
        } else {
            System.out.println("That's a valid decimal");
            return userResponse;
        }
    }

    public double getDouble() {
        System.out.println("Enter a number: ");
        String s = getString();
        try {
            return Double.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Not a number. Try again!");
            return getDouble();
        }
    }

    public int getBinary() {
        System.out.println("Enter a binary number:");
        try {
            return Integer.valueOf(this.getString(), 2);
        } catch (NumberFormatException e) {
            System.out.println("That is not a binary number");
            return getBinary();
        }
    }

    public int getHex() {
        System.out.println("Enter a hexadecimal number:");
        try {
            return Integer.valueOf(this.getString(), 16);
        } catch (NumberFormatException e) {
            System.out.println("That is not a double!");
            return getHex();
        }
    }

}//end of input