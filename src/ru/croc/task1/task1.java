package ru.croc.task1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        double ax;
        double ay;
        double bx;
        double by;
        double cx;
        double cy;
        System.out.println("Введите X для A:");
        Scanner scannerAX = new Scanner(System.in);
        ax = scannerAX.nextDouble();
        System.out.println(ax);

        System.out.println("Введите Y для A:");
        Scanner scannerAY = new Scanner(System.in);
        ay = scannerAY.nextDouble();
        System.out.println(ay);

        System.out.println("Введите X для B:");
        Scanner scannerBX = new Scanner(System.in);
        bx = scannerBX.nextDouble();
        System.out.println(bx);

        System.out.println("Введите Y для B:");
        Scanner scannerBY = new Scanner(System.in);
        by = scannerBY.nextDouble();
        System.out.println(by);

        System.out.println("Введите X для C:");
        Scanner scannerCX = new Scanner(System.in);
        cx = scannerCX.nextDouble();
        System.out.println(cx);

        System.out.println("Введите Y для C:");
        Scanner scannerCY = new Scanner(System.in);
        cy = scannerCY.nextDouble();
        System.out.println(cy);

        double a = Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
        double b = Math.sqrt((cx - ax) * (cx - ax) + (cy - ay) * (cy - ay));
        double c = Math.sqrt((bx - cx) * (bx - cx) + (by - cy) * (by - cy));
        double p = (a + b + c)/2.0;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if (a == 0 | b == 0 | c == 0) {
            System.out.println("Неправильно заданы координаты!");
        } else {
            System.out.println("Площадь треугольника = " + String.format("%.4f", s));
        }
    }
}
