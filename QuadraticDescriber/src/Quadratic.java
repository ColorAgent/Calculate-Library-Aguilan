/* This class contains methods that perform various math operations
 * @author Alex Aguilan  
 * Version September 6th
 */a
	public class Quadratic {
		public static String quadDescriber (double a, double b, double c) {
			String GraphOpens;
			String Equation = "y = " + a + "^2 + " + b + "x + " + c;
			double AxisOfSym = (b * -1) / (2 * a);
			double YOfVertex = (a * AxisOfSym * AxisOfSym) + (b * AxisOfSym) + c;
			String xIntercept = quadForm(a, b, c);
			
			//if axis of sym is -0.0 turn it into 0.0
			if 
	}
}