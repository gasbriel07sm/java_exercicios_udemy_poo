package ex05.applications;

import ex05.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stu = new Student();

        stu.name = sc.nextLine();
        stu.grade1 = sc.nextDouble();
        stu.grade2 = sc.nextDouble();
        stu.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + String.format("%.2f", stu.finalGrade()));

        if (stu.isPass() == 0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", stu.isPass());
        }

        sc.close();
    }
}
