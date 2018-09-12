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
	public static double average(double input1, double input2, double input3) {
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
	public static string toImproperFrac(int input1, int input2, int input3);
	return input1 * (input2/input3);
	}
	public static string toMixedNum(int input1, int input2);
	return input1 / input2
	}
}
