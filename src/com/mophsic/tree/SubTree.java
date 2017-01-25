package com.mophsic.tree;

/**
 * 给定两棵二叉树，判断后者是否前者的子结构。
 * @author xiaofei
 * @date 2017/1/25
 */
public class SubTree {

    static <T> boolean hasSubTree(BinaryTreeNode<T> treeNode1, BinaryTreeNode<T> treeNode2){
        boolean result = false;
        if (treeNode1 != null && treeNode2 != null) {
            if (treeNode1.mValue == treeNode2.mValue) {
                result = doesTree1HasTree2(treeNode1, treeNode2);
            }
            if (!result) {
               result = hasSubTree(treeNode1.mLeftNode, treeNode2);
            }

            if (!result) {
                result = hasSubTree(treeNode1.mRightNode, treeNode2);
            }
        }

        return result;
    }

    private static <T> boolean doesTree1HasTree2(BinaryTreeNode<T> treeNode1, BinaryTreeNode<T> treeNode2){
        if (treeNode2 == null) {
            return true;
        }

        if (treeNode1 == null) {
            return false;
        }

        if (treeNode1.mValue != treeNode2.mValue) {
            return false;
        }

        return doesTree1HasTree2(treeNode1.mLeftNode, treeNode2.mLeftNode) &&
                doesTree1HasTree2(treeNode1.mRightNode, treeNode2.mRightNode);
    }
}
