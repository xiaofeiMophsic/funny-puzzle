package com.mophsic.tree;

import com.mophsic.loop.Binary;

import java.util.Stack;

/**
 * @author xiaofei
 * @date 2016/12/18
 */
class TraversalTree {

    private TraversalTree(){
        throw new AssertionError();
    }

    static <T> void postTraversalWithRecursive(BinaryTreeNode<T> root){
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

    /**
     * 使用 {@link java.util.Stack} 实现二叉树中序遍历
     * @param <T> 结点类型
     */
    static <T> void inorderTraversalWithStack(BinaryTreeNode<T> root){
        if (root == null) {
            throw new IllegalArgumentException("root can not be null");
        }
        // 对递归实现的模拟
        Stack<BinaryTreeNode<T>> nodes = new Stack<>();
        while (root != null || !nodes.isEmpty()) {
            while (root != null) {
                nodes.push(root);
                root = root.mLeftNode;
            }
            root = nodes.pop();
            System.out.println(root.mValue);
            root = root.mRightNode;
        }
    }
}
