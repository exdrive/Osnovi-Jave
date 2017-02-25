package MultipleClassesLearning;

public class bday {
	private String name;
	private date birthday;

	public bday(String theName, date theBD) {
		name = theName;
		birthday = theBD;
	}

	public String toString() {
		return String.format("%s's birthday is %s", name, birthday);
	}
}
