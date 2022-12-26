package importantJava.java_tutorial;

import java.util.Scanner;

public class Exercise3 {
        static double celsuis;
        double fahrenheit;
    Exercise3(){

    } 
    public double convert(double celsius) {
        this.fahrenheit = (((9/5)*celsius)+32);
    return fahrenheit;
    }   
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a temperature in degree celsuis");
            celsuis = input.nextDouble();
        }
        Exercise3 temp = new Exercise3();
        System.out.println(celsuis+" celsuis is equal to "+temp.convert(celsuis)+" fahrenheit");
    }
}
