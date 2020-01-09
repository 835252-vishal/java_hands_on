package session10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Box> set = new HashSet<Box>();
        System.out.println("Enter the number of Box ");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            s.nextLine();
            System.out.println("Enter the Box " + (i + 1) + " details ");
            System.out.println("Enter Length ");
            double length = s.nextDouble();
            System.out.println("Enter Width");
            double width = s.nextDouble();
            System.out.println("Enter Height");
            double height = s.nextDouble();
            Box box = new Box(length, width, height);
            box.setVolume(length, width, height);
            set.add(box);
        }
        System.out.println("Unique Boxes in the Set are ");
        for (Box box : set) {
            System.out.print(box.toString());
        }
        s.close();
    }

}
