/* This class contains methods that perform various math operations
 * @author Alex Aguilan
 * Version September 6th
 */
public class Calculate {
	// returns the square of the input
	public static int square(int number) {
		int answer;
		answer = number * number;
		return answer;
	}
	public static int cube(int number) {
		int answer;
		answer = number * number * number;
		return answer;
	}
	public static double average(double input1, double input2) {
		double sum = input1 + input2;
		return sum/2; 
	}
	public static double AltAverage(double input1, double input2, double input3) {
		double sum = input1 + input2 + input3;
		return sum/3;
	}
	public static double toDegrees(double input1) {
		double convert = input1;
		double pi = 3.14159/180;
		return convert * pi;
	}
	public static double toRadians(double input1) {
		double convert = input1;
		double pi = 180/3.14159;
		return convert / pi;
	}
	public static double discriminant(double a,double b, double c) {
		return (b*b) - (4 * a * c);
	}
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator / denominator + " " + numerator % denominator + "/" + denominator);
		return answer;
	}
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a*c) + "x" + "^2" + ((a*b) + b * c) + "x" + (b * d);
		return answer; 
	}
	public static boolean isDivisibleBy(int numerator, int denominator) {
		return (numerator % denominator == 0);
	}
	public static double absValue(double input1) {
		return (-input1);
	}
	public static double max(double input1, double input2) {
		if (input1 > input2) {
			return input1;
		} else{
			return input2;
		}
		
	}
	public static double max(double input1, double input2, double input3) {
		if (input1 > input2) {
			return input1;
		} else{
			return input2;
		}
	}
	public static int min(int input1, int input2) {
		if (input1 > input2) {
			return input2;
		} else{
			return input1;
		}
	}
	public static double round2(double input1) {
		double answer;
		answer = ((input1 + 0.005) * 100.00) / 10;
		return answer;
	}
}






