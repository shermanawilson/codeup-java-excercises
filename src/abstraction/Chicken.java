package abstraction;

public class Chicken extends Animal implements FlightCapable {

    public Chicken(String animalName) {
        super(animalName);
    }

    @Override
    public void makesSound() {
        System.out.println("Cluck Cluck");
    }

    @Override
    public void fly() {
        System.out.println("I can Fly OMG");
    }
}
