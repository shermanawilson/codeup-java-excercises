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
//        System.out.println(perimeter);
        return perimeter;
    }

    public double getArea(){
        double area = length * width;
//        System.out.println(area);
        return area;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
