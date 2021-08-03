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
//
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//        String word3 = scanner.nextLine();
//
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//      System.out.printf("%s,%s,%s",word1,word2,word3);


//        System.out.print("\nEnter A Sentence Bellow\n");
//        String sentence = scanner.nextLine();
//        System.out.printf("%s",sentence);

////
//
//        System.out.print("\nEnter length Bellow\n");
//        String perimeter = scanner.nextLine();
//        double area = ((Double.parseDouble(perimeter)) * (Double.parseDouble(perimeter)));
////        System.out.printf("%s",Integer.parseInt(perimeter));
//        System.out.printf("%1.0f",area);
//
//        System.out.print("\nEnter length Bellow\n");
//        double volume = ((Double.parseDouble(perimeter)) * (Double.parseDouble(perimeter)) * (Double.parseDouble(perimeter)));
////        System.out.printf("%s",Integer.parseInt(perimeter));
//        System.out.printf("%1.0f",volume);
////
////adding height
//        //area * height = volume
//
//        scanner.useDelimiter("\n");

        System.out.println("We will need a length and width");
        System.out.println("Give us a width: ");

        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Give us a length: ");

        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = ((width * 2) + (length * 2));
        System.out.printf("\nArea: %.2s",area);
        System.out.printf("\nPerimeter: %.2s",perimeter);



    }
}
