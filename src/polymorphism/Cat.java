package polymorphism;

public class Cat extends GenericAnimal {
    @Override
    public void makeNoise() {
        System.out.println("MEOW");
    }


    public void purr() {
        System.out.println("Purrrrrr...");
    }

}
