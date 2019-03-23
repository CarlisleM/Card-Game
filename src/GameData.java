import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class GameData {

	static List<String> deckArray = new ArrayList<String>();
	static List<String> playerOneHand = new ArrayList<String>();
	static List<String> playerTwoHand = new ArrayList<String>();
	static List<String> playerThreeHand = new ArrayList<String>();
	static List<String> playerFourHand = new ArrayList<String>();

	
	// Draw5 = Draw 5 cards from the deck
	// Draw10 = Draw 10 cards from the deck
	// Put5Back = Make a player put 5 cards back in the deck
	// Put10Back = Make a player put 10 cards back in the deck
	// Take5 = Take 5 from another player
	// Take10 = Take 10 from another player
	// DummyCard = Do nothing
	// SuperRare = idk yet something special
	
	public static void createTwoPlayerDeck() {
		deckArray.addAll(Arrays.asList(
				"Draw5",
				"Draw10",
				"Put5Back",	
				"Draw5",
				"Draw10",
				"Put5Back",				
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"SuperRare"
				)
			);
	}
	
	public static void createThreePlayerDeck() {
		deckArray.addAll(Arrays.asList(
				"Draw5",
				"Draw10",
				"Put5Back",	
				"Draw5",
				"Draw10",
				"Put5Back",				
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"SuperRare"
				)
			);
	}
	
	public static void createFourPlayerDeck() {
		deckArray.addAll(Arrays.asList(
				"Draw5",
				"Draw10",
				"Put5Back",	
				"Draw5",
				"Draw10",
				"Put5Back",				
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Put10Back",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Draw5",
				"Draw10",
				"Put5Back",
				"Draw5",
				"Draw10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"Take5",
				"Take5",
				"Take10",
				"Take10",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"DummyCard",
				"SuperRare"
				)
			);
	}
	
	public static void changeTurn() {
		Main.cardPlayed = "";
    	Main.currentTurn = Main.currentTurn+1;
    	
    	if (Main.playerCount == 2) {
        	if (Main.currentTurn == 3) {
        		Main.currentTurn = 1;
        	}
    	} else if (Main.playerCount == 3) {
        	if (Main.currentTurn == 4) {
        		Main.currentTurn = 1;
        	}
    	} else {
        	if (Main.currentTurn == 5) {
        		Main.currentTurn = 1;
        	}
    	}
    	
    	Collections.shuffle(deckArray); 
	}
	
	public static void drawCard() {
		Random r = new Random();
        int randomNumber = r.nextInt(deckArray.size());
		Main.currentHand.add(deckArray.get(randomNumber));   
    	deckArray.remove(randomNumber);
	}
	
	public static void drawFive() {
		Main.currentHand.remove(Main.currentHand.indexOf("Draw5"));
		if (deckArray.size() < 5) {
			for (int i = 0; i < deckArray.size(); i++) {
				Random r = new Random();
		        int randomNumber = r.nextInt(deckArray.size());
		        Main.currentHand.add(deckArray.get(randomNumber));
				deckArray.remove(randomNumber); 
			}
		} else {
			for (int i = 0; i < 5; i++) {
				Random r = new Random();
		        int randomNumber = r.nextInt(deckArray.size());
		        Main.currentHand.add(deckArray.get(randomNumber));
				deckArray.remove(randomNumber); 
			}
		}
	}
	
	public static void drawTen() {
		Main.currentHand.remove(Main.currentHand.indexOf("Draw10"));
		if (deckArray.size() < 10) {
			for (int i = 0; i < deckArray.size(); i++) {
				Random r = new Random();
		        int randomNumber = r.nextInt(deckArray.size());
				Main.currentHand.add(deckArray.get(randomNumber));
				deckArray.remove(randomNumber); 
			}
		} else {
			for (int i = 0; i < 10; i++) {
				Random r = new Random();
		        int randomNumber = r.nextInt(deckArray.size());
				Main.currentHand.add(deckArray.get(randomNumber));
				deckArray.remove(randomNumber); 
			}			
		}
	}
	
	public static void putBackFive() {
		String selectedPlayer = "";		
		Main.currentHand.remove(Main.currentHand.indexOf("Put5Back"));
		while (!"1".contentEquals(selectedPlayer) && !"2".contentEquals(selectedPlayer) && !"3".contentEquals(selectedPlayer) && !"4".contentEquals(selectedPlayer)) {
			System.out.println("Which player are you targeting? ");
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				selectedPlayer = in.readLine();
				System.out.println("Player selected was: " + selectedPlayer);
			} catch (Exception e) {
				//  Block of code to handle errors
			}
		}
		
		if (selectedPlayer.equals("1")) {
			if (playerOneHand.size() < 5) {
				for (int i = 0; i < playerOneHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerOneHand.size());
					deckArray.add(playerOneHand.get(randomNumber));
					playerOneHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 5; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerOneHand.size());
					deckArray.add(playerOneHand.get(randomNumber));
					playerOneHand.remove(randomNumber); 
				}
			}
		} else if (selectedPlayer.equals("2")) {
			if (playerTwoHand.size() < 5) {
				for (int i = 0; i < playerTwoHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerTwoHand.size());
					deckArray.add(playerTwoHand.get(randomNumber));
					playerTwoHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 5; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerTwoHand.size());
					deckArray.add(playerTwoHand.get(randomNumber));
					playerTwoHand.remove(randomNumber); 
				}
			}
		} else if (selectedPlayer.equals("3")) {
			if (playerThreeHand.size() < 5) {
				for (int i = 0; i < playerThreeHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerThreeHand.size());
					deckArray.add(playerThreeHand.get(randomNumber));
					playerThreeHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 5; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerThreeHand.size());
					deckArray.add(playerThreeHand.get(randomNumber));
					playerThreeHand.remove(randomNumber); 
				}
			}
		} else {
			if (playerFourHand.size() < 5) {
				for (int i = 0; i < playerFourHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerFourHand.size());
					deckArray.add(playerFourHand.get(randomNumber));
					playerFourHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 5; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerFourHand.size());
					deckArray.add(playerFourHand.get(randomNumber));
					playerFourHand.remove(randomNumber); 
				}
			}
		}
	}

	public static void putBackTen() {
		String selectedPlayer = "0";	
		Main.currentHand.remove(Main.currentHand.indexOf("Put10Back"));
		while (!"1".contentEquals(selectedPlayer) || !"2".contentEquals(selectedPlayer) || !"3".contentEquals(selectedPlayer) || !"4".contentEquals(selectedPlayer)) {
			System.out.println("Which player are you targeting? ");
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				selectedPlayer = in.readLine();
				System.out.println("Player selected was: " + selectedPlayer);
			} catch (Exception e) {
				//  Block of code to handle errors
			}
		}
		
		if (selectedPlayer.equals("1")) {
			if (playerOneHand.size() < 10) {
				for (int i = 0; i < playerOneHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerOneHand.size());
					deckArray.add(playerOneHand.get(randomNumber));
					playerOneHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerOneHand.size());
					deckArray.add(playerOneHand.get(randomNumber));
					playerOneHand.remove(randomNumber); 
				}
			}
		} else if (selectedPlayer.equals("2")) {
			if (playerTwoHand.size() < 10) {
				for (int i = 0; i < playerTwoHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerTwoHand.size());
					deckArray.add(playerTwoHand.get(randomNumber));
					playerTwoHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerTwoHand.size());
					deckArray.add(playerTwoHand.get(randomNumber));
					playerTwoHand.remove(randomNumber); 
				}
			}
		} else if (selectedPlayer.equals("3")) {
			if (playerThreeHand.size() < 10) {
				for (int i = 0; i < playerThreeHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerThreeHand.size());
					deckArray.add(playerThreeHand.get(randomNumber));
					playerThreeHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerThreeHand.size());
					deckArray.add(playerThreeHand.get(randomNumber));
					playerThreeHand.remove(randomNumber); 
				}
			}
		} else {
			if (playerFourHand.size() < 10) {
				for (int i = 0; i < playerFourHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerFourHand.size());
					deckArray.add(playerFourHand.get(randomNumber));
					playerFourHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerFourHand.size());
					deckArray.add(playerFourHand.get(randomNumber));
					playerFourHand.remove(randomNumber); 
				}
			}
		}
	}
	
	public static void takeFive() {
		String selectedPlayer = "0";	
		Main.currentHand.remove(Main.currentHand.indexOf("Take5"));
		while (!"1".contentEquals(selectedPlayer) || !"2".contentEquals(selectedPlayer) || !"3".contentEquals(selectedPlayer) || !"4".contentEquals(selectedPlayer)) {
			System.out.println("Which player are you targeting? ");
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				selectedPlayer = in.readLine();
				System.out.println("Player selected was: " + selectedPlayer);
			} catch (Exception e) {
				//  Block of code to handle errors
			}
		}
				
		if (selectedPlayer.equals("1")) {
			if (playerOneHand.size() < 5) {
				for (int i = 0; i < playerOneHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerOneHand.size());
					Main.currentHand.add(playerOneHand.get(randomNumber));
					playerOneHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 5; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerOneHand.size());
			        Main.currentHand.add(playerOneHand.get(randomNumber));
					playerOneHand.remove(randomNumber); 
				}
			}
		} else if (selectedPlayer.equals("2")) {
			if (playerTwoHand.size() < 5) {
				for (int i = 0; i < playerTwoHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerTwoHand.size());
			        Main.currentHand.add(playerTwoHand.get(randomNumber));
					playerTwoHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 5; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerTwoHand.size());
			        Main.currentHand.add(playerTwoHand.get(randomNumber));
					playerTwoHand.remove(randomNumber); 
				}
			}
		} else if (selectedPlayer.equals("3")) {
			if (playerThreeHand.size() < 5) {
				for (int i = 0; i < playerThreeHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerThreeHand.size());
			        Main.currentHand.add(playerThreeHand.get(randomNumber));
					playerThreeHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 5; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerThreeHand.size());
			        Main.currentHand.add(playerThreeHand.get(randomNumber));
					playerThreeHand.remove(randomNumber); 
				}
			}
		} else {
			if (playerFourHand.size() < 5) {
				for (int i = 0; i < playerFourHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerFourHand.size());
			        Main.currentHand.add(playerFourHand.get(randomNumber));
					playerFourHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 5; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerFourHand.size());
			        Main.currentHand.add(playerFourHand.get(randomNumber));
					playerFourHand.remove(randomNumber); 
				}
			}
		}
	}
	
	public static void takeTen() {
		String selectedPlayer = "0";	
		Main.currentHand.remove(Main.currentHand.indexOf("Take10"));
		while (!"1".contentEquals(selectedPlayer) || !"2".contentEquals(selectedPlayer) || !"3".contentEquals(selectedPlayer) || !"4".contentEquals(selectedPlayer)) {
			System.out.println("Which player are you targeting? ");
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				selectedPlayer = in.readLine();
				System.out.println("Player selected was: " + selectedPlayer);
			} catch (Exception e) {
				//  Block of code to handle errors
			}
		}
				
		if (selectedPlayer.equals("1")) {
			if (playerOneHand.size() < 10) {
				for (int i = 0; i < playerOneHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerOneHand.size());
					Main.currentHand.add(playerOneHand.get(randomNumber));
					playerOneHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerOneHand.size());
			        Main.currentHand.add(playerOneHand.get(randomNumber));
					playerOneHand.remove(randomNumber); 
				}
			}
		} else if (selectedPlayer.equals("2")) {
			if (playerTwoHand.size() < 10) {
				for (int i = 0; i < playerTwoHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerTwoHand.size());
			        Main.currentHand.add(playerTwoHand.get(randomNumber));
					playerTwoHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerTwoHand.size());
			        Main.currentHand.add(playerTwoHand.get(randomNumber));
					playerTwoHand.remove(randomNumber); 
				}
			}
		} else if (selectedPlayer.equals("3")) {
			if (playerThreeHand.size() < 10) {
				for (int i = 0; i < playerThreeHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerThreeHand.size());
			        Main.currentHand.add(playerThreeHand.get(randomNumber));
					playerThreeHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerThreeHand.size());
			        Main.currentHand.add(playerThreeHand.get(randomNumber));
					playerThreeHand.remove(randomNumber); 
				}
			}
		} else {
			if (playerFourHand.size() < 10) {
				for (int i = 0; i < playerFourHand.size(); i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerFourHand.size());
			        Main.currentHand.add(playerFourHand.get(randomNumber));
					playerFourHand.remove(randomNumber); 
				}
			} else {
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
			        int randomNumber = r.nextInt(playerFourHand.size());
			        Main.currentHand.add(playerFourHand.get(randomNumber));
					playerFourHand.remove(randomNumber); 
				}
			}
		}
	}
	
	public static void dummyCard() {
		Main.currentHand.remove(Main.currentHand.indexOf("DummyCard"));
	}
	
	public static void superRare() {
		Main.currentHand.remove(Main.currentHand.indexOf("SuperRare"));
	}
	
}
