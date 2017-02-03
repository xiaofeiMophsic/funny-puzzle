package com.mophsic.stack;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * @author xiaofei
 * @date 2017/2/3
 */
public class StackWithMinTest {

    private StackWithMin<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new StackWithMin<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(-1);
        stack.push(5);
        stack.pop();
        stack.pop();
    }

    @Test
    public void min() throws Exception {
        int el = stack.min();
        assertEquals(1, el);
    }

}