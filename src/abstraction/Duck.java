package abstraction;

public class Duck extends Animal implements FlightCapable {

    public Duck(String animalName) {
        super(animalName);
    }

    @Override
    public void makesSound() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("Yoooo I can defiantly fly bro");
    }
}
