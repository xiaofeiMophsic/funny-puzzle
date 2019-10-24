package com.mophsic.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author xiaofei
 * @date 2017/1/25
 */
public class MergedListTest {
    private LinkedNode<Integer> pHead1;
    private LinkedNode<Integer> pHead2;

    @Before
    public void setup(){
        Integer[] data1 = {1, 3, 5, 7};
        Integer[] data2 = {2, 4, 6, 8};

        pHead1 = ListUtil.initList(data1);
        pHead2 = ListUtil.initList(data2);
    }

    @Test
    public void mergeList() throws Exception {
        LinkedNode<Integer> mergedList = MergedList.mergeList(pHead1, pHead2);
        List<Integer> actualList = ListUtil.linkedData(mergedList);
        Integer[] aValues = new Integer[actualList.size()];
        Integer[] eValues = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(eValues, actualList.toArray(aValues));
    }

    @Test
    public void mergeListWithNull(){
        LinkedNode<Integer> mergedList = MergedList.mergeList(null, null);
        assertNull(mergedList);
    }

    @Test
    public void mergeListWithSingleNode(){
        LinkedNode<Integer> mergedList = MergedList.mergeList(pHead1, null);
        List<Integer> actualList = ListUtil.linkedData(mergedList);
        Integer[] aValues = new Integer[actualList.size()];
        assertArrayEquals(new Integer[]{1, 3, 5, 7}, actualList.toArray(aValues));
    }

    @After
    public void teardown(){

    }
}