package shapes;

public class Rectangle {
    private int length;
    private int width;


    public Rectangle(int newLength, int newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }


    public double getPerimeter(){
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    public double getArea(){
        double area = length * width;
        return area;

    }


}
