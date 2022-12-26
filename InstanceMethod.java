public class InstanceMethod{
public static void main(String args[]){
    Integer x =5;
	Integer y =5;
	// Returns byte primitive data type
    System.out.println( x.byteValue());
// compare tool
    System.out.println(x.compareTo(3));
// equal tool
    System.out.println(x.equals(y));
// vaueof
	System.out.println(x);
// tostring
    System.out.println(x.toString());
    System.out.println(Integer.toString(12));
//parseInt
    int b =Integer.parseInt("444",16);
   System.out.println(b);
//abs()
    float f =-90;
	System.out.println(Math.abs(f));
//ceil()
    double d =-100.675;
	System.out.println(Math.ceil(d));
//floor
    System.out.println(Math.floor(d));
    System.out.println(Math.floor(f));
//rint()
    System.out.println(Math.rint(d));
//round
    System.out.println(Math.round(d));
//min
    System.out.println(Math.min(12.123,12.456));
// max
    System.out.println(Math.max(12.123,12.456));
//exp
    System.out.printf("exp(%.3f) is %.3f%n", x,Math.exp(x));
//log()
    System.out.printf("log(%.3f) is %.3f%n", x,Math.log(x));
//pow()
    System.out.printf("pow(%.3f, %.3f) is %.3f%n",x, y,Math.pow(x, y));
//sqrt()
    System.out.printf("sqrt(%.3f) is %.3f%n", x,Math.sqrt(x));
 //sin()   
    double degrees =45.0;
    double radians =Math.toRadians(degrees);
    System.out.format("The value of pi is %.4f%n",Math.PI);
    System.out.format("The sine of %.1f degrees is %.4f%n",degrees,Math.sin(radians));

}
}