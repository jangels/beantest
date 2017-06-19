package com.etoak.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App1_Ioc {

    @Test
    public  void testIOc() throws Exception {
        //�õ�IOC��������
        System.out.println("��������1");
        // �ļ�ϵͳ
//        ApplicationContext ac = new FileSystemXmlApplicationContext("src/com/etoak/demo/applicationContext.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/etoak/demo/applicationContext.xml");
        System.out.println("��������");
        User user = (User) ac.getBean("user");
        Assert.assertNotNull(user);
    }

    @Test
    public  void testIOc1() throws Exception {
        //�õ�IOC��������
        System.out.println("��������1");
        // �ļ�ϵͳ
//        ApplicationContext ac = new FileSystemXmlApplicationContext("src/com/etoak/demo/applicationContext.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/etoak/demo/applicationContext.xml");
        System.out.println("��������");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public  void testIOc2() throws Exception {
        //�õ�IOC��������
        System.out.println("��������1");
        // �ļ�ϵͳ
//        ApplicationContext ac = new FileSystemXmlApplicationContext("src/com/etoak/demo/applicationContext.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/etoak/demo/applicationContext.xml");
        System.out.println("��������");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }


}
