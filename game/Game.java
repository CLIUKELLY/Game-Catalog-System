

/*
 * This is the super class of all classes, which contains the basic instance that a game needed
 */
package game;

public class Game {
	/**
	 * name is the name of the game
	 */
	protected String name;
	/**
	 * numPlayers is the number of players
	 */
	protected int numPlayers;
	/**
	 * gameTime is the game time of the game
	 */
	protected int gameTime;

	/**
	 * This is a default constructor
	 */
	public Game() {

	}

	/**
	 * This is a constructor that takes the following parameters
	 * @param name is the name of the game
	 * @param numPlayers is the number of players
	 * @param gameTime is the game time of the game
	 */
	public Game(String name, int numPlayers, int gameTime) {
		this.name = name;
		this.numPlayers = numPlayers;
		this.gameTime = gameTime;
	}

	/**
	 * This is a copy constructor
	 * @param g is the game object that passed in 
	 */
	public Game(Game g) {
		this.name = g.name;
		this.numPlayers = g.numPlayers;
		this.gameTime = g.gameTime;
	}

	/**
	 * getName 
	 * @return name of the game
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName
	 * @param name, set the name of a game object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getNumPlayers
	 * @return the number of players
	 */
	public int getNumPlayers() {
		return numPlayers;
	}

	/**
	 * set number of players of a game object
	 * @param numPlayers
	 */
	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	/**
	 * getGametime
	 * @return the game time of the calling object
	 */
	public int getGameTime() {
		return gameTime;
	}

	/**
	 * setGameTime
	 * @param gameTime of the calling object to the passed object
	 */
	public void setGameTime(int gameTime) {
		this.gameTime = gameTime;
	}

	// TODO to be modified according to the question
	@Override
	public String toString() {
		return "Game [name=" + name + ", numPlayers=" + numPlayers + ", gameTime=" + gameTime + "]";
	}

	/**
	 * an equal method that compares if two objects are the same
	 * @param game
	 * @return
	 */
	// these null verifications will be in relation to protecting your program from
	// crashing because, if there's no such step to eliminate the exception, then
	// the program might have nullPointerException
	public boolean equals(Game game) {
		if (game == null || !(game instanceof Game)) {
			return false;
		} else if (this.gameTime == game.gameTime && this.name==game.name && this.numPlayers==game.numPlayers) {
			return true;
		} else {
			return false;
		}

	}
	
	/**
	 * This is a static method that passed the calling object's elements to the new object
	 * @param game
	 * @return the passed object
	 */
	public static Game[] gameSimilarTo(Game[] game) {
		Game[] gameArrayCopy = new Game [50];
		
		for (int i=0; i<game.length;i++) {
			gameArrayCopy[i]=game[i];
			System.out.println(gameArrayCopy[i]);
		}
		
		return game;
	}
	
	

}
