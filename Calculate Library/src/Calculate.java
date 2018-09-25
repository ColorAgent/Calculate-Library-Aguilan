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
	// returns the cube of the value passed
	public static int cube(int number) {
		int answer;
		answer = number * number * number;
		return answer;
	}
	// returns the average of the two values passed to it
	public static double average(double input1, double input2) {
		double sum = input1 + input2;
		return sum/2; 
	}
	// returns the average of three values passed to it
	public static double average(double input1, double input2, double input3) {
		double sum = input1 + input2 + input3;
		return sum/3;
	}
	// converts an angle measure given in radians into degrees
	public static double toDegrees(double input1) {
		double convert = input1;
		double pi = 3.14159/180; // conversion factor for radians into degrees
		return convert * pi;
	}
	// converts degrees into radians units
	public static double toRadians(double input1) {
		double convert = input1;
		double pi = 180/3.14159; // conversion factor for degrees to radians
		return convert / pi;
	}
	// part of the quadratic equation (b^2) - 4 * a * c 
	public static double discriminant(double a,double b, double c) {
		return (b*b) - (4 * a * c);
	}
	// converts a mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
	// converts an improper fraction into a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator / denominator + " " + numerator % denominator + "/" + denominator);
		return answer;
	}
	// converts a binomial multiplication into the quadratic equation form (ax+b)(cx-d) -> ax^2+bx+c
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a*c) + "x" + "^2" + ((a*b) + b * c) + "x" + (b * d);
		return answer; 
	}
	// determines if one integer is evenly divisible by another
	public static boolean isDivisibleBy(int numerator, int denominator) {
		return (numerator % denominator == 0);
	}
	// returns the absolute value of the number passed
	public static double absValue(double input1) {
		return (-input1);
	}
	// takes 2 numbers and returns largest of the two
	public static double max(double input1, double input2) {
		if (input1 > input2) {
			return input1;
		} else{
			return input2;
		}		
	}
	// takes 3 numbers and returns the largest of the three
	public static double max(double input1, double input2, double input3) {
		if (input1 >= input2 && input1 >= input3) {
			return input1;
		} else if (input2 >= input1 && input2 >= input3) {
			return input2;
		} else if (input3 >= input2 && input3 >= input1) {
			return input3;
		} else {
			return input1;
		}
	}

	// takes two integers and returns the smallest value
	public static int min(int input1, int input2) {
		if (input1 > input2) {
			return input2;
		} else {
			return input1;
		}
	}
	// rounds a number to two decimal places
	public static double round2(double input1) {
		int noDecimalsNum = (int) (input1 * 1000);
		int thousandthDigit = noDecimalsNum % 10;
		noDecimalsNum /= 10; // increments if the number is positive and decrements if the number is negative
		if (thousandthDigit >= 5 && noDecimalsNum > 0) {
			noDecimalsNum += 1;
		} else if (thousandthDigit <= 5 && noDecimalsNum < 0) {
			noDecimalsNum -=1;
		}
		return noDecimalsNum / 100.00; // returns rounded value and makes it a double
	}
	// raises a double to the power of an integer
	public static double exponent(int input1, double input2) {
		double answer = input1 * input2;
		return answer;
	}
	// returns the factorial of the value passed by returning an integer and returning a double
	public static int factorial(int input1) {
	        if (input1 == 0)
	        return 1;
	        return input1 * factorial(input1 - 1);
	}
	// determines if an integer is a prime number or not
	public static boolean isPrime(int input1) {
		for(int i=2; i < input1; i++) {
			if(input1 % i == 0)
			return false;
	    }
	    return true;
	}
	// takes two integers and returns the greatest common factor
	public static int gcf(int input1, int input2) {
		if (input1 < 0) {
			throw new IllegalArgumentException("You cannot guess a negative number");
		}
	        while(input1 != input2)
	        {
	            if(input1 > input2)
	            	input1 -= input2;
	            else
	            	input2 -= input1;
	        }
	        return input1;
	}
	// accepts a double and returns a double rounded to two decimal places
	public static double sqrt(double input1) {
		double guess = 0.1;
		double guessSqrt = 0;
		if (input1 < 0) {
			throw new IllegalArgumentException("You cannot guess a negative number");
		}
		while (round2(guessSqrt * guessSqrt) !=input1) {
			guessSqrt = 0.5 * (input1 / guess);
			guess += 0.1;
		}
		return round2(guessSqrt);
		}
	}

	
	





