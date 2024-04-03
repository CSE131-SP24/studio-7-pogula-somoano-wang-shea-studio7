package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private int dir; //0(right) 1 (left) 2(both)
	private int points;
	private int goals;
	private int assists;
	
	public HockeyPlayer(String Nname, int Nnumber, int Ndir, int Ngoals, int Nassists) {
		name = Nname;
		number = Nnumber;
		dir = Ndir;
		goals = Ngoals;
		assists = Nassists;
		
		points = goals + assists;
		
	}
	
}


