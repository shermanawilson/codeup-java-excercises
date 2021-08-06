package polymorphism;

public class AnimalFarm {

    public static final int MAX_FARM_ANIMALS = 10; // you can't change once inital

    public static void main(String[] args) {

        /*
        Polymorphic behavior: 1 Animal variable is able to act like
        different Animal subclasses:
        i.e. goat noises, meow, oink oink
         */


        //animal making noise
        GenericAnimal genericAnimal = new GenericAnimal();
        genericAnimal.makeNoise();

//       genericAnimal = new Goat();
//       genericAnimal.makeNoise();

        Goat aGoat = new Goat();
        aGoat.makeLotsOfNoise(10);

       genericAnimal = new Pig();
       genericAnimal.makeNoise();

       genericAnimal = new Cat();
       genericAnimal.makeNoise();

        ( (Cat) genericAnimal ).purr(); // this is casting

//       genericAnimal.purr(); // purr is specific to Cat, there is no function like that in Animal

        Cat shelly = new Cat();
        shelly.purr();

        genericAnimal.breath(5);

    }
}
