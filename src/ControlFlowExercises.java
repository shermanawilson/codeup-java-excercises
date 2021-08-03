import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        //While
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i + " ");
//            i++;
//        }

        // Do While
//        i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        // for loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//
//       long i = 2;
//        do{
//            System.out.println(i);
//            i = i * i;
//        } while (i <= 1000000);
//
//
//        for (long i = 2; i < 1000000; i = i * i) {
//            System.out.println(i);
//        }

//


        //FizzBuzz
//        for (int i = 0; i <= 100; i++) {
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(i);
//            }
//
//        }


        //#3


        Scanner scanner = new Scanner(System.in);

//        boolean userContinues = true;
//
//        do{
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed\n");
//            System.out.println("------ | ------- | -----\n");
//            for (int i = 0; i <= userInt; i++) {
//                System.out.printf("%-6d",i); // left justify 1, take up 6 spaces , decimal
//                System.out.print(" | ");
//                System.out.printf("%-7d",i * i);//left justify 1, take up 7 spaces, decimal number
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//
//            }
//            System.out.println("Would you like to enter another number (y/n)?");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")){
//                userContinues = false;
//            }
//
//
//        }while (userContinues);
//        // do while loops helps give control oer app
//        // do this while certain condition is true
//


        //#4
        boolean thatGrade = true;
        do {

            System.out.println("Please enter a numerical grade from 0 - 100");

            int letterGrade = scanner.nextInt();

            if (letterGrade >= 88) {
                System.out.println("A");
            } else if (letterGrade <= 80) {
                System.out.println("B");
            } else if (letterGrade <= 67) {
                System.out.println("C");
            } else if (letterGrade <= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you want to enter a new grade? (y/n)?");

            String userResponse = scanner.next();

            if (!userResponse.equalsIgnoreCase("y")) {
                thatGrade = false;
            }


        }while (thatGrade);

    }
}

