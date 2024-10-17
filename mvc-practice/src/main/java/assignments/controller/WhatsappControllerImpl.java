package assignments.controller;

import java.util.List;
import java.util.Scanner;

import assignments.entity.User;
import assignments.exceptions.UserNotFoundException;
import assignments.service.WhatsappService;
import assignments.service.WhatsappServiceImpl;
import assignments.util.UserSorting;

public class WhatsappControllerImpl implements WhatsappController {
	private Scanner sc = new Scanner(System.in);
	private final WhatsappService service;
	private String currentUsername;

	public WhatsappControllerImpl() {
		this.service = new WhatsappServiceImpl();
	}

	@Override
	public void createProfile() {
		User u = new User();
		System.out.print("Enter username: ");
		u.setName(sc.nextLine());
		System.out.print("Enter password: ");
		u.setPassword(sc.nextLine());
		System.out.print("Enter address: ");
		u.setAddress(sc.nextLine());
		System.out.print("Enter email: ");
		u.setEmail(sc.nextLine());

		if (service.createProfile(u)) {
			System.out.println("Welcome to family");
		} else {
			System.out.println("There was a problem");
		}
	}

	@Override
	public void edit() {
		runAfterLogin(() -> {
			try {
				var user = service.getUser(currentUsername);
				System.out.printf("User details username: %s,\nemail %s,\naddress: %s\n", user.getName(),
						user.getEmail(), user.getAddress());
				System.out.println("Press 1 to update password");
				System.out.println("Press 2 to update address");
				var option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.print("Enter new password: ");
					var nPassword = sc.next();
					user.setPassword(nPassword);
					System.out.println(service.updateUser(user) ? "Updated successfully" : "Failed");
					break;
				case 2:
					System.out.println("Enter new address: ");
					sc.nextLine();
					var address = sc.nextLine();
					user.setAddress(address);
					System.out.println(service.updateUser(user) ? "Updated successfully" : "Failed");
					break;
				default:
					System.out.println("Unexpected option: " + option);
				}
			} catch (Exception e) {
				System.out.println("User not found");
				currentUsername = null;
			}
		});
	}

	private void runAfterLogin(Runnable runnable) {
		if (currentUsername != null) {
			runnable.run();
		} else {
			System.out.println("Unauthorized access");
		}
	}

	@Override
	public void view() {
		runAfterLogin(() -> {
			try {
				var user = service.getUser(currentUsername);
				System.out.printf("User details username: %s,\nemail %s,\naddress: %s\n", user.getName(),
						user.getEmail(), user.getAddress());
			} catch (Exception e) {
				System.out.println("User not found");
				currentUsername = null;
			}
		});
	}

	@Override
	public void search() {
		System.out.print("Enter profile name: ");
		var find = sc.next();
		try {
			var user = service.searchProfile(find);
			if (user != null) {
				System.out.println("Username " + user.getName());
				System.out.println("Email " + user.getEmail());
				System.out.println("Address " + user.getAddress());
			} else {
				System.out.println("Not found");
			}
		} catch (UserNotFoundException e) {
			System.out.println("Not found");
		}

	}

	@Override
	public void login() {
		System.out.print("Enter username: ");
		var username = sc.next();
		System.out.print("Enter password: ");
		var password = sc.next();
		if (service.hasUser(username, password)) {
			System.out.println("Login successfully");
			currentUsername = username;
		} else {
			System.out.println("Login failed");
		}
	}

	@Override
	public void logout() {
		currentUsername = null;
		System.out.println("Logout successfully");
	}

	@Override
	public void viewAllProfiles() {
		List<User> users = service.getAllUsers();
		Runnable runnable = () -> {
			System.out.println("Username | Email Address | Address");
			users.forEach(user -> {
				System.out.printf("%s | %s | %s\n", user.getName(), user.getEmail(), user.getAddress());
			});
		};

		System.out.println("Actual records");
		runnable.run();
		System.out.println("Actual records sorted by name");
		users.sort(UserSorting::byName);
		runnable.run();
		System.out.println("Actual records sorted by email");
		users.sort(UserSorting::byEmail);
		runnable.run();
		System.out.println("Actual records sorted by address");
		users.sort((a, b) -> a.getAddress().compareTo(b.getAddress()));
		runnable.run();

	}
}
