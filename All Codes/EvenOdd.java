import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 2 ==0 ){
            System.out.println("The number is Even ");
        }
        else{
            System.out.println("The Number is Odd");
        }
    }
    
}
