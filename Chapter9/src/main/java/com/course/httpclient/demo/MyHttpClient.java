package com.course.httpclient.demo;

import java.io.IOException;
import java.util.Map.Entry;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

/**
 * @author
 */
public class MyHttpClient {
    @Test
    public void test1() throws IOException{
        //用来保存我们的结果
        String result = null;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //HttpClient用来执行get方法
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        //页面返回结果转为字符串类型
        result = EntityUtils.toString(response.getEntity(), "UTF-8");
        System.out.print(result);
    }
}
