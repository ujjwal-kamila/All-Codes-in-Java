import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        System.out.println("Enter Your age :");
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if(age >= 18) {
            System.out.println("You are Adult!");
        }
        else{
            System.out.println("You are not Adult ");
        }

    }
    
}
