package com.bigdata.app;

import java.util.Date;

import org.junit.Test;

/**
 * return;返回这方法
 * 
 * @author sanduo
 * @date 2018/11/05
 */
public class ReturnTest {

    @Test
    public void testReturn() {
        int a = 1;
        print(a);
        int b = 0;
        if (b == 0) {
            System.out.println(b);
        }

    }

    @Test
    public void updateTime() {
        // 2016-09-10 10:39:36
        Date date = new Date(1473396818952L + 789 * 24 * 60 * 60 * 1000L);
        System.out.println(date);

    }

    /**
     * @param a
     * 
     */
    private void print(int a) {
        if (a == 1) {
            return;
        }

    }

}
