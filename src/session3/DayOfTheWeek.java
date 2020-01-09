package session3;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String week[] = new String[7];
        week[0] = "Sun";
        week[1] = "Mon";
        week[2] = "Tue";
        week[3] = "Wed";
        week[4] = "Thur";
        week[5] = "Fri";
        week[6] = "Sat";
        System.out.println("Enter the day number");
        int day = s.nextInt();
        System.out.println("Day of the week is " + week[day - 1]);
        s.close();

    }

}
