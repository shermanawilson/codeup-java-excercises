public class PersonExercise {

    private String firstName;
    private String lastName;
    private String age;

    // class is blue print , idea of that person
    // the object is the instance of that class
    //Plain Old Java Object , cmnd n , getters and setters for all properties


    public PersonExercise(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
// command + n to create constructor, getters and setters
    public static void main(String[] args) {
        PersonExercise rick = new PersonExercise("Armani", "Hall");
        //create a variable called Rick
        PersonExercise shy = new PersonExercise("Shy", "Hall");

        System.out.println(rick.getFullName());
        System.out.println(shy.getFullName());





        PersonExercise deshawn = new PersonExercise("DeShawn", "Hall");
        System.out.println(deshawn.getFullName());


    }//end main


}//end lecture
