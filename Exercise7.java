package importantJava.java_tutorial;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a word");
            String word = input.nextLine();
            System.out.println(word.toUpperCase().concat(word.toLowerCase()));
        }
    }
}
