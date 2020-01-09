package session9;

import java.util.ArrayList;

public class PlayerBO {
    void displayAllPlayerDetails(ArrayList<Player> list) {
        System.out.println("Player Details ");
        for (Player player : list) {
            System.out.println(player);
        }
    }

}
