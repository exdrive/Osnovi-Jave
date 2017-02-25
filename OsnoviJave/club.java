package MultipleClassesLearning;

public class club {
	private String name;
	private String surname;
	private static int members = 0;
	
	public club(String firstName, String lastName) {
		name = firstName;
		surname = lastName;
		
		members++;
		
		System.out.printf("Constructor for %s %s, members in the club: %d\n", name, surname, members);
	}
}
