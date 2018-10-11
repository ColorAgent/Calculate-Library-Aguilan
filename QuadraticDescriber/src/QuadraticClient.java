/*\Takes the input from the user and outputs the description of the graph
 * @author Alex Aguilan
 * @version 5 October 2018
 */a

import java.util.*;

//ask users for coefficients of a quadratic equation & prints description of the graph
public class QuadraticClient {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		boolean keepgoing = true;
		System.out.println("Welcome to Quadratic Describer" + "\nThis will provide values for the coefficients a, b, and c!");
		
		//ask user for variables and print description of graph
		while(keepgoing){
