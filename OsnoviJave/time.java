package MultipleClassesLearning;

public class time {
	private int hour;
	private int minute;
	private int second;

	public time() {
		this(0, 0, 0);
	}

	public time(int h) {
		this(h, 0, 0);
	}

	public time(int h, int m) {
		this(h, m, 0);
	}

	public time(int h, int m, int s) {
		setTime(h, m, s);
	}

	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	public void setHour(int h) {
		hour = ((h >= 0 && h <= 23) ? h : 0);
	}

	public void setMinute(int m) {
		minute = ((m >= 0 && m <= 59) ? m : 0);
	}

	public void setSecond(int s) {
		second = ((s >= 0 && s <= 59) ? s : 0);
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public String toMilitaryWithMethods() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
				((hour >= 12) ? "PM" : "AM"));
	}
}
