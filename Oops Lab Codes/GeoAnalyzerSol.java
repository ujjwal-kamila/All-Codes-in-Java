/*
 * 3. Create an interface GeoAnalyzer with member variable PI=3.14159 and method perimeter. Class circle and
Rectangle implement the interface GeoAnalyzer, compute perimeter and finally display it. Use runtime
polymorphism.
 */
interface GeoAnalyzer {
    double PI = 3.14159;

    // Method to compute perimeter
    double perimeter();
}

class Circle implements GeoAnalyzer {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden perimeter method
    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}

class Rectangle implements GeoAnalyzer {
    private double length, breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overridden perimeter method
    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class GeoAnalyzerSol{
    public static void main(String[] args) {
        GeoAnalyzer circle = new Circle(4.5); // Runtime polymorphism
        GeoAnalyzer rectangle = new Rectangle(4, 6); // Runtime polymorphism

        System.out.println("Perimeter of Circle: " + circle.perimeter());   // Output: 28.27431
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());  // Output: 24.0
    }
}
