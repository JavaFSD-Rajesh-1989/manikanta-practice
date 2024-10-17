package assignments.service;

import java.util.List;

import assignments.entity.User;
import assignments.exceptions.UserNotFoundException;

public interface WhatsappService {
	boolean createProfile(User u);

	User getUser(String name) throws UserNotFoundException;

	boolean hasUser(String username, String password);

	User searchProfile(String find) throws UserNotFoundException;

	List<User> getAllUsers();

	boolean updateUser(User user);
}
