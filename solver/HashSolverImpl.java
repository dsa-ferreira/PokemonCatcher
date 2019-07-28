package solver;

/**
 * 
 * @author Diogo Ferreira
 *
 * Solver class that uses a hash function and an array to save 
 * which map positions have already been visited.
 * Is theoretically faster than the other solution but takes up
 * more memory and, if the length of the path is greater than the
 * base prime selected, has to do the costly operation of finding
 * the next prime.
 */

public class HashSolverImpl implements Solver {
	private static final int BASE_PRIME = 311;

	private int pokeCount;
	private int currentX;
	private int currentY;
	private int prime;
	private boolean[] map;

	//Constructor
	public HashSolverImpl() {
		reset();
	}

	//reset method for testing purposes
	public void reset() {
		this.pokeCount = 0;
		this.currentX = 0;
		this.currentY = 0;
		this.prime = BASE_PRIME;
	}

	//main solver method that runs the path and does corresponding moves
	public int solve(String path) {
		setupArray(path.length());
		String[] moves = path.split("");
		for (String move : moves) {
			switch (move.toUpperCase()) {
			case "N":
				moveNorth();
				break;
			case "S":
				moveSouth();
				break;
			case "O":
				moveWest();
				break;
			case "E":
				moveEast();
				break;
			}
		}

		return pokeCount;
	}

	//creates the new array based on the size of the path and the prime selected.
	//selects new prime if needed
	private void setupArray(int size) {
		if(size > prime)
			prime = find_next_prime(size);
		
		this.map = new boolean[(prime + size) * prime + 1];
		checkCurrentPos();
	}

	//hash method for 2d coordenates
	private int hashCoord(int x, int y) {
		return (prime + x) * prime + y;
	}

	// simulate a move north and catch pokemon if first visit
	private void moveNorth() {
		currentY--;
		checkCurrentPos();
	}

	// simulate a move south and catch pokemon if first visit
	private void moveSouth() {
		currentY++;
		checkCurrentPos();
	}

	// simulate a move east and catch pokemon if first visit
	private void moveEast() {
		currentX++;
		checkCurrentPos();
	}

	// simulate a move west and catch pokemon if first visit
	private void moveWest() {
		currentX--;
		checkCurrentPos();
	}

	//check if there is a pokemon in current position
	private void checkCurrentPos() {
		int coordHash = hashCoord(currentX, currentY);
		if (!map[coordHash]) {
			pokeCount++;
			map[coordHash] = true;
		}
	}
	
	//method for finding the next prime after a given number
	private static int find_next_prime(int n) {
	    boolean isPrime = false;

	    int start = 2; 

	    while (!isPrime) {
	        n += 1;
	        int m = (int) Math.ceil(Math.sqrt(n));

	        isPrime = true;
	        for (int i = start; i <= m; i++) {
	            if (n % i == 0) {
	                isPrime = false;
	                break;
	            } 
	        }
	    }
	    return n;
	}
}
