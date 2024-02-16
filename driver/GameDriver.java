\
/**
 * The purpose of this class is to have a main method, 
 * and create many games, and store info into the objects, 
 * then store the objects into an array of size 14. 
 * Later find Max and Min by sorting with a loop, 
 * and filtered for the same studio with a method that compares two objects
 */

package driver;

import java.util.Scanner;

/**
 * import from the following packages
 */
import boardGame.BoardGame;
import cardGame.CardGame;
import educationalGame.EducationalGame;
import game.Game;
import rpgGame.RPGGame;
import videoGame.VideoGame;
import videoGame.VideoGame.GamingPlatform;

/**
 * This is the driver class
 * 
 * @author Chengyan Liu
 *
 */
public class GameDriver {

	public static void main(String[] args) {

		// Welcome message
		System.out.println();
		System.out.println(
				"-------------------------------------------------Welcome to see Chengyan Liu's Assignment2-------------------------------------------------");

		/**
		 * Create various objects from all the 6 classes
		 */
		Game game1 = new Game("LOL", 5, 30);
		Game game2 = new Game("LOL", 5, 30);
		Game videogame = new VideoGame("gameNameVideoGame", 6, 31, 88, "gameStudio2", GamingPlatform.ANDROID);
		Game boardGame = new BoardGame("gameNameBoardGame", 7, 32, true);
		Game cardGame = new CardGame("gameNameCardGame", 8, 33, 64, 4);
		Game educationalGame = new EducationalGame("gameNameEducationalGame", 9, 34, 100, "gameStudio1",
				GamingPlatform.IOS, "Math");
		Game rPGGame = new RPGGame("gameNamerPGGame", 10, 35, 200, "gameStudio1", GamingPlatform.IOS, "rPGGameWorld");

		/*
		 * display all their information using the toString() method
		 */
		System.out.println();
		System.out.println("PartI Q3: The exist games are: ");
		System.out.println(game1.toString());
		System.out.println(game2.toString());
		System.out.println(videogame.toString());
		System.out.println(boardGame.toString());
		System.out.println(cardGame.toString());
		System.out.println(educationalGame.toString());
		System.out.println(rPGGame.toString());

		/*
		 * Test the equality of some to the created objects using the equals() method.
		 */
		System.out.println();
		System.out.println("PartI Q3: Test the equality of game2 and cardGame to game1:");
		if (game1.equals(game2)) {
			System.out.println("game1 and game2 are the same");
		} else {
			System.out.println("game1 and game2 are different");
		}

		if (game1.equals(cardGame)) {
			System.out.println("game1 and cardGame are the same");
		} else {
			System.out.println("game1 and cardGame are different");
		}

		System.out.println();

		/*
		 * Create an array of 14 Game objects and fill that array with various objects
		 * from the 6 classes
		 */
		Game[] gameArray = new Game[14];

		for (int i = 0; i < gameArray.length; i++) {
			switch (i) {
			case 0:
				gameArray[i] = game1;
				break;
			case 1:
				gameArray[i] = game2;
				break;
			case 2:
				gameArray[i] = videogame;
				break;
			case 3:
				gameArray[i] = boardGame;
				break;
			case 4:
				gameArray[i] = cardGame;
				break;
			case 5:
				gameArray[i] = educationalGame;
				break;
			case 6:
				gameArray[i] = rPGGame;
				break;
			default:
				gameArray[i] = null;
				break;
			}

		}

		/*
		 * Trace(search) that array to find the game(s) with: (a) the most number of
		 * players (b) the least number of game time (c) same studio association
		 */
		System.out.println();
		System.out.println("PartI Q3 Trace(search) that array to find the game(s) with:(a) the most number of players");

		int maxNumPlayer = gameArray[0].getNumPlayers();

		for (int i = 0; i < gameArray.length; i++) {

			try {
				if (maxNumPlayer < gameArray[i].getNumPlayers()) {
					maxNumPlayer = gameArray[i].getNumPlayers();
				}

			} catch (NullPointerException e) {
				// e.printStackTrace();
			}
		}

		for (int i = 0; i < gameArray.length; i++) {
			if (gameArray[i] != null && gameArray[i].getNumPlayers() == maxNumPlayer) {
				System.out.println("The max number of player at array index #" + i + " is: " + maxNumPlayer);
				System.out.println(gameArray[i]);
			}
		}
		System.out.println();
		System.out.println(
				"PartI Q3 Trace(search) that array to find the game(s) with:(b) the least number of game time");

		int minNumPlayTime = gameArray[0].getGameTime();

		for (int i = 0; i < gameArray.length; i++) {

			try {
				if (minNumPlayTime > gameArray[i].getGameTime()) {
					minNumPlayTime = gameArray[i].getGameTime();
				}
			} catch (NullPointerException e) {
				// e.printStackTrace();
			}
		}

		for (int i = 0; i < gameArray.length; i++) {
			if (gameArray[i] != null && gameArray[i].getGameTime() == minNumPlayTime) {
				System.out.println("The min of play time at array index #" + i + " is: " + minNumPlayTime);
				System.out.println(gameArray[i]);
			}
		}

		System.out.println();
		System.out.println("PartI Q3 Trace(search) that array to find the game(s) with:(c) same studio association");

		for (int i = 0; i < gameArray.length; i++) {
			try {
				if (gameArray[i] instanceof VideoGame) {
					String sameStudio = ((VideoGame) gameArray[i]).getGameStudio();
					System.out.println("The game at array index #" + i + " :" + gameArray[i].toString());
				}

			} catch (ClassCastException e) {
				// e.printStackTrace();
				// e.getMessage();
			}

		}
		System.out.println();

		/*
		 * Call the gameSimilarTo() method to create a copy of the array created above.
		 * And display contents of both arrays. The copy is succeed, because the 14
		 * elements in the array between the two arrays are the same
		 */
		System.out.println("Part II Q4: The copied games are: ");
		Game.gameSimilarTo(gameArray);
		System.out.println();
		System.out.println("Part II Q4: The original games are: ");
		for(int i=0; i<gameArray.length;i++) {
			System.out.println(gameArray[i]);
		}
		System.out.println();

		System.out.println(
				"------------------------------------Thanks for using it!------------------------------------");

	}
}
