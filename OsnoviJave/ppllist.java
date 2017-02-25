package MultipleClassesLearning;

public enum ppllist {

	nikola("dock", "matf", "2. godina", 1996),
	pavle("glen", "znrfak", "3. godina", 1996),
	predrag("djuzepe", "elfak", "1. godina", 1995),
	djordje("space", "medfak", "2. godina", 1996),
	aleksa("fiza", "metro", "1. godina", 1996),
	djole("proto", "elfak", "2. godina", 1996),
	dimi("bonca", "elfak", "2. godina", 1996),
	milos("cvele", "fizfak", "4. godina", 1992);

	private String nadimakCoveka;
	private String fakultetCoveka;
	private String godinaFakulteta;
	private int godisteCoveka;

	ppllist(String nadimak, String faks, String god, int godiste) {
		nadimakCoveka = nadimak;
		fakultetCoveka = faks;
		godinaFakulteta = god;
		godisteCoveka = godiste;
	}

	public String getInfo() {
		return String.format("\t%s\t%s\t%s\t%d", nadimakCoveka, fakultetCoveka, godinaFakulteta, godisteCoveka);
	}

}
