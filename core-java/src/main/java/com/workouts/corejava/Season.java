package com.workouts.corejava;

public class Season {
	int year;
	Team winner;
	Team runnerUp;
	String playerOfSeason;

	public Season(int year, Team winner, Team runnerUp, String playerOfSeason) {
		super();
		this.year = year;
		this.winner = winner;
		this.runnerUp = runnerUp;
		this.playerOfSeason = playerOfSeason;
	}
}
