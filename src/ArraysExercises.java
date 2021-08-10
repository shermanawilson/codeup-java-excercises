import Person.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        //TODO:What happens when you run the following code?
        // It returns it's location
        //TODO:Why is Arrays.toString necessary?
        // Arrays.toString will return the array in [0,1,2] format

        System.out.println(Arrays.toString(numbers));


        //TODO:Create an array that holds 3 Person objects
        Person[] people =  new Person[3];

        //TODO:Assign a new instance of the Person class to each element
        people[0] = new Person("Armani");
        people[1] = new Person("DeShawn");
        people[2] = new Person("Cassidy");

        //TODO: Iterate through the array
        for (int i = 0; i < people.length; i++) {
            //TODO:print out the name of each person in the array
            System.out.println(people[i].getName());
        }

        System.out.println("---------------------------------\n");

        people = addPerson(people,new Person("Aria"));

        //This is the same exact thing as the for i loop above
        for (Person person : people) {
            System.out.print(person.getName() + " | ");
        }




    } // end of main

    // static method of an Array of Person for addPerson that takes in an array of Person and adds a Person
    public static Person[] addPerson(Person[] people, Person person) {

        // We are not aware of the length of the array that will be passed to us
        // It needs to be dynamic
        //TODO: return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        Person[] newPeople = Arrays.copyOf(people, people.length + 1);

        newPeople[newPeople.length - 1] = person;

        return newPeople;
    }
}
