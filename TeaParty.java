package _07_tea_party;

public class TeaParty {

	private String guest;
	private boolean isWoman;
	private boolean isKnighted;

	public TeaParty() {
	}

	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		if (isWoman == true && isKnighted == true) {
			return "Hello Lady " + name;
		} else if (isWoman == true && isKnighted == false) {
			return "Hello Ms. " + name;
		} else if (isWoman == false && isKnighted == true) {
			return "Hello Sir " + name;
		} else if (isWoman == false && isKnighted == false) {
			return "Hello Mr. " + name;
		}

		return name;

	}

}