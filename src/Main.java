import java.io.*;
import java.util.*;

public class Main {
	
	static List<String> currentHand = new ArrayList<String>(); 
	static int currentTurn = 1;
	static int playerCount = 0;
	static String cardPlayed = "";
	
	public static void main(String[] args) throws IOException {
		
		int cardsPerPlayer = 0;
		String userInput = "";
		
		while (playerCount != 2 && playerCount != 3 && playerCount != 4) {
			System.out.println("Please enter the number of players between 2 and 4");
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				userInput = in.readLine();
				playerCount = Integer.parseInt(userInput);
				System.out.println(userInput);
			} catch (Exception e) {
				//  Block of code to handle errors
			}
		}
		
		PlayArea.main(args);
		
		if (playerCount == 2) {
			GameData.createTwoPlayerDeck();	
			cardsPerPlayer = 5;
			PlayerOne.main(args);
			PlayerTwo.main(args);
		} else if (playerCount == 3) {
			GameData.createThreePlayerDeck();
			cardsPerPlayer = 7;
			PlayerOne.main(args);
			PlayerTwo.main(args);
			PlayerThree.main(args);
		} else {
			GameData.createFourPlayerDeck();
			cardsPerPlayer = 10;
			PlayerOne.main(args);
			PlayerTwo.main(args);
			PlayerThree.main(args);
			PlayerFour.main(args);
		}
				
		System.out.println("Number of players: " + playerCount);
		System.out.println("Deck size: " + GameData.deckArray.size());
		System.out.println("Starting hand size: " + cardsPerPlayer);
		
		// Deal players hands
		for (int i = 0; i < playerCount; i++) {
			for (int j = 0; j < cardsPerPlayer; j++) {
				Random r = new Random();
		        int randomNumber = r.nextInt(GameData.deckArray.size());
		        if (i == 0) {
		        	GameData.playerOneHand.add(GameData.deckArray.get(randomNumber));   
		        	GameData.deckArray.remove(randomNumber); 
		        } else if (i == 1) {
		        	GameData.playerTwoHand.add(GameData.deckArray.get(randomNumber));
		        	GameData.deckArray.remove(randomNumber); 
		        }  else if (i == 2) {
		        	GameData.playerThreeHand.add(GameData.deckArray.get(randomNumber));
		        	GameData.deckArray.remove(randomNumber); 
		        } else {
		        	GameData.playerFourHand.add(GameData.deckArray.get(randomNumber));
		        	GameData.deckArray.remove(randomNumber); 
		        }
			}
		}        
		
		for (int i = 0; i < playerCount; i++) {
			System.out.println("Player " + (i+1) + "'s hand");
	        if (i == 0) {
	    		System.out.println(GameData.playerOneHand);   	
	        } else if (i == 1) {
	        	System.out.println(GameData.playerTwoHand);
	        }  else if (i == 2) {
	        	System.out.println(GameData.playerThreeHand); 
	        } else {
	        	System.out.println(GameData.playerFourHand); 
	        }
		}

		System.out.println("Current number of cards in the deck: " + GameData.deckArray.size());
		System.out.println("");	
		System.out.println("");	
		System.out.println("Game started");	
		
		while (GameData.deckArray.size() > 0) {
			
			System.out.println("Player " + currentTurn + "'s turn");
			
			if (currentTurn == 1) {
				PlayerOne.togglePlayerOneFrame();				
				currentHand = GameData.playerOneHand;
				System.out.println("Your hand: " + currentHand);
				while(currentTurn == 1) {
					if (currentHand.size() == 0) {
						GameData.drawCard();
					} else {
						System.out.println(cardPlayed);
						System.out.println(currentTurn);
						System.out.println("Type the card you want to play or \"Draw\" to end your turn.");
						
						while (!currentHand.contains(cardPlayed) || cardPlayed == "Draw") {
							System.out.println("What would you like to do?");
							try {
								BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
								cardPlayed = in.readLine();
								System.out.println("Card played was: " + cardPlayed);
							} catch (Exception e) {
								//  Block of code to handle errors
							}
						}
						determineCard();
					}
				}
				GameData.playerOneHand = currentHand;
				PlayerOne.togglePlayerOneFrame();
				GameData.changeTurn();
			} else if (currentTurn == 2) {
				PlayerTwo.togglePlayerTwoFrame();
				currentHand = GameData.playerTwoHand;
				System.out.println("Your hand: " + currentHand);
				while(currentTurn == 2) {
					if (currentHand.size() == 0) {
						GameData.drawCard();
					} else {
						System.out.println(cardPlayed);
						System.out.println(currentTurn);
						System.out.println("Type the card you want to play or \"Draw\" to end your turn.");
						
						while (!currentHand.contains(cardPlayed) || cardPlayed.equals("Draw")) {
							System.out.println("What would you like to do?");
							try {
								BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
								cardPlayed = in.readLine();
								System.out.println("Card played was: " + cardPlayed);
							} catch (Exception e) {
								//  Block of code to handle errors
							}
						}
						determineCard();
					}
				}
				GameData.playerTwoHand = currentHand;	
				PlayerTwo.togglePlayerTwoFrame();
				GameData.changeTurn();
			} else if (currentTurn == 3) {
				currentHand = GameData.playerThreeHand;
				while(currentTurn == 3) {
					
				}
				GameData.playerThreeHand = currentHand;
			} else {
				currentHand = GameData.playerFourHand;
				while(currentTurn == 4) {
					
				}
				GameData.playerFourHand = currentHand;
			}
			
		}
		
	}
	
	public static void determineCard() {
		if (cardPlayed.equals("Draw")) {
			GameData.drawCard();
		} else if (cardPlayed.equals("Draw5")) {
			GameData.drawFive();
		} else if (cardPlayed.equals("Draw10")) {
			GameData.drawTen();
		} else if (cardPlayed.equals("put5Back")) {
			GameData.drawFive();
		} else if (cardPlayed.equals("put10Back")) {
			GameData.drawTen();
		} else if (cardPlayed.equals("Take5")) {
			GameData.takeFive();
		} else if (cardPlayed.equals("Take10")) {
			GameData.takeTen();
		} else if (cardPlayed.equals("DummyCard")) {
			GameData.dummyCard();
		} else if (cardPlayed.equals("SuperRare")) {
			GameData.superRare();
		} else {
			// Nothing
		}
	}
	
}
