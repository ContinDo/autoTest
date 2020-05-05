package com.course.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author
 */
public class BasicAnnotation {


    @Test
    public void testCase1(){
        System.out.println("test1");
    }

    @Test
    public void testCase2(){
        System.out.println("test2");
    }

    @BeforeMethod
    public void before(){
        System.out.println("在每个test注解方法之前都有");
    }

    @AfterMethod
    public void after(){
        System.out.println("在每个test注解方法之后都有");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("在类前面显示: ");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("在类后面显示: ");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件，把类包含在里面，可多含多个类");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件，把类包含在里面");
    }
}
