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
	public static double S
}