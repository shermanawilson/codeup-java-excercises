package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {


        boolean running = true;

        while (running) {
            // User picks their option here
            System.out.println(returnMenuDisplay());

            int response = promptUserForChoice();

            // executesUserChoice returns a boolean eventually
            // Rn it's true
            // It's only false when the user chooses 0
            // if we set running == executeUserChoice(response)
            // if they choose 0 it will result in false and end the program
            // if they choose any thing else it will continue

            running = executeUserChoice(response);
        }


    }
    // Return Menu Display
    private static String returnMenuDisplay() {
        String choices = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                 "6 - view movies in the animated category";

        return choices;


    }

    //Prompt user for choice
    private static int promptUserForChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int response = input.getInt(0,6);
        return response;
    }



    private static void viewMovieByCategory(String category) {
        for(Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s --,%s -- ,%s\n", movie.getName(), movie.getCategory(), movie.getYear());
            }
        }
    }


    private static boolean executeUserChoice(int choice) {
        boolean continueRunningApp = true;

        switch (choice) {
            case 0:
                System.out.println("Goodbye \\n/");
                continueRunningApp = false;
                break;
            case 1:
                System.out.println("\n");
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s --,%s -- ,%s\n", movie.getName(), movie.getCategory(), movie.getYear());
                }
                break;
            case 2:
                System.out.println("\n");
                viewMovieByCategory("drama");
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                viewMovieByCategory("musical");
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                viewMovieByCategory("horror");
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                viewMovieByCategory("scifi");
                System.out.println("\n");
                break;
            case 6:
                System.out.println("\n");
                viewMovieByCategory("animated");
                System.out.println("\n");
                break;
        }
        return continueRunningApp;
    }



}
