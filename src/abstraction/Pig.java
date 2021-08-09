package abstraction;

public class Pig extends Animal {

    // a Blank is a Blank of whatever

    public Pig(String animalName) {
        super(animalName);
    }

    // abstract means that it must be overridden in method
    @Override
    public void makesSound() {
        System.out.println("OINK OINK");
    }
}
