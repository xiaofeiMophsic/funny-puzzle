package com.mophsic.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * 求整数二进制中1的个数。（整数与其自身减一作与运算之后可以将最后一个1转换为0）
 * @author xiaofei
 * @date 2017/1/4
 */
public class Binary {

    public int count(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;

        do {
            count ++;
        } while (0 != (n = (n & n - 1)));

        return count;
    }
    @Test
    public void test(){
        // 功能测试
        int c = count(15);
        Assert.assertEquals(4, c);

        // 边界条件
        int c1 = count(0);
        Assert.assertEquals(0, c1);

        // 负面测试
        int c2 = count(Integer.MAX_VALUE);
        Assert.assertEquals(31, c2);
    }
}
