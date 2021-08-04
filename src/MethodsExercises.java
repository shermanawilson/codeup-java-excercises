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


        int userInput = getInteger(1, 10);
        System.out.println(userInput);

    }

    public static int getInteger(int min, int max){
        do{
            System.out.print("Enter a number between 1 and 10: ");
           int userResponse = scanner.nextInt();
            if(userResponse > min && userResponse < max) {
                return userResponse;
            }
        }while(true);
    }

    public static double sum(int num1, int num2){return num1 + num2;}

    public static double sub(int num1, int num2){return num1 - num2;}

    public static double multi(int num1, int num2){return num1 * num2;}

    public static double div(int num1, int num2){return num1 / num2;}
}
