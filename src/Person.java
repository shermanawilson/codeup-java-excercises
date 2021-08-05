public class Person {

    public String firstName;
    public String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person rick = new Person();
        //create a variable called Rick
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        Person shy = new Person();
        shy.firstName = "Shy";
        shy.lastName = "Hall";

        System.out.println(rick.getFullName());
        System.out.println(shy.getFullName());
    }//end main


}//end lecture
