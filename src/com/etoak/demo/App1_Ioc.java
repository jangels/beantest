package com.etoak.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App1_Ioc {

    @Test
    public  void testIOc() throws Exception {
        //得到IOC容器对象
        System.out.println("容器创建1");
        // 文件系统
//        ApplicationContext ac = new FileSystemXmlApplicationContext("src/com/etoak/demo/applicationContext.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/etoak/demo/applicationContext.xml");
        System.out.println("容器创建");
        User user = (User) ac.getBean("user");
        Assert.assertNotNull(user);
    }

    @Test
    public  void testIOc1() throws Exception {
        //得到IOC容器对象
        System.out.println("容器创建1");
        // 文件系统
//        ApplicationContext ac = new FileSystemXmlApplicationContext("src/com/etoak/demo/applicationContext.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/etoak/demo/applicationContext.xml");
        System.out.println("容器创建");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public  void testIOc2() throws Exception {
        //得到IOC容器对象
        System.out.println("容器创建1");
        // 文件系统
//        ApplicationContext ac = new FileSystemXmlApplicationContext("src/com/etoak/demo/applicationContext.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/etoak/demo/applicationContext.xml");
        System.out.println("容器创建");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }


}
