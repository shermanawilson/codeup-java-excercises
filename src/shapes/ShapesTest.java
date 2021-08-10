package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Box 1 Perimeter: " + box1.getPerimeter());
        System.out.println("Box 1 Area: " + box1.getArea());


        System.out.println("=======================");

//        Rectangle box2 = new Square(5);
//        System.out.println("Box 2 Perimeter: " + box2.getPerimeter());
//        System.out.println("Box 2 Area: " + box2.getArea());

        System.out.println("*** Measurable Section ***");

        Measurable myShape = new Square(11);
        System.out.println("New Square Perimeter: " + myShape.getPerimeter());
        System.out.println("New Square Area: " + myShape.getArea());

        Measurable myOtherShape = new Rectangle(5, 12);
        System.out.println("New Rectangle Perimeter: " + myOtherShape.getPerimeter());
        System.out.println("New Rectangle Area: " + myOtherShape.getArea());
    }
}
