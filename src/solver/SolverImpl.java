package solver;


/**
 * 
 * @author Diogo Ferreira
 *	
 * Solver class that runs the path two times.
 * The first time checks the dimensions of the 2d world and the
 * starting positions.
 * The second runs the path through the bi-dimensional array 
 * to count the Pokemon caught.
 * Uses the least memory possible but has the disadvantage of
 * needing to run the path twice.
 */

public class SolverImpl implements Solver{
	private int pokeCount;
	private boolean[][] map;
	private int currentX;
	private int currentY;

	//Constructor
	public SolverImpl() {
		reset();
	}
	
	// reset method for testing purposes
	public void reset() {
		this.pokeCount = 1;
		this.map = new boolean[0][0];
	}

	// discovers map configuration
	private void discoverMap(String[] moves) {
		MapConfig config = new MapConfig();
		for (String move : moves) {
			switch (move.toUpperCase()) {
			case "N":
				config.moveNorth();
				break;
			case "S":
				config.moveSouth();
				break;
			case "O":
				config.moveWest();
				break;
			case "E":
				config.moveEast();
				break;
			}
		}
		setupMap(config);
	}

	// setup bi-dimensional array and starting positions
	private void setupMap(MapConfig config) {
		int x = config.getHorizontalSize();
		int y = config.getVerticalSize();
		this.map = new boolean[x][y];
		this.currentX = config.getStartingX();
		this.currentY = config.getStartingY();
		this.map[currentX][currentY] = true;
	}

	//main solver method that runs the path and does corresponding moves
	public int solve(String path) {
		String[] moves = path.split("");
		discoverMap(moves);
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
	
	//check to see if it is the first visit to the current position
	private void checkCurrentPos() {
		if (!map[currentX][currentY]) {
			pokeCount++;
			map[currentX][currentY] = true;
		}
	}

}
