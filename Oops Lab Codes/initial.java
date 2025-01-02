import java.util.Scanner;
public class initial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter full name");
        String name= scanner.nextLine();
        String[] words=name.split(" ");
        for (String word:words){
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0))).append(".");
        }
    }
    System.out.println("PrintInitials:" + PrintInitials.toString().trim());
   }
}

