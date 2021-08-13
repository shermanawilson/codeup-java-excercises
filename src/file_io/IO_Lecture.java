package file_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IO_Lecture {

//    public static void main(String[] args) throws IOException {
//
//
//        // Name of directory
//        String directory = "js";
//        // Name of file
//        String filename = "madeByJava.js";
//
//
//        // When writing multi line content you will use a collection to hold each line.
//        ArrayList<String> fileContents = new ArrayList<String>();
//
//        // Each string that we add tot he fileContents Collection will
//        // represent a line to write on the file
//        fileContents.add("const message = \"Hello world\"");
//        fileContents.add("// written by java file system");
//
//        // Path for directory
//        Path dataDirectory = Paths.get(directory);
//        // Path for file
//        Path dataFile = Paths.get(directory, filename);
//
//        //Checks if a directory exits
//        if (Files.notExists(dataDirectory)) {
//            // if the directory does not exist, we will make it
//            Files.createDirectories(dataDirectory);
//        }
//        //Checking to see if a file exists
//        if (!Files.exists(dataFile)) {
//            //if the file foes not exist, we will make it
//            Files.createFile(dataFile);
//        }
//
//
//        // This will write contents to the file
////        Files.write(dataFile, fileContents);
//
//
//        //This is how you will read a files contents and store it in a collection
//        List<String> contentsReadFromFile = Files.readAllLines(dataFile);
//
//
//        System.out.println(contentsReadFromFile); // Actual contents of whats on the page
//
//
//    }

    public static void main(String[] args) throws IOException {


        // Name of directory
        String directory = "src/file_io";
        // Name of file
        String filename = "index.sh";


        // When writing multi line content you will use a collection to hold each line.
        ArrayList<String> fileContents = new ArrayList<String>();

        // Each string that we add tot he fileContents Collection will
        // represent a line to write on the file
        fileContents.add("Say Hello Ya'll");

        // Path for directory
        Path dataDirectory = Paths.get(directory);
        // Path for file
        Path dataFile = Paths.get(directory, filename);

        //Checks if a directory exits
        if (Files.notExists(dataDirectory)) {
            // if the directory does not exist, we will make it
            Files.createDirectories(dataDirectory);
        }
        //Checking to see if a file exists
        if (!Files.exists(dataFile)) {
            //if the file foes not exist, we will make it
            Files.createFile(dataFile);
        }


        // This will write contents to the file
        Files.write(dataFile, fileContents);


        //This is how you will read a files contents and store it in a collection
        List<String> contentsReadFromFile = Files.readAllLines(dataFile);

        for(String line : contentsReadFromFile) {
            System.out.println(line);
        }


    }
}
