/* This class is client code that uses the Calculate library to perform various mathematical task.
 * @author Alex  Aguilan
 * Version September 6th
 */
public class DoMath {
	
	 public static void main(String[] args) {
		 System.out.println(Calculate.square(5)); 
		 System.out.println(Calculate.cube(7));
		 System.out.println(Calculate.average(7.35, 7.65));
		 System.out.println(Calculate.average(5.5, 5.5, 21.4));
		 System.out.println(Calculate.toDegrees(65));
		 System.out.println(Calculate.toRadians(2));
		 System.out.println(Calculate.discriminant(3,6,9));
		 System.out.println(Calculate.toImproperFrac(3, 1, 2));
		 System.out.println(Calculate.toMixedNum(7,2));
		 System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		 System.out.println(Calculate.isDivisibleBy(5,5));
		 System.out.println(Calculate.absValue(4));
		 System.out.println(Calculate.max(4,7));
		 System.out.println(Calculate.max(2,9,4));
		 System.out.println(Calculate.min(5,6));
		 System.out.println(Calculate.round2(12.43));
		 System.out.println(Calculate.exponent(5, 4.7));
		 System.out.println(Calculate.factorial(8));
		 System.out.println(Calculate.isPrime(9));
         System.out.println(Calculate.gcf(28,8));
         System.out.println(Calculate.sqrt(7.51));
		 System.out.println(Calculate.gcf(28,8));
		 System.out.println(Calculate.sqrt(7.45));
	}
	 
}
