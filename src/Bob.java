import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        //Ends in ? -> Sure
        //Ends in ! -> Whoa, Chill out!
        // Empty -> Fine. Be that way!
        // Anything else -> Whatever
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(userInput.endsWith("?")){
            System.out.println("Sure");
        }else if(userInput.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(userInput.isEmpty()){
            System.out.println("Whatever");
        }else {
            System.out.println("Fine. Be that way!");
        }
    }
}

