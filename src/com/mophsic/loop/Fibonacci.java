package com.mophsic.loop;

/**
 * @author xiaofei
 * @date 2017/1/2
 */
public class Fibonacci {

    /**
     * 使用循环的方式求解斐波那契数列。
     * @param n
     * @return
     */
    public int fib(int n){
        if (n < 0) {
            return -1;
        }
        int[] result = {0, 1};

        if (n < 2) {
            return result[n];
        }

        int first = 0;
        int second = 1;

        int fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = first + second;
            first = second;
            second = fibN;
        }

        return fibN;
    }
}
