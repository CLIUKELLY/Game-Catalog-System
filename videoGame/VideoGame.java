

/*
 * This class is inherited from Game class
 */

package videoGame;

import game.Game;
import rpgGame.RPGGame;

public class VideoGame extends Game {

	/**
	 * gamePrice is the game price
	 */
	protected int gamePrice;
	/**
	 * gameStudio is the game studio
	 */
	protected String gameStudio;
	/**
	 * gaming platform is the gaming platform
	 */
	protected GamingPlatform gamingPlatform;

	/**
	 * This is a default constructor that inherit instances from super class: Game
	 */
	public VideoGame() {
		super();
	}

	/**
	 * This is a constrcutor with parameters
	 * 
	 * @param name
	 * @param numPlayers
	 * @param gameTime
	 * @param gamePrice
	 * @param gameStudio
	 * @param gamingPlatform
	 */
	public VideoGame(String name, int numPlayers, int gameTime, int gamePrice, String gameStudio,
			GamingPlatform gamingPlatform) {
		super(name, numPlayers, gameTime);
		this.gamePrice = gamePrice;
		this.gameStudio = gameStudio;
		this.gamingPlatform = gamingPlatform;
	}

	/**
	 * This is a copy constructor
	 * 
	 * @param g
	 * @param v
	 */
	public VideoGame(Game g, VideoGame v) {
		super(g);
		gamePrice = v.gamePrice;
		gameStudio = v.gameStudio;
		gamingPlatform = v.gamingPlatform;
	}

	/**
	 * getter for game price
	 * 
	 * @return
	 */
	public int getGamePrice() {
		return gamePrice;
	}

	/**
	 * setter for game price
	 * 
	 * @param gamePrice
	 */
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

	/**
	 * getter for game studio
	 * 
	 * @return
	 */
	public String getGameStudio() {
		return gameStudio;
	}

	/**
	 * setter for game studio
	 * 
	 * @param gameStudio
	 */
	public void setGameStudio(String gameStudio) {
		this.gameStudio = gameStudio;
	}

	/**
	 * getter for gaming platform
	 * 
	 * @return
	 */
	public GamingPlatform getGamingPlatform() {
		return gamingPlatform;
	}

	/**
	 * setter for gamingPlatform
	 * 
	 * @param gamingPlatform
	 */
	public void setGamingPlatform(GamingPlatform gamingPlatform) {
		this.gamingPlatform = gamingPlatform;
	}

	// toString
	@Override
	public String toString() {
		return "VideoGame [gamePrice=" + gamePrice + ", gameStudio=" + gameStudio + ", gamingPlatform=" + gamingPlatform
				+ ", name=" + name + ", numPlayers=" + numPlayers + ", gameTime=" + gameTime + "]";
	}

	/**
	 * an equal method that compares if two objects are the same
	 * 
	 * @param videoGame
	 * @return
	 */
	public boolean equals(VideoGame videoGame) {
		if (videoGame == null || !(videoGame instanceof VideoGame)) {
			return false;
		} else if (this.name == videoGame.name && this.numPlayers == videoGame.numPlayers
				&& this.gameTime == videoGame.gameTime && this.gamePrice == videoGame.gamePrice
				&& this.gameStudio == videoGame.gameStudio && this.gamingPlatform == videoGame.gamingPlatform) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * An enumerator type that can be : XBOX One,PS4, IOS, ANDROID
	 */
	public enum GamingPlatform {
		XBOX_One, PS4, IOS, ANDROID;
	}

}
