package abstraction;

public class Pig extends Animal {

    // abstract means that it must be overridden in method
    @Override
    public void makesSound() {
        System.out.println("OINK OINK");
    }
}
