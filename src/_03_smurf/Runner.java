package _03_smurf;

public class Runner {

	public Runner() {

	}

	public static void main(String[] args) {

		Smurf HandySmurf = new Smurf("Handy");
		Smurf PapaSmurf = new Smurf("Papa");
		Smurf Smurfette = new Smurf("Smurfette");

		HandySmurf.eat();
		HandySmurf.getName();

		System.out.println(HandySmurf.getName());

		PapaSmurf.getName();
		PapaSmurf.getHatColor();
		PapaSmurf.isGirlOrBoy();

		System.out.println(PapaSmurf.getName());
		System.out.println(PapaSmurf.getHatColor());
		System.out.println(PapaSmurf.isGirlOrBoy());

		Smurfette.getName();
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();

		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());

	}

}