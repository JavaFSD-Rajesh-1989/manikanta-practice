package assignments.dao;

import java.util.List;

import assignments.entity.User;
import assignments.exceptions.UserNotFoundException;

public interface WhatsappDao {
	boolean addUser(User u);

	boolean hasUser(String username, String password);

	User searchProfile(String name) throws UserNotFoundException;

	List<User> getAllUsers();

	User getUser(String name) throws UserNotFoundException;

	boolean updateUser(User user);
}
