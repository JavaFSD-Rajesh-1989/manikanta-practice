package assignments.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import assignments.dao.MySqlDao;
import assignments.dao.WhatsappDao;
import assignments.entity.User;
import assignments.exceptions.UserNotFoundException;

public class WhatsappServiceImpl implements WhatsappService {
	private WhatsappDao dao;
	private Logger logger = Logger.getLogger("database");

	public WhatsappServiceImpl() {
		try {
			this.dao = new MySqlDao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Check your internet connection");
			logger.error("in connectiong to database", e);
		}
	}

	@Override
	public boolean createProfile(User u) {
		return dao.addUser(u);
	}

	@Override
	public boolean hasUser(String username, String password) {
		return dao.hasUser(username, password);
	}

	@Override
	public User searchProfile(String find) throws UserNotFoundException {
		return dao.searchProfile(find);
	}

	@Override
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public User getUser(String name) throws UserNotFoundException {
		return dao.getUser(name);
	}

	@Override
	public boolean updateUser(User user) {
		return dao.updateUser(user);

	}
}
