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
        LinkedNode<Integer> head = ListUtil.initList(data);
//        LinkedNode<Integer> reversedList = linked.reverseListRecursively(head, null);
        LinkedNode<Integer> reversedList = linked.reverse2(head);
        while (reversedList != null) {
            System.out.printf(" %d", reversedList.value);
            reversedList = reversedList.nextNode;
        }
    }

    @Test
    public void checkCycle() throws Exception {
        Integer[] data = {1, 2, 2, 3, 4, 5, 76, 7};
        // 初始化有环链表
        LinkedNode<Integer> headWithCycle = ListUtil.initCycleList(data);

        boolean hasCycle = ReverseList.checkCycle(headWithCycle, headWithCycle.nextNode);
        System.out.println("检测到链表1中的环：" + hasCycle);

        LinkedNode<Integer> noCycle = ListUtil.initList(data);
        boolean hasCycle2 = ReverseList.checkCycle(noCycle, noCycle.nextNode);
        System.out.println("检测到链表2的环：" + hasCycle2);
    }
}