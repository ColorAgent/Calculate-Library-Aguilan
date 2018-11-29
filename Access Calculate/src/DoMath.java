/* This class is client code that uses the Calculate library to perform various mathematical task.
 * @author Alex Aguilan 
 * Version September 6th
 */
public class DoMath {
	
	 public static void main(String[] args) {
		 System.out.println("Square: " + Calculate.square(5)); 
		 System.out.println("Cube: " + Calculate.cube(7));
		 System.out.println("Average: " + Calculate.average(7.35, 7.65));
		 System.out.println("Average: " + Calculate.average(5.5, 5.5, 21.4));
		 System.out.println("ToDegrees: " + Calculate.toDegrees(65));
		 System.out.println("toRadians: " + Calculate.toRadians(2));
		 System.out.println("Discriminant: " + Calculate.discriminant(3,6,9));
		 System.out.println("toImproperFrac: " + Calculate.toImproperFrac(3, 1, 2));
		 System.out.println("toMixedNum " + Calculate.toMixedNum(7,2));
		 System.out.println("Foil: " + Calculate.foil(2, 3, 6, -7, "n"));
		 System.out.println("isDivisibleBy: " + Calculate.isDivisibleBy(5,5));
		 System.out.println("absvalue: " + Calculate.absValue(4));
		 System.out.println("max: " + Calculate.max(4,7));
		 System.out.println("max: " + Calculate.max(2,9,4));
		 System.out.println("min: " + Calculate.min(5,6));
		 System.out.println("round2: " + Calculate.round2(12.43));
		 System.out.println("exponent: " + Calculate.exponent(5, 4.7));
		 System.out.println("factorial: " + Calculate.factorial(8));
		 System.out.println("isPrime: " + Calculate.isPrime(9));
		 System.out.println("gcf: " + Calculate.gcf(28,8));
		 System.out.println("sqrt: " + Calculate.sqrt(16.45));
		 System.out.println("quadform: " + Calculate.quadForm(16,4,8));
	}
	 
}
