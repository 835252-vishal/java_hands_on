package session3;

import java.util.Scanner;

public class RedCrossLast {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tent = s.nextInt();
        int red[] = new int[tent];
        int sum = 0;
        for (int i = 0; i < tent; i++) {
            red[i] = s.nextInt();
        }
        for (int i : red) {
            sum = sum + i;
        }
        System.out.println(sum);
        s.close();
    }
}
