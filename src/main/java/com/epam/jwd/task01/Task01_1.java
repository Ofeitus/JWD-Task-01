package com.epam.jwd.task01;

public class Task01_1 {
    public static void main(String[] args) {
        int number = 1991;
        System.out.println(number / 1000 + (number % 1000) / 100 == (number % 100) / 10 + number % 10);
    }
}
