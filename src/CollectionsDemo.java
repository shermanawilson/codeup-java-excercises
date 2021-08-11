import Person.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo {
    public static void main(String[] args) {

        //ArrayLists
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<Person>();// this uses person class



        lastNames.add("Wilson");
        lastNames.add("Hall");
        lastNames.add("Castillo");

        System.out.println(lastNames); // returns [Wilson, Hall, Castillo]

        // Java Array/ Add
        // String [] lastNames2 = new String[10];
        // lastNames2 = Arrays.copyOf(lastNames2,lastNames2.length + 1);
        // lastNames2[lastNames2.length - 1] = "Wilson";

        // .size Method Example
        System.out.println("The size of the lastNames array list is: " + lastNames.size() + "\n");

        // .get Method Example
        System.out.println("The element value returned will be 'Wilson :" + lastNames.get(0) + "\n");

        // .contains Method example
        System.out.println("We are checking to see if 'Wilson' is an element in the array list: " + lastNames.contains("Wilson") + "\n");

        //.remove Method example

        System.out.println(lastNames); // returns [Wilson, Hall, Castillo]
        lastNames.remove(0); // removes "Wilson", Hall becomes 0 index
        lastNames.remove("Hall"); // removes the String Hall, **this is case sensitive**
        System.out.println(lastNames); // returns [Castillo]


        // Reversing an Array List

//        ArrayList<String> someStrings = new ArrayList<>();
//        someStrings.add("billy");
//        someStrings.add("jimmy");
//        someStrings.add("scott");
//        someStrings.add("tim");

        // .isEmpty Method

        System.out.println(lastNames.isEmpty()); // returns false
        // returns a booleans, this checks if the array is empty or not

        // .lastIndexOf Method Example

        System.out.println();





    }//End Of Main
}
