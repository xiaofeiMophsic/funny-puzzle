package com.mophsic.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author xiaofei
 * @date 2016/12/18
 */
@RunWith(JUnit4.class)
public class RebuildBinaryTreeTest {

    int[] preOrder;
    int[] inOrder;
    Integer[] expectPostOrder;

    @Before
    public void setup(){
        preOrder = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        inOrder = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        expectPostOrder = new Integer[]{7, 4, 2, 5, 8, 6, 3, 1};
    }

    @Test
    public void construct(){
        BinaryTreeNode<Integer> rootNode = RebuildBinaryTree.construct(preOrder, inOrder);
        TraversalTree.postTraversalWithRecursive(rootNode);
        TraversalTree.inorderTraversalWithStack(rootNode);
        TraversalTree.postTraversalWithRecursive(RebuildBinaryTree.construct(new int[]{1}, new int[]{1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructException(){
        RebuildBinaryTree.construct(null, null);
    }

    @Test
    public void subTree(){
        BinaryTreeNode<Integer> rootNode1 = RebuildBinaryTree.construct(preOrder, inOrder);
        BinaryTreeNode<Integer> rootNode2 = RebuildBinaryTree.construct(new int[]{3, 5, 6}, new int[]{5, 3, 6});

        boolean actual = SubTree.hasSubTree(rootNode1, rootNode2);
        Assert.assertTrue(actual);
    }

    @Test
    public void mirrorTree(){
        BinaryTreeNode<Integer> tree = RebuildBinaryTree.construct(preOrder, inOrder);
        MirrorTree.mirrorTreeRecursively(tree);
        TraversalTree.inorderTraversalWithStack(tree);
    }
}
