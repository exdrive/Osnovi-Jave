package MultipleClassesLearning;

public enum enumTraining {
	nikola("dock", "20"), pavle("glen", "21"), predrag("djuzepe", "22"), djordje("space", "20");

	private final String nick;
	private final String age;

	enumTraining(String nickName, String currAge) {
		nick = nickName;
		age = currAge;
	}

	public String getNick() {
		return nick;
	}

	public String getAge() {
		return age;
	}
}
