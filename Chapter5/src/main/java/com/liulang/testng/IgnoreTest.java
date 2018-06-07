package com.liulang.testng;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-06-06.
 */
public class IgnoreTest {
    @Test
    public void test(){
        System.out.println("测试。。。");
    }
    @Test(enabled = false)
    public void ignoreCase(){
        System.out.println("我想被忽略");
    }
}
