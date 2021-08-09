package abstraction;

public class Tweetie extends Animal implements FlightCapable{

    public Tweetie(String animalName) {
        super(animalName);
    }

    @Override
    public void makesSound() {
        System.out.println("Tweeet Tweet");
    }

    @Override
    public void fly() {
        System.out.println("Flies pretty fast");
    }
}
