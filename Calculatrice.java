import java.util.Scanner; // same as scanf in c programming
class Calculatrice{
	// In the tutorial the main program is found inside a single class
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
//======================== NOTE ==================================================================
// Pour les francophone desole encore une fois mais vous allez devoir utilise google translator🙇🏾‍♂️
// https://translate.google.com/
//=================================================================================================
// 1.) On this tutorial you will code a simple calculator the goal is to learn how to take in different value