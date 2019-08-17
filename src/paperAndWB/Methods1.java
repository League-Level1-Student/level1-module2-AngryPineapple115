package paperAndWB;

public class Methods1 {

	// 1.)

	public static void main(String[] args) {

		// 1.)

		food("apples.");

		// 2.)

		truth(3);

		// 3.)

		drawLine();

	}

	public static void food(String fruit) {

		System.out.println("I like " + fruit);
	}

	// 2.)

	public static void truth(int x) {

		if (x > 5) {

			System.out.println("Geeks rule");
		}

		else {

			System.out.println("Nerds rule");

		}

	}

	// 3.)

	Robot Tortoise = new Robot();

	public static void drawLine() {

		Tortoise.move(100);

		Tortoise.turn(90);

	}

	// 4.)

	class Hell {

		Hell(int hotness) {

		}

	}

	public class Bacon {

		String style = "streaky";

		Bacon(String style) {
			this.style = style;
		}

	}

	public class Unicorn {

		private int horns;

		private Unicorn() {
			this.horns = 1;
		}

	}
	
	class Narwhale() {
		
		public Narwhale() {}
		
	}
	

}