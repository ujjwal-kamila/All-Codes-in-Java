/*
 * 2. Create an abstract class 'Geometry' with an abstract method 'area' and a class member PI=3.14159. Circle
and Rectangle are two subclasses of ‘Geometry’. Each of the subclasses has area method to compute and
display their area.

 */


abstract class Geometry {
    final double PI = 3.14159;

    // Abstract method for area
    public abstract double area();
}

class Circle extends Geometry {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden area method
    @Override
    public double area() {
        return PI * radius * radius;
    }
}

class Rectangle extends Geometry {
    private double length, breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overridden area method
    @Override
    public double area() {
        return length * breadth;
    }
}

public class GeometryArea {
    public static void main(String[] args) {
        Geometry circle = new Circle(4.7); // Runtime polymorphism
        Geometry rectangle = new Rectangle(6, 9); // Runtime polymorphism

        System.out.println("Area of Circle: " + circle.area());        // Output: 63.61725
        System.out.println("Area of Rectangle: " + rectangle.area());  // Output: 35.0
    }
}
