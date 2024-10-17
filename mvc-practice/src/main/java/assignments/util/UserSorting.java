package assignments.util;

import assignments.entity.User;

public class UserSorting {

	public static int byName(User a, User b) {
		return a.getName().compareTo(b.getName());
	}

	public static int byEmail(User a, User b) {
		return a.getEmail().compareTo(b.getEmail());
	}

}
