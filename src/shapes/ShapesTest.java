package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Box 1 Perimeter");
        box1.getPerimeter();
        System.out.println("Box 1 Area");
        box1.getArea();

        System.out.println("=======================");

        Rectangle box2 = new Square(5);
        System.out.println("Box 2 Perimeter");
        System.out.println(box2.getPerimeter());
        System.out.println("Box 2 Area");
        System.out.println( box2.getArea());
    }
}
