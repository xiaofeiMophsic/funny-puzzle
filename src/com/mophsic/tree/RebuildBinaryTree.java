package com.mophsic.tree;

import java.util.Arrays;

/**
 * 输入某二叉树前序遍历和中序遍历的结果，请重建二叉树。假设输入的前序遍历和中序遍历的结果中不包含重复的数字。
 */
public class RebuildBinaryTree {

    public static BinaryTreeNode<Integer> construct(int[] preOrder, int[] inOrder) {

        if (preOrder == null || inOrder == null || !(preOrder.length > 0 && preOrder.length == inOrder.length)) {
            throw new IllegalArgumentException("输入参数不合法！");
        }
        return constructCore(preOrder, inOrder);
    }

    public static BinaryTreeNode<Integer> constructCore(
            int[] preOrder, int[] inOrder) {

        BinaryTreeNode<Integer> binaryTreeNode = new BinaryTreeNode<>();
        int nodeValue = preOrder[0]; // 先序遍历第一个值是根元素
        binaryTreeNode.mValue = nodeValue;
        // 找出指定元素在中序遍历中的索引值，位于索引值左边的元素是左子树，位于索引值右边的是右子树
        int posOfRoot = posOfValue(nodeValue, inOrder);
        if (posOfRoot != -1) {
            int leftPreOrderLength = 0;
            // 构建左子树
            if (posOfRoot > 0) {
                int[] leftInOrder = Arrays.copyOfRange(inOrder, 0, posOfRoot);
                int[] leftPreOrder = Arrays.copyOfRange(preOrder, 1, leftInOrder.length + 1);
                leftPreOrderLength = leftPreOrder.length;
                binaryTreeNode.mLeftNode = constructCore(leftPreOrder, leftInOrder);
            } else {
                binaryTreeNode.mLeftNode = null;
            }
            // 构建右子树
            if ((inOrder.length - 1) - posOfRoot > 0) {
                int[] rightInOrder = Arrays.copyOfRange(inOrder, posOfRoot + 1, inOrder.length);
                int[] rightPreOrder = Arrays.copyOfRange(preOrder, preOrder.length - (leftPreOrderLength + 1), preOrder.length);
                binaryTreeNode.mRightNode = constructCore(rightPreOrder, rightInOrder);
            } else {
                binaryTreeNode.mRightNode = null;
            }
        }

        return binaryTreeNode;
    }

    private static int posOfValue(int nodeValue, int[] order) {
        for (int i = order.length - 1; i >= 0; i--) {
            if (nodeValue == order[i]) {
                return i;
            }
        }

        return -1;
    }
}
