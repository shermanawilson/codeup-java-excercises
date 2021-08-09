package abstraction;

public class Dog extends Animal{
    public Dog(String animalName) {
        super(animalName);
    }


    @Override
    public void makesSound() {
        System.out.println("BARK BARK");
    }
}
