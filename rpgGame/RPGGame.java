
/*
 * This class is inherited from VideoGame class
 */

package rpgGame;

import educationalGame.EducationalGame;
import game.Game;
import videoGame.VideoGame;

public class RPGGame extends VideoGame {
	private String gameWorld;

	/**
	 * This is a default constructor that inherit instances from super class: VideoGame
	 */
	public RPGGame() {
		super();
	}

	/**
	 * This is a copy constructor
	 * @param g
	 * @param v
	 * @param r
	 */
	public RPGGame(Game g, VideoGame v, RPGGame r) {
		super(g, v);
		gameWorld = r.gameWorld;
	}

	/**
	 * This is a constructor with parameters
	 * @param name
	 * @param numPlayers
	 * @param gameTime
	 * @param gamePrice
	 * @param gameStudio
	 * @param gamingPlatform
	 * @param gameWorld
	 */
	public RPGGame(String name, int numPlayers, int gameTime, int gamePrice, String gameStudio, GamingPlatform gamingPlatform,
			String gameWorld) {
		super(name, numPlayers, gameTime, gamePrice, gameStudio, gamingPlatform);
		this.gameWorld = gameWorld;
	}

	/**
	 * This is the getter for gameWorld
	 * @return
	 */
	public String getGameWorld() {
		return gameWorld;
	}

	/**
	 * setter for gameWorld
	 * @param gameWorld
	 */
	public void setGameWorld(String gameWorld) {
		this.gameWorld = gameWorld;
	}

	// TODO to be modified according to the question
	@Override
	public String toString() {
		return "RPGGame [gameWorld=" + gameWorld + ", gamePrice=" + gamePrice + ", gameStudio=" + gameStudio
				+ ", gamingPlatform=" + gamingPlatform + ", name=" + name + ", numPlayers=" + numPlayers + ", gameTime="
				+ gameTime + "]";
	}

	/**
	 * an equal method that compares if two objects are the same
	 * @param rPGGame
	 * @return
	 */
	public boolean equals(RPGGame rPGGame) {
		if (rPGGame == null || !(rPGGame instanceof RPGGame)) {
			return false;
		} else if (this.name == rPGGame.name && this.numPlayers == rPGGame.numPlayers
				&& this.gameTime == rPGGame.gameTime && this.gamePrice == rPGGame.gamePrice
				&& this.gameStudio == rPGGame.gameStudio && this.gamingPlatform == rPGGame.gamingPlatform
				&& this.gameWorld == rPGGame.gameWorld) {
			return true;
		} else {
			return false;
		}

	}

}
