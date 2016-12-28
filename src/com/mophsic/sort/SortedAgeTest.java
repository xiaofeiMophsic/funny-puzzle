package com.mophsic.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaofei
 * @date 2016/12/28
 */
public class SortedAgeTest {
    @Test
    public void sortAge() throws Exception {
        int[] ages = {20, 30, 32, 22, 21, 34, 22, 50, 60, 55, 53, 42, 23, 21, 23, 44};
        int[] exp = {20, 21, 21, 22, 22, 23, 23, 30, 32, 34, 42, 44, 50, 53, 55, 60};
        SortedAge sortedAge = new SortedAge();
        sortedAge.sortAge(ages);
        assertArrayEquals(exp, ages);
    }

}