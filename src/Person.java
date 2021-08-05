public class Person {

    private String firstName;
    private String lastName;

    // class is blue print , idea of that person
    // the object is the instance of that class
    //Plain Old Java Object , cmnd n , getters and setters for all properties


    public Person(String firstName, String lastName){
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
        Person rick = new Person("Armani", "Hall");
        //create a variable called Rick
        Person shy = new Person("Shy", "Hall");

        System.out.println(rick.getFullName());
        System.out.println(shy.getFullName());





        Person deshawn = new Person("DeShawn", "Hall");
        System.out.println(deshawn.getFullName());


    }//end main


}//end lecture
