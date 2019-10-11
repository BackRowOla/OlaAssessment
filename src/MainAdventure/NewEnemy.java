package MainAdventure;

public class NewEnemy extends Unit {

	public NewEnemy(int health, int xPos, int yPos) {
		super(health, xPos, yPos);
	}

	public boolean isPlayerNearby(NewPlayer p) {
		int base = p.getxPos() - this.getxPos();
		int height = p.getyPos() - this.getyPos();
		int distance = (int) Math.hypot(base, height);

		if (!(distance >= 1)) {
			return false;
		} else {
			return true;
		}
	}
}