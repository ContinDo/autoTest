package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Test(enabled = false) 可以设置这个方法不测试
 */

public class IgnoreTest {


    @Test
    public void ignore1(){
        System.out.println("ignore1 执行！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}
