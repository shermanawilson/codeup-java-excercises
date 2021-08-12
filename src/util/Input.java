package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {
    public static Scanner scanner;

    public Input() {
        this.scanner =  new Scanner(System.in);
    }

    public String getString() {
//        System.out.println("Say something: ");
        String userInput = scanner.nextLine();
        return userInput;
    }


    public static boolean yesNo() {
//        System.out.println("Do you like candy? (y/n)?");
        String usersResponse = scanner.nextLine();
        if(usersResponse.equals("yes") || usersResponse.contains("y")) {
            return true;
        }else {
            return false;
        }
    }

    public int getInt(int min, int max){

//        System.out.println("Give an integer between 1-10:");
        int userResponse = scanner.nextInt();
        if(userResponse < min || userResponse > max) {
//            System.out.println("Yay! "  + userResponse + " is within the range");
            return getInt(min,max);
        } else{
//            System.out.println("");
            return userResponse;
        }
    }

    int getInt(){


        System.out.println("Give an integer between 1-10:");
        int userResponse = scanner.nextInt();
        return userResponse;
    }

    double getDouble(double min, double max){

        System.out.println("Give an integer between 1-10:");
        double userResponse = scanner.nextDouble();
        if(userResponse < min || userResponse > max) {
            System.out.println("Yay! "  + userResponse + " is within the range");
            return getDouble(min,max);
        } else{
            System.out.println("That's a valid decimal");
            return userResponse;
        }
    }

    public double getDouble(){

        System.out.println("Give an integer between 1-10:");
        double userResponse = scanner.nextDouble();
        return userResponse;
    }

}//end of input