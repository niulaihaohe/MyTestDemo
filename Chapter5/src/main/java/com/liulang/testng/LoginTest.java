package com.liulang.testng;

import org.testng.annotations.*;

/**
 * Created by Administrator on 2018-06-06.
 */
public class LoginTest {
    @BeforeTest
    public void beforeTest() {
        System.out.println("登录Test执行之前。。。");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("登录方法执行前");
    }
    @Test
    public void test(){
        System.out.println("登录成功");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("登录方法执行后。。。。");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("登录类执行前。。。");
    }

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("testSuite执行之前");
    }

}
