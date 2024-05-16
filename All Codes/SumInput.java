import java.util.Scanner;

public class SumInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = input.nextInt();
        System.out.println("Enter b : ");
        int b = input.nextInt();
        int sum = a+b ;
        System.out.println("Sum of " + a + " + " + b + " is " + sum);
    }
    
}
