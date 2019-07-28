package solver;

//Helper class to discover map sizes and starting point
public class MapConfig {
	
	private int maxN;
	private int maxS;
	private int maxE;
	private int maxW;
	private int currentV;
	private int currentH;
	
	public MapConfig() {
		this.maxN = 0;
		this.maxS = 0;
		this.maxE = 0;
		this.maxW = 0;
		this.currentV = 0;
		this.currentH = 0;
	}
	
	public void moveNorth() {
		this.currentV += 1;
		if (currentV > maxN) {
			maxN = currentV;
		}
	}
	
	public void moveSouth() {
		this.currentV -= 1;
		if (currentV < maxS) {
			maxS = currentV;
		}
	}
	
	public void moveEast() {
		this.currentH += 1;
		if (currentH > maxE) {
			maxE = currentH;
		}
	}
	
	public void moveWest() {
		this.currentH -= 1;
		if (currentH < maxW) {
			maxW = currentH;
		}
	}
	
	public int getVerticalSize() {
		return maxN - maxS + 1;
	}
	
	public int getHorizontalSize() {
		return maxE - maxW + 1;
	}
	
	public int getStartingY() {
		return maxN;
	}
	
	public int getStartingX() {
		return Math.abs(maxW);
	}
	
}
