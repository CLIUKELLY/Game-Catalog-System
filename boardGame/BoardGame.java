
/*
 * This class is inherited from Game class
 */
package boardGame;

import game.Game;
import videoGame.VideoGame;

public class BoardGame extends Game {

	/**
	 * timedTurns is a boolean type
	 */
	private boolean timedTurns;

	/**
	 * This is a default constructor that inherit instances from super class: Game
	 */
	public BoardGame() {
		super();
	}

	/**
	 * This is a copy constructor 
	 * @param g is an object in game class
	 * @param b is an object in boardGame Class
	 */
	public BoardGame(Game g, BoardGame b) {
		super(g);
		timedTurns = b.timedTurns;
	}

	/**
	 * This is a constructor with parameters
	 * @param name is the name of the game
	 * @param numPlayers is the number of players in the game
	 * @param gameTime is the game time
	 * @param timedTurns is the timed turns
	 */
	public BoardGame(String name, int numPlayers, int gameTime, boolean timedTurns) {
		super(name, numPlayers, gameTime);
		this.timedTurns = timedTurns;
	}

	/**
	 * getter for timed turns
	 * @return timed turns
	 */
	public boolean isTimedTurns() {
		return timedTurns;
	}

	/**
	 * set timed turns
	 * @param timedTurns
	 */
	public void setTimedTurns(boolean timedTurns) {
		this.timedTurns = timedTurns;
	}

	// toString method
	@Override
	public String toString() {
		return "BoardGame [timedTurns=" + timedTurns + ", name=" + name + ", numPlayers=" + numPlayers + ", gameTime="
				+ gameTime + "]";
	}

	/**
	 * an equal method that compares if two objects are the same
	 * @param boardGame
	 * @return
	 */
	// these null verifications will be in relation to protecting your program from
	// crashing because, if there's no such step to eliminate the exception, then
	// the program might have nullPointerException
	public boolean equals(BoardGame boardGame) {
		if (boardGame == null || !(boardGame instanceof BoardGame)) {
			return false;
		} else if (this.name == boardGame.name && this.numPlayers == boardGame.numPlayers && this.gameTime == boardGame.gameTime&&this.timedTurns==boardGame.timedTurns) {
			return true;
		} else {
			return false;
		}

	}

}
