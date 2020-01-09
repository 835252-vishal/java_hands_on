package session7;

import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Cricket Player Details  ");
        System.out.println("2.Hockey Player Details  ");
        System.out.println("Enter choice");
        int choice = s.nextInt();
        if (choice == 1) {
            System.out.println("Enter player name ");
            String name = s.nextLine();
            s.nextLine();
            System.out.println("Enter team name ");
            String teamName = s.nextLine();
            System.out.println("Enter number of matches played ");
            int noOfMatches = s.nextInt();
            System.out.println("Enter total runs scored ");
            int totalRunsScored = s.nextInt();
            System.out.println("Enter total number of wickets taken ");
            int noOfWicketsTaken = s.nextInt();
            CricketPlayer cp = new CricketPlayer(name, teamName, noOfMatches, totalRunsScored,
                    noOfWicketsTaken);
            cp.displayPlayerStatistics();

        }
        if (choice == 2) {
            System.out.println("Enter player name ");
            String name = s.nextLine();
            s.nextLine();
            System.out.println("Enter team name ");
            String teamName = s.nextLine();
            System.out.println("Enter number of matches played ");
            int noOfMatches = s.nextInt();
            s.nextLine();
            System.out.println("Position : ");
            String position = s.nextLine();
            System.out.println("No of goals taken : ");
            int noOfGoals = s.nextInt();
            HockeyPlayer hp = new HockeyPlayer(name, teamName, noOfMatches, position, noOfGoals);
            hp.displayPlayerStatistics();
        }
        s.close();
    }

}
