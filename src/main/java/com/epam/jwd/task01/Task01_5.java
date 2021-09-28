package com.epam.jwd.task01;

public class Task01_5 {
    public static void sampleMethod(String sampleVar, double sampleValue) {
        double resultValue = (sampleValue >= 0 ? Math.pow(sampleValue, 2) : Math.pow(sampleValue, 4));
        System.out.println(sampleVar + (sampleValue >= 0 ? "^2" : "^4") + " = " + resultValue);
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 11.45;
        double c = -8.201;
        sampleMethod("a", a);
        sampleMethod("b", b);
        sampleMethod("c", c);
    }
}
