import java.util.Scanner;

public class ControlStatementLecture {

    public static void main(String[] args) {

        String myName = "Shy";
        int age = 24;

        String someOneElseName = "Shy";

        System.out.println(myName.equals(someOneElseName));

        boolean isUserNamedShyAndIsTwentyFour = (myName.equals("Shy") && age >= 24);
        System.out.println("User meets the requirements is a " + isUserNamedShyAndIsTwentyFour + " statement");


        Scanner sc = new Scanner(System.in);
        String usersResponse = sc.nextLine();
        System.out.print("Would you like to continue?");
        boolean userRespondedWithYes = sc.nextLine().toLowerCase().contains("y");
        System.out.println(userRespondedWithYes);

        if (usersResponse.contains("YES")) {

            System.out.println("Okay, okay okurrrrrrr");
        } else if(userRespondedWithYes) {
            System.out.println("Okay, we we keep it pushin");
        } else {
            System.out.println("Okay we will move on");
        }


    } // end of main

}// end of ControlStatementLecture
