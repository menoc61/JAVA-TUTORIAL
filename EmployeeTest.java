// File Name: EmployeeTest
public class EmployeeTest{
	public static void main (String args[]){
	/*Create two objects using constructor*/
	Employee empOne = new Employee("James Smith");
	Employee empTwo = new Employee("Mary Anne");
	
	// invoking methods for each objects created
	empOne.empAge(26);
	empOne.empDesignation("Senior software Engineer");
	empOne.empSalary(1000);
	empOne.printEmployee();
	
	empTwo.empAge(21);
	empTwo.empDesignation("software Engineer");
	empTwo.empSalary(500);
	empTwo.printEmployee();
	}
}
//======================== NOTE ==================================================================
// Pour les francophone desole encore une fois mais vous allez devoir utilise google translator🙇🏾‍♂️
// https://translate.google.com/
//=================================================================================================
// 1.) On this tutorial you will learn how to call and implement different instances of a same class
// 2.) In this case you will create two object empOne and empTwo from the class Employee
// 3.) And finally implement the method of this class
