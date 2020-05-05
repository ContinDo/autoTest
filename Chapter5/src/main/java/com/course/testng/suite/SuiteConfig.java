package com.course.testng.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite 运行了");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suite 运行了");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("before the test");
    }

    @AfterTest
    public void aftertest() {
        System.out.println("after the test");
    }
}