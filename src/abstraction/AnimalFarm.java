package abstraction;

public class AnimalFarm {

    public static final int MAX_ANIMALS = 5;

    public static void main(String[] args) {
        Animal animal; // cannot create new though

        Pig betty = new Pig();
        betty.walk(); // Inherited from animal
        betty.breath(5); // Inherited from animal
        betty.makesSound(); // Specific from Subclass

        System.out.println("");

        System.out.println("======================");

        System.out.println("");

        animal = new Snake();
        animal.walk();
        animal.breath(3);
        animal.makesSound();

        System.out.println("======================");

        System.out.println("");

        Snake luther = new Snake();
        luther.injectV();
        luther.walk();
        luther.breath(7);
        luther.makesSound();

        System.out.println("======================");

        System.out.println("");

        Dog precious = new Dog();
        precious.makesSound();
        precious.breath(4);
        precious.walk();


    }

}
