package com.epam.jwd.task01;

public class Task01_7 {
    public static double f(double x) {
        return Math.sin(x) * Math.sin(x) - Math.cos(2 * x);
    }

    public static void main(String[] args) {
        double a = -1.3;
        double b = 13.208;
        double h = 1.205;
           System.out.println("     x         f(x)");
        for (double x = a; x < b; x += h) {
            System.out.printf(" %8.5f   %8.5f\n", x, f(x));
        }
        System.out.printf(" %8.5f   %8.5f", b, f(b));
    }
}
