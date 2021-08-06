package shapes;

import util.Input;

public class CircleApp{
    //Prompts the user for the radius of the circle using the input class
    //creates a circle object
    //displays the circumference and area

    public static void main(String[] args) {
        Input input = new Input();

       double userRadius = input.getDouble();

       Circle circle = new Circle(userRadius);

        System.out.println("Area:" + circle.getArea());
        System.out.println("Circumference:" + circle.getCircumference());
    }
}
