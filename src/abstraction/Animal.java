package abstraction;

// NOTES

//instantiate : to create a new object , use new key word

//Super Class, Cannot be directly instantiated
// Animal class by itself cannot create animals on it's own
// Can create concrete subclasses
// Examples: employee


public abstract class Animal {


    public void walk(){
        System.out.println("Walks around a bit");
    }

    public final void breath(int numSeconds) {
        System.out.println("Breathes for " + numSeconds + " seconds");
    }

    public abstract void makesSound();
    // if you want to call yourself an animal you have to make a sound

}
