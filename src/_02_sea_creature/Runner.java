package _02_sea_creature;

import static org.junit.Assert.fail;

import java.io.ObjectInputStream.GetField;

public class Runner {

	public static void main(String[] args) {

		SeaCreature Spongebob = new SeaCreature("spongebob");
		SeaCreature Patrick = new SeaCreature("patrick");
		SeaCreature Squidward = new SeaCreature("squidward");

		Spongebob.eat();
		Spongebob.laugh();

		Patrick.getName();
		Patrick.eat();
		Patrick.laugh();

		Squidward.getName();
		Squidward.eat();
		Squidward.laugh();

		System.out.println(Spongebob.getName());
		System.out.println(Patrick.getName());
		System.out.println(Squidward.getName());

	}

}