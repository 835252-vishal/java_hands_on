package session9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int limit = 0;
        int temp = 0;
        float average = 0.0f;
        List<Integer> calculate = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            limit = s.nextInt();
            calculate.add(limit);
        }
        for (Integer integer : calculate) {
            temp = temp + integer;
        }
        average = (float) temp / n;
        System.out.println(temp);
        System.out.printf("%.2f", average);
        s.close();

    }
}
