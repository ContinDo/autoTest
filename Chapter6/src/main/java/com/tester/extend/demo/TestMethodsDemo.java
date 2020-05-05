package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author
 */
public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1, 2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们的日志");
        throw new RuntimeException("这是我们的运行时异常");
    }
}
