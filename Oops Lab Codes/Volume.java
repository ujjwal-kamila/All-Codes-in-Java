import java.util.Scanner;
public class Volume {
    public double volume(int side) {
        return side * side * side;
    }
    public double volume(int height, int radius) {
        // Cylinder volume = πr²h
        return Math.PI * radius * radius * height;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume obj = new Volume();
        System.out.print("Enter the side of the cube: ");
        int side = sc.nextInt();
        System.out.println("Volume of Cube: " + obj.volume(side));
        System.out.print("Enter the height and radius of the cylinder: ");
        int height = sc.nextInt();
        int radius = sc.nextInt();
        System.out.println("Volume of Cylinder: " + obj.volume(height, radius));
    }
}
