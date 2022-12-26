import java.util.Scanner;
class Calculatrice{

	public static void main(String[]args)
	
	{
		//create an object of scanner class
		Scanner input = new Scanner(System.in);
		
		char operator;
		int num1, num2, result;
		
		
		// ask user to enter numbers
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		// ask user to enter operator
		System.out.print("Enter any operator: ");
		operator = input.next().charAt(0);
		
		switch(operator)
		{
		case '+':
		result = num1 + num2;
		System.out.println( num1 + "+" + num2 + "=" + result);
		break;
		
		case '-':
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
		break;
		
		case '*':
		result = num1 * num2;
		System.out.println( num1 + "*" + num2 + "=" + result);
		break;
		
		case '/': 
		result = num1 / num2;
		System.out.println( num1 + "/" + num2 + "=" + result);
		break;
		
		default:
		  System.out.println("Invalid Operator");
		}
		input.close();
	}
}