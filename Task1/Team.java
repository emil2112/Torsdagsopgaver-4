import java.util.ArrayList;

class Team{
	private String teamName;
	private int rank;
	private ArrayList<String> playerName = new ArrayList();
	Team(String name){
		this.teamName = name;
	}

	void setRank(int rank){
		this.rank = rank;
	}

	public String toString(){
		String s = "Team: "+ this.teamName + ": " + this.rank;
		return s;
	}

	void addPlayer(String name){
		playerName.add(name);
	}
}