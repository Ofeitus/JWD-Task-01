package com.epam.jwd.task01;

public class Task01_8 {
    public static void main(String[] args) {
        int[] A = new int[]{45, 34, 61, 18, 5, 9};
        int K = 3;
        int sum = 0;
        for (int x : A) {
            if (x % K == 0) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
