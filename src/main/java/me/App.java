package me;

import Service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 * author:zhanggqd
 * date:2017/12/16
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext("springConfiguraton");
        TestService testService= (TestService) appContext.getBean("testService");
        List resultList=null;
        try {
             resultList=testService.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据查询异常!");
        }
        System.out.println("Hello World!");
    }
}
