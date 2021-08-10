package shapes;

public class Square extends Quadrilateral{




    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        double side =  super.length;
        return side * 4;
    }

    @Override
    public double getArea() {
        double side =  super.length;
        return side * side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }
}
