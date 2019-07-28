import java.util.Scanner;

import solver.Solver;
import solver.HashSolverImpl;

/**
 * 
 * @author Diogo Ferreira
 *
 * Main class for input and output
 */
public class HashMain {

	
	//main method to receive input and present output
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String path = in.nextLine();
		in.close();
		
		Solver solver = new HashSolverImpl();
		int result = solver.solve(path);
		System.out.println(result);
	}

}