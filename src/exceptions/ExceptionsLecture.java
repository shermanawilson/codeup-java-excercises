package exceptions;


import util.Input;

import java.util.InputMismatchException;

public class ExceptionsLecture {


    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};

//        System.out.println(myArray[5]); // this is not supposed to work!

//        throw new RuntimeException("I'm basically just a signal"); // throw will end function call
//        System.out.println("End of program");

        //CATCHING EXCEPTIONS

        try {
            // something that might go wrong
            System.out.println("Let's see..");
           int result = 1 / 0;
            System.out.println("I can divide by zero!");

        } catch (RuntimeException e) {
            //handle the error
            System.out.println("Math still works!");
        } finally {
            //finally block that will always run, regardless of if an exception is thrown or not.
            System.out.println("** This will literally always run .. oh yay **");
        }
        // Program resumes normally here
        System.out.println("End of program");


        try {
            Input input = new Input();
            System.out.println("Enter an int: ");
            Input.getInt();
        } catch (InputMismatchException e) {
//            System.out.println("An exception occurred " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("End of this second program");
    }

}
