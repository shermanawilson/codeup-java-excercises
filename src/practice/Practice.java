package practice;

public class Practice {

    public static double multiply(int x, int y) {
        return x * y;
    }

    public static double multiply(double x, double y) {

        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 6));
        System.out.println(multiply(5.0,5.7));

        Mallard billy = new Mallard("Billy", 54, 7);
        getMallardDetails(billy);
    }

    public static void getMallardDetails(Mallard name) {

        System.out.println("The mallard " + name.getName() + " flies at a speed of "+ name.getFlightSpeed() + " mph.");

    }
}
