

class Main{
	public static void main(String[] args){
		Team teamOne = new Team("BlueTeam");
		Team teamTwo = new Team("RedTeam");
		Team teamThree = new Team("GreenTeam");
		Team teamFour = new Team("YellowTeam");
		Team teamFive = new Team("PinkTeam");
		teamOne.setRank(2);
		teamTwo.setRank(1);
		teamThree.setRank(4);
		teamFour.setRank(5);
		teamFive.setRank(2);
		System.out.println(teamOne);
		System.out.println(teamTwo);
		System.out.println(teamThree);
		System.out.println(teamFour);
		System.out.println(teamFive);

		teamOne.addPlayer("Benny");
	}
}