package com.mophsic.stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaofei
 * @date 2017/2/3
 */
public class StackOrderTest {
    @Test
    public void isPopOrder() throws Exception {
        StackOrder stackOrder = new StackOrder();
        int[] pushOrder = {1, 2, 3, 4, 5};
        int[] popOrder = {1, 2, 3, 4, 5};
        assertTrue(stackOrder.isPopOrder(pushOrder, popOrder));
    }

}