package com.liulang.testng.paramater;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
/**
 * Created by Administrator on 2018-06-06.
 */
public class DataProviderDemo {

    @Test(dataProvider = "dataProvider")
    public void test(String name, int age) {
        System.out.println(name + "年龄为：" + age);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] provideData() {
        return  new Object[][]{
                {"李雷",18},
                {"韩梅梅",17}
        };
    }
}
