package com.mophsic.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collections;
import java.util.List;

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

        TraversalTree.postTraversalWithRecursive(RebuildBinaryTree.construct(new int[]{1}, new int[]{1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructException(){
        RebuildBinaryTree.construct(null, null);
    }
}
