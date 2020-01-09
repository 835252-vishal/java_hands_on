package session10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String playerName = null;
        long runs = 0L;
        HashMap<String, Long> hash = new HashMap<String, Long>();
        System.out.println("Enter the number of players ");
        int number = s.nextInt();
        for (int i = 1; i <= number; i++) {
            s.nextLine();
            System.out.println("Enter the details of the player " + i);
            playerName = s.nextLine();
            runs = s.nextLong();
            hash.put(playerName, runs);
        }
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<Long> value = new ArrayList<Long>();
        LinkedHashMap<String, Long> link = new LinkedHashMap<String, Long>(hash);
        link.putAll(hash);
        for (Map.Entry<String, Long> me : link.entrySet()) {
            key.add(me.getKey());
            value.add(me.getValue());
        }
        long max = Collections.max(value);
        int index = -1;
        for (int i = 0; i < key.size(); i++) {
            if (max == value.get(i)) {
                index = i;
                break;
            }
        }
        System.out.println(key.get(index));
        s.close();
    }
}
