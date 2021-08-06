package Person;

public class Employee extends Person{

    private String position;
    private long employeeID;
    private double salary;

    //constructor for basic
    Employee(String first, String last, int age) {
        super(first,last,age);
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

//
//    public String sayHello(){
//        return "Employee{" + "employeeID=" + employeeID + '}';
//    }


    public static void main(String[] args) {


        Employee newEmployee = new Employee("Armani", "Hall", 25);

        System.out.println(newEmployee.getName());

        Person personOne = new Person("Sherma'n", "Hall", 25);

        System.out.println(personOne.sayThat());
    }
}
