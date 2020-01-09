package session4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of GenCs ");
        int gen = s.nextInt();
        Trainee t[] = new Trainee[gen];
        for (int i = 0; i < gen; i++) {
            t[i] = new Trainee();
            System.out.println("Enter Employee Id");
            int employeeId = s.nextInt();
            s.nextLine();
            t[i].setEmployeeId(employeeId);
            System.out.println("Enter Name");
            String name = s.nextLine();
            t[i].setName(name);
        }
        Trainee disp = new Trainee();
        disp.display(t);
        s.close();

    }

}
