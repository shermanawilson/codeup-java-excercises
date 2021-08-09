package abstraction;

public class Snake extends Animal{

    public Snake(String animalName) {
        super(animalName);
    }

    @Override
    public void walk() {
        System.out.println("I can't walk but I can slitherrrr");
    }


    @Override
    public void makesSound() {
        System.out.println("Shhhhhhhhh");
    }

    public void injectV() {
        System.out.println("I've just injected you with my Vinum");
    }

}
