package abstraction;

public class AnimalFarm {

    public static final int MAX_ANIMALS = 5;

    public static void main(String[] args) {
        Animal animal; // cannot create new though, abstract var

        Pig betty = new Pig("joe");
        betty.walk(); // Inherited from animal
        betty.breath(5); // Inherited from animal
        betty.makesSound(); // Specific from Subclass

        System.out.println("");

        System.out.println("======================");

        System.out.println("");

        animal = new Snake("beth ann");
        animal.walk();
        animal.breath(3);
        animal.makesSound();

        System.out.println("======================");

        System.out.println("");

        Snake luther = new Snake("deshawn");
        luther.injectV();
        luther.walk();
        luther.breath(7);
        luther.makesSound();

        System.out.println("======================");

        System.out.println("");

        Dog precious = new Dog("p funk");
        precious.makesSound();
        precious.breath(4);
        precious.walk();

        System.out.println("======================");

        System.out.println("");

        //Array

        Animal [] animals = new Animal[MAX_ANIMALS];
        animals[0] = new Snake("beth");
        animals[1] = new Pig("john");
        animals[2] = new Chicken("tim");
        animals[3] = new Dog("billy");
        animals[4] = new Snake("jessy");


        for (int i = 0; i < animals.length; i++) {
            System.out.printf("The %s goes: ",animals[i].getClass().getSimpleName());

            // .getClass().getSimpleName() - gets concrete subclasses name as string

            animals[i].makesSound();

            //take class info and check objects parental higherachy
            if(animals[i] instanceof Snake){
                Snake tempSnake = (Snake) animals[i];
                // casting (Snake), forcing
                tempSnake.injectV();
            }


        }



    }

}
