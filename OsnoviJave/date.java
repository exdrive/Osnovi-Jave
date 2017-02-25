package MultipleClassesLearning;

public class date {
	private int month;
	private int day;
	private int year;
	
	public date(int d, int m, int y) {
		month = m;
		day = d;
		year = y;

		System.out.printf("This is a constructor for %s\n", this);
	}

	public String toString() { // kad this iskoristimo u %s gore ispise
								// ovo.......
		return String.format("%d/%d/%d", day, month, year);
	}
}
