package abstraction;

public class Chicken extends Animal{
    public Chicken(String animalName) {
        super(animalName);
    }

    @Override
    public void makesSound() {
        System.out.println("Cluck Cluck");
    }
}
