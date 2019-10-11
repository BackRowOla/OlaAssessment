package MainAdventure;

public class Watch {
		
	// could move this to Adventure class and save a line creating the object
//	public int distanceToTreasure(Player p, Treasure t) {
//		int base = t.getTreasureX() - p.getPlayerX();
//		int height = t.getTreasureY() - p.getPlayerY();
//		return (int) Math.hypot(base, height);
//	}
	
	public int newDistanceToTreasure(NewPlayer p, Treasure t) {
		int base =  t.getTreasureX() - p.getxPos(); // i do realise the method is not camelCase it was auto-generated like that...
		int height = t.getTreasureY() - p.getyPos();
		return (int) Math.hypot(base, height);
	}
}
