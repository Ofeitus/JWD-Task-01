package com.epam.jwd.task01;

public class Task01_9 {
    public static void main(String[] args) {
        int[] A = new int[]{45, 34, 61, 18, 5, 9};
        int[] B = new int[]{1, 2, 3, 4};
        int k = 1;

        int[] C = new int[A.length + B.length];
        for (int i = 0; i <= k; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[i + k + 1] = B[i];
        }
        for (int i = k + 1; i < A.length; i++) {
            C[i + B.length] = A[i];
        }

        for (int i : C) {
            System.out.print(i + " ");
        }
    }
}
