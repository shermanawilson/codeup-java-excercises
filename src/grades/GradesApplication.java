package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {



        // initialize hashmap <sting, student object>
        HashMap<String, Student> students = new HashMap<>();

        Student chelle = new Student("Chelle");
        chelle.addGrade(95);
        chelle.addGrade(88);
        chelle.addGrade(92);

        Student beth = new Student("Beth");
        beth.addGrade(52);
        beth.addGrade(59);
        beth.addGrade(72);

        Student john = new Student("John");
        john.addGrade(81);
        john.addGrade(80);
        john.addGrade(83);

        Student anjel = new Student("Anjel");
        anjel.addGrade(99);
        anjel.addGrade(91);
        anjel.addGrade(98);


        // They are the Keys
        students.put("chelly-wilson", chelle);
        students.putIfAbsent("bethsusername", beth);
        students.putIfAbsent("weirdostuff", john);
        students.putIfAbsent("thisother", anjel);

        commandLineInterface(students);

    }



    public static void commandLineInterface(HashMap<String, Student> students) {


        System.out.println("Welcome!\n" + "\n" + "Here are the GitHub usernames of our students:\n");

        do {

            Input input = new Input();

            // returns an array of strings of the keys
            for (String key : students.keySet()) {
                System.out.print("|" + key + "| ");
            }

            System.out.println("What student would you like to see more information on?");

            String userKey = input.getString();

            if (students.containsKey(userKey)) {

                Student currentStudent = students.get(userKey);

                System.out.println("Name: " + currentStudent.getName() + "GitHub Username: " + userKey);
                System.out.println("Current Average " + currentStudent.getGradeAverage());

            } else {
                System.out.println("Sorry bout that, there aren't any student's with the GitHub username: " + userKey);
            }

            System.out.println("Would you like to see another student?");
        }while(Input.yesNo());

        System.out.println("Good bye :)");

    }





}
