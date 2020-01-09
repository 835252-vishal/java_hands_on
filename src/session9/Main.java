package session9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Player> list = new ArrayList<Player>();
        System.out.println("Enter the number of players ");
        int num = s.nextInt();
        s.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the player name ");
            String name = s.nextLine();
            System.out.println("Enter the country name  ");
            String country = s.nextLine();
            System.out.println("Enter the skill");
            String skill = s.nextLine();
            Player p = new Player(name, country, skill);
            list.add(p);
        }
        PlayerBO play = new PlayerBO();
        play.displayAllPlayerDetails(list);
        s.close();
    }

}
