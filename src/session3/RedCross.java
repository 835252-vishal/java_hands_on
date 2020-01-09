package session3;

import java.util.Scanner;

public class RedCross {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tent = s.nextInt();
        int red[] = new int[tent];
        int i, sum = 0;
        for (i = 0; i < tent; i++) {
            red[i] = s.nextInt();
            sum = sum + red[i];
        }
        System.out.println(sum);
        s.close();
    }
}
