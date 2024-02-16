
/*
 * This class is inherited from Game class
 */

package cardGame;

import boardGame.BoardGame;
import game.Game;

public class CardGame extends Game {
	private int numberOfCards;
	private int numCardTypes;

	/**
	 * This is a default constructor that inherit instances from super class: Game
	 */
	public CardGame() {
		super();
	}

	/**
	 * This is a copy constructor 
	 * @param g is an object in game class
	 * @param b is an object in CardGame Class
	 */
	public CardGame(Game g, CardGame c) {
		super(g);
		numberOfCards = c.numberOfCards;
		numCardTypes = c.numCardTypes;
	}

	/**
	 * This is a constructor with parameters
	 * @param name is the name of the class
	 * @param numPlayers is the number of players in the class
	 * @param gameTime is the time played
	 * @param numberOfCards is the number of cards
	 * @param numCardTypes is the number of card types
	 */
	public CardGame(String name, int numPlayers, int gameTime, int numberOfCards, int numCardTypes) {
		super(name, numPlayers, gameTime);
		this.numberOfCards = numberOfCards;
		this.numCardTypes = numCardTypes;
	}

	/**
	 * get number of cards
	 * @return
	 */
	public int getNumberOfCards() {
		return numberOfCards;
	}

	/**
	 * set number of cards
	 * @param numberOfCards
	 */
	public void setNumberOfCards(int numberOfCards) {
		this.numberOfCards = numberOfCards;
	}

	/**
	 * get number of card types
	 * @return
	 */
	public int getNumCardTypes() {
		return numCardTypes;
	}

	/**
	 * set number of card types
	 * @param numCardTypes
	 */
	public void setNumCardTypes(int numCardTypes) {
		this.numCardTypes = numCardTypes;
	}

	// toString
	@Override
	public String toString() {
		return "CardGame [numberOfCards=" + numberOfCards + ", numCardTypes=" + numCardTypes + ", name=" + name
				+ ", numPlayers=" + numPlayers + ", gameTime=" + gameTime + "]";
	}

	/**
	 * an equal method that compares if two objects are the same
	 * @param cardGame
	 * @return
	 */
	// these null verifications will be in relation to protecting your program from
	// crashing because, if there's no such step to eliminate the exception, then
	// the program might have nullPointerException
	public boolean equals(CardGame cardGame) {
		if (cardGame == null || !(cardGame instanceof CardGame)) {
			return false;
		} else if (this.name == cardGame.name && this.numPlayers == cardGame.numPlayers
				&& this.gameTime == cardGame.gameTime && this.numberOfCards == cardGame.numberOfCards
				&& this.numCardTypes == cardGame.numCardTypes) {
			return true;
		} else {
			return false;
		}

	}

}
