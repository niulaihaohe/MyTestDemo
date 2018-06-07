package com.liulang.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-06-06.
 */
public class SuiteConfig {
    @BeforeTest
    public void beforeTest() {
        System.out.printf("suiteConfig中test执行前。。。");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("suiteConfig方法执行前");
    }

    @Test
    public void test() {
        System.out.println("suiteConfig执行中。。。");
    }
}
