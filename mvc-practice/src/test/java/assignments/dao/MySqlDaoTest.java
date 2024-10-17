package assignments.dao;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignments.entity.User;

public class MySqlDaoTest {

	private WhatsappDao dao;

	@Before
	public void setUp() throws Exception {
		dao = new MySqlDao();
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	@Test
	public void testAddUser() {
		var user = new User();
		user.setName("Pavan");
		user.setPassword("pavan");

		assert dao.addUser(user) : "Failed in adding new user";
	}

	@Test
	public void testHasUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

}
