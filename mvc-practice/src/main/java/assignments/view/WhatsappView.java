package assignments.view;

import java.io.IOException;]
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.TTCCLayout;

import assignments.controller.WhatsappController;
import assignments.controller.WhatsappControllerImpl;

interface a<T> extends Consumer<T> {
	default void ab() {
		System.out.println("ab");
		new Thread(() -> {
			System.out.println("I am running");
		});
	}

	private void baz() {
		System.out.println(" world!");
		Time
	}
}

interface b {
	default void ab() {
		System.out.println("ba");
	}
}

public class WhatsappView implements a, b {
	public static void main(String[] args) throws SQLException, SecurityException, IOException {
		BasicConfigurator.configure(new FileAppender(new TTCCLayout("dd/MM/yyyy hh:mm:sss"), "./logs"));
		System.out.println("\n:::Here are list of available options:::");
		System.out.println("1. Create the profile");
		System.out.println("2. Edit profile");
		System.out.println("3. View profile");
		System.out.println("4. Search profile");
		System.out.println("5. Login");
		System.out.println("6. Logout");
		System.out.println("7. View all profiles");
		System.out.println("0. exist");

		Scanner sc = new Scanner(System.in);

		Logger log = Logger.getLogger("view");

		WhatsappController controller = new WhatsappControllerImpl();
		log.info("Entering into the view");
		inputloop: do {
			log.info("Asking for you options");
			System.out.print("> Enter your option: ");
			int option = sc.nextInt();
			log.info("User entered option " + option);

			switch (option) {
			case 1:
				controller.createProfile();
				break;
			case 2:
				controller.edit();
				break;
			case 3:
				controller.view();
				break;
			case 4:
				controller.search();
				break;
			case 5:
				controller.login();
				break;
			case 6:
				controller.logout();
				break;
			case 7:
				controller.viewAllProfiles();
				break;
			case 0:
				sc.close();
				break inputloop;
			default:
				log.info("Invalid option");
				System.out.println("You entered invalid option");
			}
		} while (true);

		log.info("Application stopped");
	}

	@Override
	public void ab() {
		// TODO Auto-generated method stub
		a.super.ab();
		b.super.ab();
	}
}
