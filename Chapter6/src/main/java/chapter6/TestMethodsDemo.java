package chapter6;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-06-07.
 */
public class TestMethodsDemo {

    @Test
    public void test() {
        Assert.assertEquals("555","444");
    }

    @Test
    public void test2() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3() {
        Assert.assertEquals(1,5);
    }

    @Test
    public void logDemo() {
        Reporter.log("这是我自己的日志");
        throw new RuntimeException("自己的运行时异常");
    }
    @Test
    public void test6() {
        ExtentTestNGIReporterListener listener = new ExtentTestNGIReporterListener();
    }


}
