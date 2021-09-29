package com.epam.jwd.task01;

public class Task01_10 {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 6;
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (i % 2 == 0) ? j + 1 : N - j;
            }
        }

        printMatrix(matrix);
    }
}
