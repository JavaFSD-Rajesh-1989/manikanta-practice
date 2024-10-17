package assignments.exceptions;

public class UserNotFoundException extends Exception {

	public UserNotFoundException(String query) {
		super("User not found for the " + query);
	}

}
