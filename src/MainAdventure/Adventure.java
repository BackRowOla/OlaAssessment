package MainAdventure;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Adventure {

	static Scanner sc = new Scanner(System.in);
	static Watch watchDevice = new Watch();
//	static Player you;
	static NewPlayer newYou;
	static List<NewEnemy> listOfEnemies = new ArrayList<>(); // not used
	static Treasure item;

	public static void main(String[] args) {

		// === PLAYER INPUT INTRO ===

		System.out.println("Enter your name, brave adventurer!");
		String yourName = sc.nextLine();
		System.out.println("What treasure do you seek?");
		String contents = sc.nextLine();

		newYou = new NewPlayer(yourName, new Random().nextInt(15), new Random().nextInt(15));
//		you = new Player(yourName, new Random().nextInt(15), new Random().nextInt(15));
		item = new Treasure(contents, new Random().nextInt(15), new Random().nextInt(15));
		
		
		for(int i = 0; i < 3; i++) {
			listOfEnemies.add(new NewEnemy(new Random().nextInt(5), new Random().nextInt(15), 15));
		}

		// === WALL OF TEXT ===
		sleep(3);
		System.out.println(wallOfText());
		// === GAME STARTS ===
		gameLoop();
		// === GAME ENDS ===
		sc.close();
		endMsg(contents);
	}

	public static void sleep(int time) {
		// I'm sorry Jordan, it had to be done
		try {
			Thread.sleep(time * 1000);
		} catch (Exception e) {
		}
	}
	
	public static String wallOfText() {
		return "\nGrey foggy clouds float oppressively close to you,"
				+ "\nreflected in the murky grey water which reaches up your shins."
				+ "\nSome black plants barely poke out of the shallow water."
				+ "\n\nYou notice a small watch-like device in your left hand.  \r\n"
				+ "It has hands like a watch, but the hands don't seem to tell time. \r\n\n"
				+ distance(watchDevice.newDistanceToTreasure(newYou, item))
				+ "\nTry \"north\", \"south\", \"east\", or \"west\"";
	}

	public static void sleep() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}

	public static String distance(int i) {
		return "The dail reads " + i + "m";
	}

	public static void gameLoop() {
		do {	
//			for(NewEnemy e: listOfEnemies) {
//				if(e.isPlayerNearby(newYou)) {
//					System.out.println("\nLoading...");
//					System.out.print("		-- btw Combat is automated..."); // last min add
//					sleep(5);
//					initiateCombat(newYou, e);
//				}
//			}
			String playerDirection = sc.nextLine();
			newYou.direction(playerDirection);
			if (watchDevice.newDistanceToTreasure(newYou, item) == 0) {
				item.setFound(true);
			}
			System.out.println(distance(watchDevice.newDistanceToTreasure(newYou, item)));
		} while (!item.isFound);
	}
	
	public static void initiateCombat(NewPlayer p, NewEnemy e){
		/// do rock paper scissors 
		// return if you died or enemy
//		do {
//			if(p.action().equals("rock"))
//		}while(p.getHealth() > 0 || e.getHealth() > 0);
		
		// not enough time to impelemnt properly
		System.out.println("\nYour HP " + p.getHealth());
		sleep(3);
		p.setHealth(p.getHealth()- new Random().nextInt(4));
		System.out.println("\nAfter a long hard battle of rock paper scissers, you lost some HP and the enemy is dead" );
		System.out.println("\nYour HP is now" + p.getHealth());
	}
	
	public static void endMsg(String contents) {
		System.out.println("inside the chest is: " + contents + "!" + "... You also find a cookie.");
		sleep(2);
		System.out.println("\nCongratulations " + newYou.getPlayerName() + "!\n\nSadly the adventure stops here.");
	}
}