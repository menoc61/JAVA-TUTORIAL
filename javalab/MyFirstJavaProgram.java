public class MyFirstJavaProgram{
public static void main(String[] args) {
	// int[] myarray = new int[10];
	int[] myarray = {1,2,3,4,5,6,7,8,9,10};
	// for (int i = 0; i < myarray.length; i++) {
	// 	System.out.print(myarray[i]+", ");
	// }
	// for (int i : myarray) {
	// 	System.out.println(i);
	// }
	// int total =0;
	// System.out.print("\nTotal : ");
	// for (int i = 0; i < myarray.length; i++) {
	// 	total+=myarray[i];	
	// }
	// System.out.print(total);
	// int max,min = myarray[0] ;
	// for (int i = 0; i < myarray.length; i++) {
	// 	if (max > myarray) {
	// 		System.out.println(myarray[i]);
	// 	}
	// }
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(myarray[i]);
				
			}
			System.out.print("\n");
		}
}
}