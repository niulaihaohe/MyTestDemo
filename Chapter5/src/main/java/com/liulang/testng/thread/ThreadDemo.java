package com.liulang.testng.thread;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-06-06.
 */
public class ThreadDemo {
    /**
     * 一个方法使用多个线程执行
     */
//    @Test(threadPoolSize = 3, invocationCount = 12, timeOut = 3000)
//    public void test() {
//        System.out.println("当前线程的id为" + Thread.currentThread().getId());
//    }

    @Test
    public void test2() {
        System.out.println("当前线程为：" + Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.println("当前线程为：" + Thread.currentThread().getId());
    }

    @Test
    public void test4() {
        System.out.println("随便一测");
    }
}
