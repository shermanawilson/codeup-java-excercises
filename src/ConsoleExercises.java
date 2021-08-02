import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %1.2f.", pi);
        //.format used to control what it looks like
        //% format specifier EX: round numbers without actually changing them

        //Scanner
        Scanner scanner = new Scanner(System.in); //creates scanner that's attached to consoles input
      //  System.out.print("\nYour integer goes bellow\n");
       // int userInput = scanner.nextInt(); // this is where the program sits and waits for the enter key to be pressed
       // System.out.println("Integer: *** \"" + userInput + "\" ***");

        // Abort = Stop button lol

//        System.out.print("\nEnter 3 Words Bellow\n");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//      System.out.printf("%s,%s,%s",word1,word2,word3);


//        System.out.print("\nEnter A Sentence Bellow\n");
//        String sentence = scanner.nextLine();
//        System.out.printf("%s",sentence);


        System.out.print("\nEnter length Bellow\n");
        String perimeter = scanner.nextLine();
        double volume = ((Double.parseDouble(perimeter)) * (Double.parseDouble(perimeter)) * (Double.parseDouble(perimeter)));
//        System.out.printf("%s",Integer.parseInt(perimeter));
        System.out.printf("%1.0f",volume);

//adding height
        //area * height = volume

        scanner.useDelimiter("\n");


    }
}
