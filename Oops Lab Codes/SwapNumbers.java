import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number(a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number(b): ");
        int b = scanner.nextInt();
        System.out.println("\nBefore swapping: a = "+a+",b ="+b);
        a = a + b; 
        b = a - b;  
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        // scanner.close();
    }
}

