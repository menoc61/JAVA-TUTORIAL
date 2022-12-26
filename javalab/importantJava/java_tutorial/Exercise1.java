package importantJava.java_tutorial;

import java.util.Scanner;

public class Exercise1 {
     void display(String name){
          System.out.println("your name is :"+name);
      }
public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
          Exercise1 e = new Exercise1();
          System.out.println("Enter your name: ");
          String name = input.nextLine();
          e.display(name);
     }
}
}