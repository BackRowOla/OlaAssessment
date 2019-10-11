package MainAdventure;

public class NewPlayer extends Unit {

	private String playerName;

	public NewPlayer(String name, int xPos, int yPos) {
		super(10, xPos, yPos);
		this.playerName = name;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void direction(String d) {
		switch (d) {
		case "north":
			setyPos(getyPos()+1);
			break;
		case "south":
			setyPos(getyPos()-1);
			break;
		case "east":
			setxPos(getxPos()+1);
			break;
		case "west":
			setxPos(getxPos()-1);
			break;
		default:
			System.out.println("Not a valid direction");
			break;
		}
	}
}
