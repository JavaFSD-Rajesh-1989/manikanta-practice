package assignments.dao;

import java.util.ArrayList;
import java.util.List;

import assignments.entity.User;
import assignments.exceptions.UserNotFoundException;

public class InMemoryDao implements WhatsappDao {
	private final List<User> users = new ArrayList<>();

	@Override
	public boolean addUser(User u) {
		for (User user : users) {
			if (user.getName().equals(u.getName())) {
				return false;
			}
		}
		users.add(u);
		return true;
	}

	@Override
	public boolean hasUser(String name, String password) {
		for (User u : users) {
			if (u.getName().equals(name) && u.getPassword().equals(password)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public User searchProfile(String name) throws UserNotFoundException {
		for (User u : users) {
			if (u.getName().equals(name)) {
				return u;
			}
		}

		throw new UserNotFoundException(name);
	}

	@Override
	public User getUser(String name) throws UserNotFoundException {
		for (User u : users) {
			if (u.getName().equals(name)) {
				return u;
			}
		}

		throw new UserNotFoundException(name);
	}

	@Override
	public boolean updateUser(User user) {
		for (User u : users) {
			if (u.getName().equals(user.getName())) {
				u.setPassword(user.getPassword());
				u.setAddress(user.getAddress());
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

}
