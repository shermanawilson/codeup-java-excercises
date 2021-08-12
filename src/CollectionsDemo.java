import Person.Person;

// ***************

// When you know the key of something you're looking for HashMap is it
// Associative array is basically like a Hash Map array


import java.util.ArrayList;
import java.util.HashMap;

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

        System.out.println("The last index is: " + lastNames.lastIndexOf("Castillo"));
        lastNames.add("Garcia");
        lastNames.add("Lewis");
        lastNames.add("Jones");
        lastNames.add("Williams");
        System.out.println("The last index is: " + lastNames.indexOf("Williams"));
        lastNames.indexOf("Williams");
        System.out.println(lastNames);

        System.out.println("------------");
        // Syntax for creating a Hash Map
        //HashMap<Obj, Obj> var = new HashMap();
        HashMap<String, String> usernames = new HashMap<>();

        // .put() Method Example:
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        // Printing Has Maps:

        System.out.println("4 usernames: " + usernames + "\n");
        System.out.println("------------");

        //Get value of Hash map key:
        System.out.println(usernames.get("Shy") + "\n");

        System.out.println("------------");

        //.getOrDefault Method Example

        System.out.println("This method will return a default value instead of null: " + usernames.getOrDefault("Shy", "No Username"));
        System.out.println("Shy has not been added to usernames: " + usernames + "\n");

        System.out.println("------------");
        // .putIfAbsent Method Example

        usernames.putIfAbsent("Shy", "replacement value");
        System.out.println("If the key is not in the has map, this method will set it: " + usernames + "\n");

        System.out.println("------------");

        // .putIfAbsent() Method 2nd Example

        usernames.putIfAbsent("Melly", "replacement value");
        System.out.println("If the key is not in the has map, this method will set it: " + usernames + "\n");

        System.out.println("------------");

        System.out.println(usernames.put("Justin","Value2"));
        System.out.println(usernames);


        // .contains Method Example

        System.out.println("--------------");

        System.out.println("Checking for keys where the value contains the default of the 'replacement value': " + usernames.containsValue("replacement value") + "\n");


        System.out.println("------------" + "\n");


        // .replace() Method Example

        usernames.replace("Mary", "marylee");
        System.out.println("Replacing the default value from the previous method: " + usernames + "\n");

        // .remove() Method Example

        usernames.remove("Mary");
        System.out.println("Removing the key, Mary, and value: "  + usernames + "\n");

        // .clear() Method Example

        usernames.clear();
        System.out.println("This has map should be empty: " + usernames + "\n");

        // .isEmpty Method

        usernames.isEmpty();
        System.out.println("Returns the boolean true if has map is empty: " + usernames.isEmpty() + "\n");



    }//End Of Main
}
