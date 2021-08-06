package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString() {

    }

    public boolean yesNo() {

        String usersResponse = scanner.nextLine();
        if(usersResponse.contains("y")) {
            return true;
        }else {
            return false;
        }
    }

    int getInt(int min, int max){

        System.out.println("Give an integer between 1-10:");
        int number = scanner.nextInt();
        if(number < max) {

        } else if(number > min){

        }else {

        }
    }

    int getInt(){

    }

    double getDouble(double min, double max){

    }

    double getDouble(){

    }

}//end of input