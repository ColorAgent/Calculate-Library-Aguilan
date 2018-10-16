/*\Takes the input from the user and outputs the description of the graph
 * @author Alex Aguilan
 * @version 5 October 2018
 */

import java.util.*;

//ask users for coefficients of a quadratic equation & prints description of the graph
public class QuadraticClient {
	public static void main(String[] args) {
		Scanner UserInputs = new Scanner(System.in);
		boolean Continue = true;
		System.out.println("Welcome to Quadratic Describer" + "\nThis will provide values for a, b, and c!");
		
		//ask user for variables and print description of graph
		while(Continue){
			System.out.println();
			System.out.print("a= ");
			double a = UserInputs.nextDouble();
			System.out.print("b= ");
			double b = UserInputs.nextDouble();
			System.out.print("c= ");
			double c = UserInputs.nextDouble();
			System.out.println();
			
			//ask the user if the user wants to quit and closes the loop if yes
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			if(UserInputs.next().equals("quit")){
			Continue = false;
			UserInputs.close();
			}
		}
	}
}