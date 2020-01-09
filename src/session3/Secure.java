package session3;

import java.util.Scanner;

public class Secure {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();
        System.out.println("Enter the start");
        String str1 = s.nextLine();
        if (str.startsWith(str1)) {
            System.out.println("\"" + str + "\"" + " start with \"" + str1 + "\"");

        } else {
            System.out.println("\"" + str + "\"" + " does not start with  \"" + str1 + "\"");
        }
        s.close();
    }

}
