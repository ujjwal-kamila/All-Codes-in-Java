// Class for Triangle
class Triangle {
    double side1, side2, side3;

    // Parameterized constructor for Triangle
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Class for Rectangle
class Rectangle {
    double length, width;

    // Parameterized constructor for Rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Class for Square
class Square {
    double side;

    // Parameterized constructor for Square
    Square(double side) {
        this.side = side;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 4 * side;
    }
}

public class PerimeterMain {
    public static void main(String[] args) {
        // Create objects for Triangle, Rectangle, and Square with example values
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(5, 7);
        Square square = new Square(6);

        // Calculate and display the perimeters
        System.out.println("Perimeter of Triangle: " + triangle.calculatePerimeter());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
        System.out.println("Perimeter of Square: " + square.calculatePerimeter());
    }
}
