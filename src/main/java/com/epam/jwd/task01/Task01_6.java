package com.epam.jwd.task01;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Task01_6 {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = 3;
        System.out.println(max(a, max(b, c)) + min(a, min(b, c)));
    }
}
