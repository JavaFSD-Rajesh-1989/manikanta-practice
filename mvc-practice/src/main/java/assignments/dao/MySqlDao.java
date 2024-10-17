package assignments.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import assignments.entity.User;
import assignments.exceptions.UserNotFoundException;

public class MySqlDao implements WhatsappDao {

	private static final String url = "jdbc:mysql://localhost:3306/mvcprac";
	private static final String user = "root";
	private static final String password = "Mani88";

	private final Connection connection;

	public MySqlDao() throws SQLException {
		connection = DriverManager.getConnection(url, user, password);
	}

	@Override
	public boolean addUser(User u) {

		try {

			var stmt = connection.prepareStatement("insert into users values (?,?,?,?)");
			stmt.setString(1, u.getName());
			stmt.setString(2, u.getPassword());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getAddress());
			int rows = stmt.executeUpdate();

			return rows > 0;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean hasUser(String username, String password) {
		try {
			var stmt = connection.prepareStatement("select * from users where username = ? and password = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			var resultSet = stmt.executeQuery();
			return resultSet.next();
		} catch (Exception e) {
			System.out.println("There was a problem: " + e.getMessage());
		}

		return false;
	}

	@Override
	public User searchProfile(String name) throws UserNotFoundException {
		try {
			var stmt = connection.prepareStatement("select * from users where username = ?");
			stmt.setString(1, name);
			var rows = stmt.executeQuery();

			while (rows.next()) {
				User user = new User();
				user.setName(rows.getString(1));
				user.setPassword(rows.getString(2));
				user.setEmail(rows.getString(3));
				user.setAddress(rows.getString(4));

				return user;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		throw new UserNotFoundException(name);
	}

	@Override
	public List<User> getAllUsers() {
		ArrayList<User> users = new ArrayList<User>();
		try {
			var stmt = connection.prepareStatement("select * from users");
			var resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				User user = new User();
				user.setName(resultSet.getString(1));
				user.setEmail(resultSet.getString(3));
				user.setAddress(resultSet.getString(4));
				users.add(user);
			}
		} catch (Exception e) {
			System.out.println("There was a problem: " + e.getMessage());
		}

		return users;
	}

	@Override
	public User getUser(String name) throws UserNotFoundException {
		try {
			var stmt = connection.prepareStatement("select * from users where username = ?");
			stmt.setString(1, name);
			var rows = stmt.executeQuery();

			while (rows.next()) {
				User user = new User();
				user.setName(rows.getString(1));
				user.setPassword(rows.getString(2));
				user.setEmail(rows.getString(3));
				user.setAddress(rows.getString(4));

				return user;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		throw new UserNotFoundException(name);
	}

	@Override
	public boolean updateUser(User user) {
		try {
			var stmt = connection.prepareCall("update users set password = ?, address = ? where username = ?");
			stmt.setString(1, user.getPassword());
			stmt.setString(2, user.getAddress());
			stmt.setString(3, user.getName());

			return stmt.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
