public class ListMethods {
        public static void main(String[] args)
        {
            Integer m=3, n=8;
            int j=4 , deg=30, deg1=1 ,P1 =5, P2=5 , x;
			double a = 3.9, b = 4.2, c = 7.2;

            System.out.println("m.doubleValue() \t= " + m.intValue());
            System.out.println("m.compareTo() \t\t= " + m.compareTo(3));
            System.out.println("m.equals(n) \t\t= " + m.equals(n));
            n = Integer.valueOf(j);
            System.out.println("valueOf \t\t\t= " + n);
            System.out.println("m.toString \t\t\t= " + m.toString());
            x= Integer.parseInt("9");
            System.out.println("parseInt \t\t\t= " + x);
            System.out.println("absolute value of a = " + Math.abs(a));
            System.out.println("round(a) \t\t\t= " + Math.round(a));
            System.out.println("ceil(a) \t\t\t= " + Math.ceil(a));
            System.out.println("floor(a) \t\t\t= " + Math.floor(a));
            System.out.println("rint(a) \t\t\t= " + Math.rint(a));
            System.out.println("exp(a) \t\t\t\t= " + Math.exp(a));
            System.out.println("max of a and b \t\t= " + Math.max(a,b));
            System.out.println("min of a and b \t\t= " + Math.min(a,b));
            System.out.println("2^c \t\t\t\t= "+Math.pow(2,c));
            System.out.println("log a \t\t\t\t= " + Math.log(a));
            System.out.println("Square root of j \t= " + Math.sqrt(j));
            System.out.println("sin(k) \t\t\t\t= " + Math.sin(deg));
            System.out.println("cos(k) \t\t\t\t= " + Math.cos(deg));
            System.out.println("tan(k) \t\t\t\t= " + Math.tan(deg));
            System.out.println("asin(k) \t\t\t= " + Math.asin(deg1));
            System.out.println("acos(k) \t\t\t= " + Math.acos(deg1));
            System.out.println("atan(k) \t\t\t= " + Math.atan(deg));
            System.out.println("Theta (x,y) \t\t= " + Math.atan2(P1,P2));
            System.out.println("b in degree \t\t= " + Math.toDegrees(b));
            System.out.println("Radians of b \t\t= " + Math.toRadians(b));
            System.out.println("Random number \t\t= " + Math.random());


        }

}
