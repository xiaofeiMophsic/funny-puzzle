package com.mophsic.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaofei
 * @date 2017/1/27
 */
public class PrintMatrixTest {

    int[][] matrix ;
    int[][] matrix1 ;
    @Before
    public void setUp() throws Exception {
        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        matrix1= new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
    }

    @Test
    public void printMatrixClockwisely() throws Exception {
        PrintMatrix.printMatrixClockwisely(matrix, matrix.length, matrix[0].length);
        PrintMatrix.printMatrixClockwisely(matrix1, matrix1.length, matrix1[0].length);
    }

}