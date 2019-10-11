package MainAdventure;


public class Player {

	private String playerName;
	private int playerX;
	private int playerY;

	public Player(String playerName, int playerX, int playerY) {
		super();
		this.playerName = playerName;
		this.playerX = playerX;
		this.playerY = playerY;
	}

	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerX() {
		return playerX;
	}

	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}

	public int getPlayerY() {
		return playerY;
	}

	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}

	public void direction(String d) {
		switch (d) {
		case "north":
			playerY++;
			break;
		case "south":
			playerY--;
			break;
		case "east":
			playerX++;
			break;
		case "west":
			playerX--;
			break;
		default:
			System.out.println("Not a valid direction");
			break;
		}
	}
}