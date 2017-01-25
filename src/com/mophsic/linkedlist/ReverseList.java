package com.mophsic.linkedlist;

/**
 * 使用递归和循环两种方式实现链表反转
 * @author xiaofei
 * @date 2017/1/14
 */
public class ReverseList {

    <T> LinkedNode reverseList(LinkedNode<T> head){

        LinkedNode<T> pre = null;
        LinkedNode<T> cur = null;
        LinkedNode<T> tempNode = null;
        while(head != null) {
            cur = head;

            tempNode = cur.nextNode;
            cur.nextNode = pre;

            pre = head;
            head = tempNode;
        }
        return cur;
    }

    <T> LinkedNode reverseListRecursively(LinkedNode<T> head, LinkedNode<T> pre){
        if (head == null) {
            return null;
        }
        LinkedNode<T> lastNode = head;
        LinkedNode<T> tempNode = head.nextNode;
        head.nextNode = pre;
        if (tempNode != null)
            lastNode = reverseListRecursively(tempNode, head);
        return lastNode;
    }
}
