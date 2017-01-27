package com.mophsic.array;

/**
 * 顺时针从外向内打印矩阵
 * @author xiaofei
 * @date 2017/1/27
 */
public class PrintMatrix {

    static void printMatrixClockwisely(int[][] numbers, int rows, int columns) {
        if (numbers == null || rows <= 0 || columns <= 0) {
            return ;
        }
        int start = 0;
        while (rows > start * 2 && columns > start * 2) {
            printMatrixInCircle(numbers, rows, columns, start);
            ++start;
        }
    }

    private static void printMatrixInCircle(int[][] numbers, int rows, int columns, int start){
        int endX = columns - 1 - start;
        int endY = rows - 1 - start;

        // left->right
        for (int i = start ; i <= endX; i++) {
            System.out.print(numbers[start][i] + " ");
        }
        System.out.println("\n");
        // top->bottom
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                System.out.print(numbers[i][endX] + " ");
            }
        }
        System.out.println("\n");
        // right->left
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                System.out.print(numbers[endY][i] + " ");
            }
        }
        System.out.println("\n");
        // bottom->top
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; --i) {
                System.out.print(numbers[i][start] + " ");
            }
        }
    }
}
