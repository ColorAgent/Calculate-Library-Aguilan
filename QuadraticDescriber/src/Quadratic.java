/* This class contains methods that perform various math operations
 * @author Alex Aguilan  
 * Version September 6th
 */
	public class Quadratic {
		public static String quadDescriber (double a, double b, double c) {
			//declare variables
			String GraphOpens;
			String Formula = "y = " + a + "^2 + " + b + "x + " + c;
			double AxisOfSym = (b * -1) / (2 * a);
			double YOfVertex = (a * AxisOfSym * AxisOfSym) + (b * AxisOfSym) + c;
			String xIntercept = quadForm(a, b, c);
		
			//checks if the graph opens up or down 
			if(a >= 0) {
				GraphOpens = "Up";
			} else {
				GraphOpens = "Down";
			}
			
			//description of the graph's equation, opening direction, vertex, and x and y intercepts
			return "Description of the parabola: \n" + Formula + 
					"\n Opens = " + GraphOpens + 
					"\n Axis of Symmetry = " + round2(AxisOfSym) +
					"\n Vertex = (" + round2(AxisOfSym) + ", " + round2(YOfVertex) + ")" +
					"\n x intercept = " + xIntercept +
					"\n y intercept = " + c + 
					"\n";
		}
	
		// returns the absolute value of the number passed
		public static double absValue(double input1) {
			return (-input1);
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
		//returns the discriminant b^) - 4ac of three doubles
		public static double discriminant(double a, double b, double c) {
			return (b * b) - 4 * a *c;
		}
		// rounds a number(double) to two decimal places
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
		// accepts a double and returns a the square root of a double rounded to two decimal places
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
		// takes the a, b, and c of a quadratic equation(ax^2 + bx + c) and returns its roots
		public static String quadForm(double a, double b, double c) {
			double discr = discriminant(a, b, c);
			if (discr < 0) {
				return "no real roots";
			} else if (discr == 0) {
				double root = (-b + sqrt(discr)) / (2 * a);
				return round2(root) + "";
			} else {
				double PosRootRounded  = round2((-b + sqrt(discr)) / (2 * a));
				double NegRootRounded  = round2((-b - sqrt(discr)) / (2 * a));
				if (PosRootRounded >= NegRootRounded) { //a variation of max with and added it between
					return PosRootRounded + "and" + NegRootRounded;
				} else {
					return NegRootRounded + "and" + PosRootRounded;
				}
			}
		}
	}
		
		
		
		
		
		
		
