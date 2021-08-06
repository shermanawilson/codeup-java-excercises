package polymorphism;

public class AnimalFarm {
    public static void main(String[] args) {
        //animal making noise
        GenericAnimal genericAnimal = new GenericAnimal();
        genericAnimal.makeNoise();

       genericAnimal = new Goat();
       genericAnimal.makeNoise();

       genericAnimal = new Pig();
       genericAnimal.makeNoise();

       genericAnimal = new Cat();
       genericAnimal.makeNoise();

       Cat catLady = new Cat();
       catLady.purr();

       genericAnimal.purr(); // purr is specific to Cat, there is no function like that in Animal

    }
}
