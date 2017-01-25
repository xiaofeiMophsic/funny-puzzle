package com.mophsic.linkedlist;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaofei
 * @date 2017/1/25
 */
class ListUtil {

    private ListUtil() {
        throw new UnsupportedOperationException("can't init!");
    }

    /**
     * 使用给定的数据构造链表。
     * @param data 数据集合
     * @param <T> 数据类型
     * @return 链表头
     */
    @SuppressWarnings("unchecked")
    static <T> LinkedNode<T> initList(Object[] data){
        if (data == null || data.length == 0)
            return null;
        LinkedNode<T> head = new LinkedNode();
        head.value = (T) data[0];

        LinkedNode<T> current = head;
        for(int i = 1; i < data.length; i++) {
            LinkedNode<T> node = new LinkedNode();
            node.value = (T) data[i];
            current.nextNode = node;
            current = node;
        }
        return head;
    }

    /**
     * 返回给定链表的数据集
     * @param head 链表头结点
     * @param <T> 数据类型
     * @return 数据集
     */
    @Nullable static <T> List<T> linkedData(LinkedNode<T> head){
        if (head == null) {
            return null;
        }
        List<T> values = new ArrayList<>();
        values.add(head.value);
        LinkedNode<T> nextNode = head.nextNode;
        while (nextNode != null){
            values.add(nextNode.value);
            nextNode = nextNode.nextNode;
        }

        return values;
    }
}
