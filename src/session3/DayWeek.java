package session3;

import java.util.Scanner;

public class DayWeek {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String days[] = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
        System.out.println("Enter the day number");
        int day = s.nextInt();
        System.out.println("Day of the week is " + days[day - 1]);
        s.close();
    }

}
