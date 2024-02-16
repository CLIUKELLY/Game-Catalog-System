

/*
 * This class is inherited from VideoGame class
 */

package educationalGame;

import cardGame.CardGame;
import game.Game;
import videoGame.VideoGame;

public class EducationalGame extends VideoGame {
	private String subjectLearnt;

	/**
	 * This is a default constructor that inherit instances from super class: VideoGame
	 */
	public EducationalGame() {
		super();
	}

	/**
	 * This is a copy constructor 
	 * @param g is an object in game
	 * @param v is an videoGmae in videoGame
	 * @param e is an educationalGame in EducationalGame
	 */
	public EducationalGame(Game g, VideoGame v, EducationalGame e) {
		super(g, v);
		subjectLearnt = e.subjectLearnt;
	}

	/**
	 * This is a constructor with parameters
	 * @param name is the name of the game
	 * @param numPlayers is the number of players in the game
	 * @param gameTime is the time spend in the game
	 * @param gamePrice is the price of the game
	 * @param gameStudio is the studio
	 * @param gamingPlatform is the gaming platform
	 * @param subjectLearnt is the subject of the game
	 */
	public EducationalGame(String name, int numPlayers, int gameTime, int gamePrice, String gameStudio,
			GamingPlatform gamingPlatform, String subjectLearnt) {
		super(name, numPlayers, gameTime, gamePrice, gameStudio, gamingPlatform);
		this.subjectLearnt = subjectLearnt;
	}

	/**
	 * getter to get the subject
	 * @return
	 */
	public String getSubjectLearnt() {
		return subjectLearnt;
	}

	/**
	 * setter to set the object
	 * @param subjectLearnt
	 */
	public void setSubjectLearnt(String subjectLearnt) {
		this.subjectLearnt = subjectLearnt;
	}

	// toString method
	@Override
	public String toString() {
		return "EducationalGame [subjectLearnt=" + subjectLearnt + ", gamePrice=" + gamePrice + ", gameStudio="
				+ gameStudio + ", gamingPlatform=" + gamingPlatform + ", name=" + name + ", numPlayers=" + numPlayers
				+ ", gameTime=" + gameTime + "]";
	}

	/**
	 * an equal method that compares if two objects are the same
	 * @param educationalGame
	 * @return
	 */
	public boolean equals(EducationalGame educationalGame) {
		if (educationalGame == null || !(educationalGame instanceof EducationalGame)) {
			return false;
		} else if (this.name == educationalGame.name && this.numPlayers == educationalGame.numPlayers
				&& this.gameTime == educationalGame.gameTime && this.gamePrice == educationalGame.gamePrice
				&& this.gameStudio == educationalGame.gameStudio
				&& this.gamingPlatform == educationalGame.gamingPlatform
				&& this.subjectLearnt == educationalGame.subjectLearnt) {
			return true;
		} else {
			return false;
		}

	}

}
