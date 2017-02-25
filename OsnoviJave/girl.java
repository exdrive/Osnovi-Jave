package MultipleClassesLearning;

public class girl {
	
	private String girlName;
	
	public girl(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your 1st gf was %s.", getName());
	}
}
