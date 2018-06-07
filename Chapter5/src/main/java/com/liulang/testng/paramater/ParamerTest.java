package com.liulang.testng.paramater;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-06-06.
 */
public class ParamerTest {

    @Test
    @Parameters({"name", "age"})
    public void test(String name, int age) {
        System.out.println(name + "今年" + age + "岁了");
    }
}
