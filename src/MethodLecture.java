import java.util.Scanner;

public class MethodLecture {



    static double piValue = 3.14;
    //Methods will be declared inside of the class but outside of the main method

    public static String sayHello(String userName) {
        //code block
        //return statement, return a string
        String helloMessage = String.format("Hello, %s!", userName);
        return helloMessage;
    }

    public static double getAreaCircle(float radius){
        return piValue * (radius * radius);
    }


    public static boolean doesUserWantToContinue() {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to continue?)");

        String usersResponse = input.nextLine();

        if (usersResponse.equals("yes")){
            return true;
        }else if(usersResponse.equals("no")){
            return false;
        }else{
           return doesUserWantToContinue();
        }




    }


    //This executes the codes
    //methods should not be declared in here
    public static void main(String[] args) {


        if (doesUserWantToContinue()) {
            System.out.println(sayHello("Shy"));

            float radiusOfCircle = 4.4f;

            System.out.println(getAreaCircle((int) radiusOfCircle));

        }


    }





}
