package importantJava.java_tutorial;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    Exercise8(){
        
    }
    public int Average(int[] list){
        int sum = 0;
        int average;
            for (int i = 0; i < list.length; i++) {
             sum+=list[i];    
            }
         average = sum/list.length;
         System.out.println("The average is = "+average);
        //  String pattern="###.00";
        //  DecimalFormat.applyPattern(pattern);
        //  DecimalFormat format = new DecimalFormat(pattern);
        //  System.out.println(DecimalFormat.format(average));
        return average;
    }
    public static void main(String[] args) {  
        Exercise8 grades = new Exercise8();  
        try (Scanner input = new Scanner(System.in)) {
            int[] list = new int[10];
            int num;
            System.out.println("Enter 10 number: ");
            //Enter 10 integers in an array
            for (int i = 1; i <= 10; i++) {
                System.out.println("Enter num #"+i);
                 num = input.nextInt();
                 if (num !=-1) { 
                    list[i] = num;
                 }else{
                    break;
                 }

            } 
        grades.Average(list);
        }
    }
}
