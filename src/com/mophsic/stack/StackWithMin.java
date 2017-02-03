package com.mophsic.stack;

import java.util.Stack;

/**
 * 包含min函数的栈
 * @author xiaofei
 * @date 2017/2/3
 */
public class StackWithMin<E extends Comparable> {

    private Stack<E> mData;
    private Stack<E> mMin;

    StackWithMin(){
        mData = new Stack<>();
        mMin = new Stack<>();
    }

    void push(E element) {
        mData.push(element);

        if (mMin.size() <= 0 || element.compareTo(mMin.peek()) < 0){
            mMin.push(element);
        } else {
            mMin.push(mMin.peek());
        }
    }

    E pop(){
        if (mMin.size() > 0 && mData.size() > 0) {
            mMin.pop();
            return mData.pop();
        } else
            throw new IllegalStateException("No more element in this stack!");
    }

    E min(){
        if (mMin.size() > 0)
            return mMin.pop();
        else
            throw new IllegalStateException("No more element in this stack!");
    }
}
