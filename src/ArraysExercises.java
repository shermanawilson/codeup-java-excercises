public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        System.out.println(numbers[0]); // 1
//        System.out.println(numbers[1]); // 2
//        System.out.println(numbers[2]); // 0 -- default value
//        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!
//

        // using the array initializer syntax
//        String[] beatles = {"John", "Paul", "Ringo"};
//
//        System.out.println(beatles.length); // 3
//
//        System.out.println(beatles[0]); // "John"
//        System.out.println(beatles[1]); // "Paul"
//        System.out.println(beatles[2]); // "Ringo"

// ArrayIndexOutOfBoundsException !
//        beatles[3] = "George";



        String[] languages = {"html", "css", "javascript", "java"};

//        for (int i = 0; i < languages.length; i += 1) {
//            System.out.println(languages[i]);
//        }

//        String[] languages = {"html", "css", "javascript", "java"};

//        for (String language : languages) {
//            System.out.println(language);
//        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");




    }
}
