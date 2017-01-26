package com.mophsic.tree;

/**
 * 求一颗二叉树的镜像树
 * @author xiaofei
 * @date 2017/1/26
 */
public class MirrorTree {

    static void mirrorTreeRecursively(BinaryTreeNode root){
        if (root == null) {
            return;
        }

        if (root.mLeftNode == null && root.mRightNode == null) { // leaf
            return;
        }

        BinaryTreeNode tempNode = root.mLeftNode;
        root.mLeftNode = root.mRightNode;
        root.mRightNode = tempNode;

        if (root.mLeftNode != null){
            mirrorTreeRecursively(root.mLeftNode);
        }

        if (root.mRightNode != null) {
            mirrorTreeRecursively(root.mRightNode);
        }
    }
}
