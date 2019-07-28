package solver;

//Helper class to discover map sizes and starting point
public class MapConfigImpl implements MapConfig {

	private int maxN;
	private int maxS;
	private int maxE;
	private int maxW;
	private int currentV;
	private int currentH;

	public MapConfigImpl() {
		this.maxN = 0;
		this.maxS = 0;
		this.maxE = 0;
		this.maxW = 0;
		this.currentV = 0;
		this.currentH = 0;
	}

	// discovers map configuration
	public void discoverMap(String[] moves) {
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
	}

	private void moveNorth() {
		this.currentV += 1;
		if (currentV > maxN) {
			maxN = currentV;
		}
	}

	private void moveSouth() {
		this.currentV -= 1;
		if (currentV < maxS) {
			maxS = currentV;
		}
	}

	private void moveEast() {
		this.currentH += 1;
		if (currentH > maxE) {
			maxE = currentH;
		}
	}

	private void moveWest() {
		this.currentH -= 1;
		if (currentH < maxW) {
			maxW = currentH;
		}
	}

	//returns the vertical length of the 2d map
	public int getVerticalSize() {
		return maxN - maxS + 1;
	}

	//returns the horizontal length of the 2d map
	public int getHorizontalSize() {
		return maxE - maxW + 1;
	}

	//returns the starting y coordinate
	public int getStartingY() {
		return maxN;
	}

	//returns the starting x coordinate
	public int getStartingX() {
		return Math.abs(maxW);
	}

}
