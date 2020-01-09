package session7;

abstract class Player {
    protected String name;
    protected String teamName;
    protected int noOfMatches;

    public Player() {

    }

    public Player(String name, String teamName, int noOfMatches) {
        super();
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
    }

    public void displayPlayerStatistics() {
        // TODO Auto-generated method stub

    }

}
