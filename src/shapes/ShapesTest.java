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

        System.out.println("=======================");

        Measurable myShape = new Square(11);
        System.out.println("New Square Perimeter Is: " + myShape.getPerimeter());
        System.out.println("New Square Area Is: " + myShape.getArea());

        System.out.println("=======================");

        Measurable myOtherShape = new Rectangle(5, 12);
        System.out.println("New Rectangle Perimeter Is: " + myOtherShape.getPerimeter());
        System.out.println("New Rectangle Area Is: " + myOtherShape.getArea());
    }
}
