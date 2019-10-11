package MainAdventure;

import java.util.Random;

public abstract class Unit {

	private int health;
	private int xPos;
	private int yPos;

	public Unit(int health, int xPos, int yPos) {
		super();
		this.health = health;
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public String action() {
		String[] moves = {"rock","paper","scissors"};
		return moves[new Random().nextInt(3)];
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
}
