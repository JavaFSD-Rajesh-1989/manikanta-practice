package mani.revature.modifiers;

public class StaticExample {

	private int i = 9;

	{
		System.out.println("Hello from instance block " + i + j);
	}

	private static int j;

	static {
		System.out.println("Hello from static block " + j);
	}

	void add(int a, int b) {
		System.out.println("Instance method --> Static method");
		j = i + 1;
		add(a, b, 0); // calling static method in instance method
		System.out.println(i);
	}

	static void add(int a, int b, int c) {
		System.out.println(a + b + c);
		j = j + 1;
		System.out.println(j);
	}

	static void main(String[] args) {
		// add(20,20);
		// Cannot make a static reference to the non-static method add(int, int) from
		// the type StaticExample
		StaticExample example = new StaticExample();
		System.out.println("Static method--> instance method");
		example.add(20, 50); // 50

		System.out.println(j);
		// calling static method in static method;
		System.out.println("Static method --> Static method");
		add(30, 50, 10); // 90

	}
}
