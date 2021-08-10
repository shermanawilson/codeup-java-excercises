import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // ** Arrays must have a fixed length **
        // ** Arrays must consist off all the same data type

//        int[] anArray = new int[10];


//        int numberOfElements = 10;
//        int[] anArray = new int[numberOfElements]; // specify the number of elements

//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        System.out.println(numbers[0]); // returns 1
//        System.out.println(numbers[1]); // returns 2
//        System.out.println(numbers[2]); // returns 0 because nothing was assigned
//        System.out.println(numbers[3]); // returned an exception error because it doesn't exist

        // Iterating Arrays

//        int[] anArray = {1,2,3,4,5}; // you are setting the actual elements
//
//        System.out.println(anArray.length); //gives the length


//        String[] languages = {"html", "css", "javascript", "java"};
//
//        // for (dataType item : array) {}
//        for (String language : languages) {
//            System.out.println(language);
//        }

        System.out.println("--------------------------------------");

        int scoreCard[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};

        Arrays.fill(scoreCard, 0);


        System.out.println("Score card has been reset to: " + Arrays.toString(scoreCard));
        // Arrays.toString is a way to make it fo from {1,2,3} -> [1,2,3]

        System.out.println("--------------------------------------");

        int[] org = new int[]{1, 2, 3};
        System.out.println("My Array");


        int[] copy = Arrays.copyOf(org, 5);

        copy[3] = 11;
        copy[4] = 55;

        System.out.println(Arrays.toString(copy));

        System.out.println("--------------------------------------");

        int[] arr = {13, 7, 6, 45, 1, 9, 101, 102};

        // Perform the function
        Arrays.sort(arr);

        // Print it out using print format
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
        System.out.println("");


//        int [] a1 = {1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(a1));
//
//        a1 = Arrays.copyOf(a1, 10);
//
//        System.out.println(Arrays.toString(a1));
//
//        a1 = Arrays.copyOf(a1, 3);
//
//        System.out.println(Arrays.toString(a1));
        System.out.println("--------------------------------------");


        String[][] names = {
                {"Mr.", "Mrs.", "Ms."},
                {"Smith", "Jones"}
        };

        System.out.println(names[0][0] + " " + names[1][0]);


        System.out.println("--------------------------------------");


        //[row][col]
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//
//            for (int n : row) {
//                System.out.print(n + " | ");
//            }
//
//            System.out.println();
//        }
//
//        System.out.println("+---+---+---+");
//
//        System.out.println(matrix[0][0]);
//
//// access the first element in the second row
//        System.out.println(matrix[1][0]); // 4
//// the last element in the first row
//        System.out.println(matrix[0][2]); // 3
//// the first element in the last row
//        System.out.println(matrix[2][0]); // 7

//        System.out.println("--------------------------------------");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // ** Enhanced For Loop **
        // for ( dataType variable : Array ) {}
        for (int[] row : matrix) {
            System.out.println();
            for (int col : row) {
                System.out.print(col + " | "); // this will print out each col and a pipe
            }
        }
    }
}
