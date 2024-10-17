package com.workouts.corejava;

import java.time.LocalDate;

public class Team {
	LocalDate estalisheDate;
	String cityName;
	String captainName;
	String teamName;

	public Team(LocalDate estalisheDate, String teamName, String cityName) {
		this.estalisheDate = estalisheDate;
		this.cityName = cityName;
		this.teamName = teamName;
	}
}
