package MainAdventure;

public class Treasure {
	
	String contents;
	int treasureX;
	int treasureY;
	boolean isFound = false;
	

	public Treasure(String contents, int treasureX, int treasureY) {
		super();
		this.contents = contents;
		this.treasureX = treasureX;
		this.treasureY = treasureY;
	}
	
	public boolean isFound() {
		return isFound;
	}
	
	public void setFound(boolean isFound) {
		this.isFound = isFound;
	}

	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getTreasureX() {
		return treasureX;
	}
	public void setTreasureX(int treasureX) {
		this.treasureX = treasureX;
	}
	public int getTreasureY() {
		return treasureY;
	}
	public void setTreasureY(int treasureY) {
		this.treasureY = treasureY;
	}
}