package com.mophsic.sort.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaofei
 * @date 2016/12/29
 */
public class MinOnRotatedArrayTest {
    @Test
    public void min() throws Exception {
        MinOnRotatedArray min = new MinOnRotatedArray();
        int[] a = {5, 6, 7, 8, 1, 2, 3};
        int m = min.min(a);
        assertEquals(1, m);

        int[] b = {1, 1, 0, 1, 1, 1, 1};
        int m2 = min.min(b);
        assertEquals(0, m2);

        int[] c = {1};
        int m3 = min.min(c);
        assertEquals(0, m3);
    }

}