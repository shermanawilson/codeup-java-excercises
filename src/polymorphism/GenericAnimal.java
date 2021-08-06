package polymorphism;

public class GenericAnimal {


    public final void breath( int nunSeconds){
        nunSeconds = 20;
        System.out.println("Take a breath");
    }

    public void makeNoise() {
        //animal noise
        System.out.println(".. Generic Animal ..");
    }
}
