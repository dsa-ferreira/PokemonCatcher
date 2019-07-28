import java.util.Scanner;

import solver.Solver;
import solver.SolverImpl;

/**
 * 
 * @author Diogo Ferreira
 *
 * Main class for input and output
 */
public class Main {

	
	//main method to receive input and present output
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String path = in.nextLine();
		in.close();
		
		Solver solver = new SolverImpl();
		int result = solver.solve(path);
		System.out.println(result);
	}

}
