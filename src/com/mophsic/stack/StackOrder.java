package com.mophsic.stack;

import java.util.Stack;

/**
 * 栈的压入弹出序列
 * @author xiaofei
 * @date 2017/2/3
 */
public class StackOrder {

    boolean isPopOrder(int[] pushOrder, int[] popOrder) {
        if (pushOrder == null || popOrder == null) {
            return false;
        }
        Stack<Integer> assistStack = new Stack<>();
        assistStack.push(pushOrder[0]);
        int tempOrder = 0;
        for (int aPopOrder : popOrder) {
            if (!assistStack.isEmpty() && assistStack.peek() == aPopOrder) {
                assistStack.pop();
            } else {
                int j = tempOrder;
                do {
                    j++;
                    if (j > pushOrder.length - 1) {
                        break;
                    }
                    assistStack.push(pushOrder[j]);
                }
                while (pushOrder[j] != aPopOrder && j < pushOrder.length - 1);
                if (j == pushOrder.length - 1 && assistStack.peek() != aPopOrder) {
                    return false;
                } else {
                    assistStack.pop();
                }

                tempOrder = j;
            }
        }
        return tempOrder == pushOrder.length - 1 && assistStack.isEmpty();
    }
}
