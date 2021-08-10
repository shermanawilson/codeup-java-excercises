package Person;

public class Person {




    private String name;
        private String first;
        private String last;
        private int age;

        public Person(String name){
            this.name = name;
        }

        public Person(String first, String last, int age ) {
            this.first = first;
            this.last = last;
            this.age = age;
        }

        public String sayThat() {
            return "Hello my name is  " ;
        }


        public String getName(){
    //TODO: return the person's name
            return this.name;

        }

        public void setName(String name){
    //TODO: change the name property to the passed value
            this.name = name;
        }
        public void sayHello(){
    //TODO: print a message to the console using the person's name
            System.out.println("Hello from " + first);
        }

        public static void main(String[] args) {
//            Person.Person.Person shy = new Person.Person.Person("Shy");

//            System.out.println(shy.getName());
//            shy.sayHello();
//            shy.setName("Armani");
//            System.out.println(shy.getName());
//            shy.sayHello();

    //        Person.Person.Person person1 = new Person.Person.Person("John");
    //        Person.Person.Person person2 = new Person.Person.Person("John");
    //        System.out.println(person1.getName().equals(person2.getName())); //true
    //        System.out.println(person1 == person2); //false

    //        Person.Person.Person person1 = new Person.Person.Person("John");
    //        Person.Person.Person person2 = person1;
    //        System.out.println(person1 == person2); //true
//
//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
//            person2.setName("Jane");
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());

        }

    }

