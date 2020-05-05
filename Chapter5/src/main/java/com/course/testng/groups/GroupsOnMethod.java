package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author
 */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("服务器端测试1");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4444");
    }

    @BeforeGroups("server")
    public void be() {
        System.out.println("服务器组");
    }

    @AfterGroups("server")
    public void af(){
        System.out.println("服务器组结束");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法！！！！！");
    }


}
