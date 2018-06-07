package com.liulang.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-06-06.
 */
public class PayTest {


    @Test
    public void test() {
        System.out.println("pay执行中。。。");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.printf("pay方法执行完毕。。。");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("payTest执行后。。。。");
    }
}
