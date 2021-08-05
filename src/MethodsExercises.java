import java.util.Scanner;

public class MethodsExercises {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Addition
//        System.out.println(2 == sum(1,1));
//        System.out.println(6 == sum(4,2));
//        System.out.println(8 == sum(6,2));
//
//        //Subtraction
//        System.out.println(2 == sub(8,6));
//        System.out.println(12 == sub(18,6));
//        System.out.println(10 == sub(15,5));
//
//        //Multiplication
//        System.out.println(16 == multi(4,4));
//        System.out.println(25 == multi(5,5));
//        System.out.println(100 == multi(10,10));
//
//        //Division
//        System.out.println(10 == div(100,10));
//        System.out.println(5 == div(50,10));
//        System.out.println(2 == div(20,10));



        //#2
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);

        //#3
//        factorial();
        rollTheDice();
    }

    //#4



    public static int getInteger(int min, int max){
        do{
//            System.out.print("Enter a number between 1 and 10: ");
           int userResponse = scanner.nextInt();

            if(userResponse > min && userResponse < max) {
                return userResponse;
            }
        }while(true);
    }


    public static void factorial(){
        int userInput = getInteger(1,10);
        long fact = 1; // basket
        for (int i = userInput; i > 0; i--) {
            fact*=i;
        }
        System.out.println(fact);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void rollTheDice(){
        System.out.println("Enter the number of sides of you dice!");
        int numberOfSides = getInteger(2,20);//prompt user for number from 2-20

        int firstRoll = getRandomNumber(1,numberOfSides);
        int secondRoll = getRandomNumber(1,numberOfSides);

        System.out.printf("First Die ===> %d\nSecond Die ===> %d\n",firstRoll,secondRoll);

        System.out.println("Would you like to continue?");

        Scanner userInput = new Scanner(System.in);
        String usersResponse = userInput.nextLine();
        boolean doesUserWantToContinue = usersResponse.toLowerCase().contains("y");

        if(doesUserWantToContinue){
            rollTheDice();
        }
    }


    public static double sum(int num1, int num2){return num1 + num2;}

    public static double sub(int num1, int num2){return num1 - num2;}

    public static double multi(int num1, int num2){return num1 * num2;}

    public static double div(int num1, int num2){return num1 / num2;}
}
