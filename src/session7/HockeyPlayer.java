package session7;

public class HockeyPlayer extends Player implements IPlayerStatistics {
    private String position;
    private int noOfGoals;

    public HockeyPlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public HockeyPlayer(String name, String teamName, int noOfMatches) {
        super(name, teamName, noOfMatches);
        // TODO Auto-generated constructor stub
    }

    public HockeyPlayer(String name, String teamName, int noOfMatches, String position,
            int noOfGoals) {
        super(name, teamName, noOfMatches);
        this.position = position;
        this.noOfGoals = noOfGoals;
    }

    public void displayPlayerStatistics() {
        System.out.println("Player Details ");
        System.out.println("Player name : " + name);
        System.out.println("Team name : " + teamName);
        System.out.println("No of matches :  " + noOfMatches);
        System.out.println("Position : " + position);
        System.out.println("No of goals taken : " + noOfGoals);
    }

}
