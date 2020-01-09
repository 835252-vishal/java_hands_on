package session5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Rectangle ");
        System.out.println("2. Square ");
        System.out.println("3. Circle ");
        System.out.println("Area Calculator --- Choose your shape ");
        int n = s.nextInt();
        switch (n) {
        case 1:
            System.out.println("Enter length and breadth: ");
            int length = s.nextInt();
            int breadth = s.nextInt();
            Rectangle rect = new Rectangle(length, breadth, "Rectangle");
            System.out.printf("Area of Rectangle is:%.2f", rect.calculateArea());
            break;
        case 2:
            System.out.println("Enter side: ");
            int side = s.nextInt();
            Square sq = new Square(side, "Square");
            System.out.printf("Area of Square is:%.2f", sq.calculateArea());
            break;
        case 3:
            System.out.println("Enter Radius: ");
            int radius = s.nextInt();
            Circle rad = new Circle(radius, "Circle");
            System.out.printf("Area of Square is:%.2f", rad.calculateArea());
            break;
        default:
            System.out.println("Choose an appropriate number !");
        }
        s.close();
    }

}
