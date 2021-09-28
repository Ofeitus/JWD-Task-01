package com.epam.jwd.task01;

public class Task01_2 {
    public static void main(String[] args) {
        double a = 0.23;
        double b = 11.45;
        double c = 8.201;
        System.out.println((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b));
    }
}
