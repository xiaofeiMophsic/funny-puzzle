package com.mophsic.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaofei
 * @date 2017/1/14
 */
public class ReverseListTest {
    @SuppressWarnings("unchecked")
    @Test
    public void reverseList() throws Exception {
        ReverseList linked = new ReverseList();
        Integer[] data = {1, 2, 2, 3, 4, 5, 76, 7};
        LinkedNode<Integer> head = linked.initList(data);
        LinkedNode<Integer> reversedList = linked.reverseListRecursively(head, null);
        while (reversedList != null) {
            System.out.printf(" %d", reversedList.value);
            reversedList = reversedList.nextNode;
        }
    }

}