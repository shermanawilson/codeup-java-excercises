package polymorphism;

public class Goat extends GenericAnimal {
    
    public void makeLotsOfNoise(int numNoises){
        for (int i = 0; i < numNoises; i++) {
            makeNoise();
        }
    }

    @Override
    public void makeNoise() {
        //the goat making noise
        System.out.println("*****  GOAT NOISE  *****");
    }
}
