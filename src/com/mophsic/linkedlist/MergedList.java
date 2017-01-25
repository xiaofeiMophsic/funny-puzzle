package com.mophsic.linkedlist;

/**
 * @author xiaofei
 * @date 2017/1/25
 */
public class MergedList {

    static LinkedNode<Integer> mergeList(LinkedNode<Integer> pHead1, LinkedNode<Integer> pHead2){
        if (pHead1 == null) {
            return pHead2;
        } else if (pHead2 == null){
            return pHead1;
        }

        LinkedNode<Integer> mergedHead;
        if (pHead1.value < pHead2.value) {
            mergedHead = pHead1;
            mergedHead.nextNode = mergeList(pHead2, pHead1.nextNode);
        } else {
            mergedHead = pHead2;
            mergedHead.nextNode = mergeList(pHead1, pHead2.nextNode);
        }

        return mergedHead;
    }
}
