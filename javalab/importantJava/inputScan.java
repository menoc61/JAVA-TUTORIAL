package importantJava;
import java.util.Scanner;
public class inputScan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter user name: ");
            String name = input.nextLine();// you can also use input.nextLine() to flush the next input
            System.out.println("Welcome "+name +" and what is age :");
            int age = input.nextInt();
            System.out.println("your are "+age+" years old");
        }
    
    }
    
}
