package com.mophsic.loop;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaofei
 * @date 2017/1/2
 */
public class FibonacciTest {
    @Test
    public void fib() throws Exception {
        Fibonacci f =  new Fibonacci();
        for (int i = 0; i < 10; i++){
            System.out.print(f.fib(i));
            System.out.print(", ");
        }
    }

}