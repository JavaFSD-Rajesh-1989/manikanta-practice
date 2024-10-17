package assignments.util;

import java.util.Comparator;

import assignments.entity.User;

public class SortUsersByName implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		String firstNameString = o1.getName();
		String seconString = o2.getName();
		return firstNameString.compareTo(seconString);
	}

}
