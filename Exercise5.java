package importantJava.java_tutorial;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = input.nextDouble();
            if (num1==num2) {
                System.out.println("These numbers are equal");
            }
            if (num1>num2) {
                System.out.println(num1+" is larger");
            } else {
                System.out.println(num2+" is larger");
            }
        }
    }
}
