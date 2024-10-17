package mani.revature.modifiers;

import java.util.LinkedList;

public class Instagram {

	static LinkedList<String> linkedList = new LinkedList<String>();

	public static void main(String[] args) {
		int option = 3;
		switch (option) {
		case 1:
			linkedList.add("Mani");
			break;
		case 2:
			int index = linkedList.indexOf("Mani");
			linkedList.set(index, "Raju");
			break;
		case 3:
			System.err.println(linkedList.get(2));
			break;
		case 4:
			linkedList.remove(2);

		default:
			break;
		}
	}

}
