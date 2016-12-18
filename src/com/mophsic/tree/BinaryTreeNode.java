package com.mophsic.tree;

/**
 * @author xiaofei
 * @date 2016/12/17
 */
public class BinaryTreeNode<T> {

    T mValue;
    BinaryTreeNode<T> mLeftNode;
    BinaryTreeNode<T> mRightNode;

    @Override
    public String toString() {
        return String.valueOf(mValue);
    }
}
