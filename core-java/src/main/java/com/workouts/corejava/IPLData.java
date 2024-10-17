package com.workouts.corejava;

import java.lang.invoke.VarHandle;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IPLData {

	public static List<Team> allTeams() {
		List<Team> teams = new ArrayList<Team>();
		LocalDate est = LocalDate.of(2008, 1, 24);
		Team cskTeam = new Team(est, "Chennai Super Kings", "Chennai"));
		Team cskTeam = new Team(est, "Delhi Capitals","New Delhi"));
		Team cskTeam = new Team(est, "Chennai","Chennai Super Kings Cricket Ltd."));
		Team cskTeam = new Team(est, "Chennai","Chennai Super Kings Cricket Ltd."));
		Team cskTeam = new Team(est, "Chennai","Chennai Super Kings Cricket Ltd."));
		Team cskTeam = new Team(est, "Chennai","Chennai Super Kings Cricket Ltd."));
		Team cskTeam = new Team(est, "Chennai","Chennai Super Kings Cricket Ltd."));
		Team cskTeam = new Team(est, "Chennai","Chennai Super Kings Cricket Ltd."));
		Team cskTeam = new Team(est, "Chennai","Chennai Super Kings Cricket Ltd."));
		return teams;
	}

}
