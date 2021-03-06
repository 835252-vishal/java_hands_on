package session7;

public class CricketPlayer extends Player implements IPlayerStatistics {
    public CricketPlayer(String name, String teamName, int noOfMatches) {
        super(name, teamName, noOfMatches);
    }

    private int totalRunsScored;
    private int noOfWicketsTaken;

    public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored,
            int noOfWicketsTaken) {
        super(name, teamName, noOfMatches);
        this.totalRunsScored = totalRunsScored;
        this.noOfWicketsTaken = noOfWicketsTaken;
    }

    @Override
    public void displayPlayerStatistics() {
        System.out.println("Player Details ");
        System.out.println("Player name : " + name);
        System.out.println("Team name : " + teamName);
        System.out.println("No of matches :  " + noOfMatches);
        System.out.println("Total runsscored :" + totalRunsScored);
        System.out.println("No of wickets taken :" + noOfWicketsTaken);

    }

}
