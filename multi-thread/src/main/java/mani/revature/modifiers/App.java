package mani.revature.modifiers;

/**
 * Hello world!
 *
 */
public class App {

	private static String[] aStrings = { "Hello", "bro", "how", "are", "you" };

	public static void main(String[] args) {
		Thread aThread = new Thread(App::greetings, "a");
		Thread bThread = new Thread(App::greetings, "b");

	}

	static void greetings() {
		System.out.println("Good morning bro!!");
	}
}
