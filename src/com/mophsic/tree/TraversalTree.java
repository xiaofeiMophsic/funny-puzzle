package com.mophsic.tree;

/**
 * @author xiaofei
 * @date 2016/12/18
 */
public class TraversalTree {

    private TraversalTree(){
        throw new AssertionError();
    }

    public static <T> void postTraversalWithRecursive(BinaryTreeNode<T> root){
        if (root == null)
            throw new IllegalArgumentException("Root can not be null");

        // 遍历左子树
        if (root.mLeftNode != null)
            postTraversalWithRecursive(root.mLeftNode);
        // 遍历右子树
        if (root.mRightNode != null)
            postTraversalWithRecursive(root.mRightNode);
        // 遍历根
        System.out.print(root.mValue);
    }
}
