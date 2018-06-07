package com.liulang.testng;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-06-06.
 */
public class ExpectedException {
    /**
     * 只有抛出相应的异常才能够运行通过。
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException() {
        System.out.println("运行异常测试。。。");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException2() {
        System.out.println("异常测试");
        throw new RuntimeException("测试异常");
    }
}
