// This is an object , basically a let, then the code is below
public class HelloWorld {
    //code block
    //need this main method to run code
    public static void main(String[] args) {
//        System.out.println("Dude this is my message!!!"); // be sure to use double quotes in java('b'); only shows 1
//        System.out.print("Hello, ");
//        System.out.print("Thereeee!!");
        // returns
        // Dude this is my message!!!
        //Hello, Thereeee!!

        //int newNumber; // variable declaring
        //newNumber = 5; // Initializing it
        // know what data type is first before naming it
        // there are 6 different number primitive types

        // byte : smallest number type, whole numbers between -128 - 127
        // ex : days of the month ( only 31 , will never go over )
        byte dayOfMonth = 31; // (only uses 1 byte)

        // short : smaller number type, whole numbers between -32,768 to 32,767
        short employees = 129; //(uses 2 bytes, doesn't take much space, not uses as often)

        // More Commonly Used

        // integers : integer type, Integers from -2,147,483,648 to 2,147,483,647
        int carPrice = 50000; //(uses 4 bytes)

        // long : long integers, end with L, Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long distanceOfMilkyWay = 486456338464846318L; //(uses 8 bytes)

        // float : Single-precision, decimal type, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
        float gradeAverage = 93.35f; // use lower case f to show it's a float (4 bytes)

        // double : decimal type, Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        double testDouble = 10000000000000.687176768; // (8 bytes)

        char yesNo = 'Y';

        boolean iLikePizza = true;

        boolean iLikeOlives = false;

        // DataType identifier = value;
        String name = "Shy Hall";

        System.out.println(name);

        String criminalMindsQuote = "\"Some Cheesy quote\" \n - Probably by someone cool";

        System.out.println(criminalMindsQuote);

        String rockNRoll = "\t\\m/"; // returns \m/

        System.out.println(rockNRoll);


        // CONSTANTS , all caps, seperated by underscore , conventions
        final int SIDES_OF_A_DICE = 6;

        final String API_KEY = "b75b703d8195f6f433ca";

        final String GITHUB_API_BASE_URL = "https://api.github.com";

//      SIDES_OF_A_DICE = 25; Will not work because final is like const , cannot reassign value

        //Binary
        int sum = 5 + 6;

        int difference = 6 - 3;

        int multiply = 5 * 8;

        double divide = 10/3;

        int remainder = 4 % 2;

        System.out.println(divide);
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(multiply);
        System.out.println(remainder);

        int someNumber = 5;

        System.out.println(someNumber++); // Will display 5 and then will add 1

        System.out.println(someNumber++); // Will display 6 and then will add 1

        System.out.println(someNumber++); // Will display 7 and then will add 1

        System.out.println(someNumber); // Will display 8

        someNumber += 5;
        System.out.println(someNumber); // Will display 8 + 5 which is 13


        // Implicit Casting
        short myNewShort = 900;
        long morePrecise = myNewShort; // one number within that wider range will make it more precise

        // short is a match box, long is a shoe box --> Impicit Casting


        // Explicit Casting

        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println(almostPi);


        // EXERCISE SYNTAX TYPES AND VARIABLES


        //#1.
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        //#2.
        String myString = "This is my String Okaaaaaay";
        System.out.println(myString);

        //#3.
        myString = "Well This is My New String";
        System.out.println(myString);

        //#4.
//        myString = "3.14159";  When running this code, I couldn't change it , I think because it's
        // a number

        //#5
        long myNumber;
//      System.out.println(myNumber); It wouldn't let me assign a number

        //#6.
//        myNumber = 3.14;

        //#7.
        myNumber = 123L;


        //#8.
        myNumber = 123;
        // long will not compile because it's for integers not decimals

        //#9.
        float myNumberNew = (float) myNumber;
        myNumberNew = 3.14f;
        System.out.println(myNumberNew);



        // #10
//        int x = 5;
//        System.out.println(x++); // returns 5
//        System.out.println(x); // returns 6

        int x = 5;
        System.out.println(++x); // Adds 1 and then returns 6
        System.out.println(x); // returns 6

        // The difference is one takes the code runs it then prints and the other prints then runs

        //#11
        // You cant creat a class because it's already in a class?


        //#12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;


        //#13
        int x = 4;
        x = x + 5;

        int x = 3;
        int y = 4;
        y = y * x;

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;

        //#14
    }
}
