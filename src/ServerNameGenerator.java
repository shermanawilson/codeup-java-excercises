import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"Awful", "Charming", "Defeated", "Determined", "Dull", "Cruel", "Creepy", "Joyous", "Ill", "Horrible"};

    public static String[] nouns = {"Camera", "Boyfriend", "Army", "Month", "Basis", "Analysis", "Truth", "Exam", "Video", "Player"};


    public static String randomStringFromArray(String[] choices) {
        Random r = new Random();
        int myRandomNumber = r.nextInt(choices.length);
        return choices[myRandomNumber];

    }

    public static void main(String[] args) {

        System.out.println("Here is your server names:");
        System.out.println(randomStringFromArray(adjectives));

    }


}
