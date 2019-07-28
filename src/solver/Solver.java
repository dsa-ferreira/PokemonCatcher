package solver;

/**
 * 
 * @author Diogo Ferreira
 * 
 * Interface for solver implementations
 *
 */
public interface Solver {
	
	public void reset();
	
	public int solve(String path);
	
}
