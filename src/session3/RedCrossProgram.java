package session3;

import java.util.Scanner;

public class RedCrossProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tent = s.nextInt();
        int red[] = new int[tent];
        int i = 0, sum = 0;
        while (i < tent) {
            red[i] = s.nextInt();
            sum = sum + red[i];
            i++;
        }
        System.out.println(sum);
        s.close();
    }
}
