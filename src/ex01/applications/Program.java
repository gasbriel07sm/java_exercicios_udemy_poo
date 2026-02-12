package ex01.applications;

import ex01.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        System.out.print("Enter the measures of triangle X: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();

        Triangle y = new Triangle();
        System.out.print("Enter the measures of triangle y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        System.out.println("Triangle X area: " + String.format("%.2f",x.area()));
        System.out.println("Triangle Y area: " + String.format("%.2f", y.area()));

        if (x.area() > y.area()) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
