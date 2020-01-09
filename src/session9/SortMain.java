package session9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int score = 0;
        List<Integer> sort = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            score = s.nextInt();
            sort.add(score);
        }
        Collections.sort(sort);
        for (Integer integer : sort) {

            System.out.println(integer);
        }
        s.close();
    }

}