package com.gxg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserManager iUserManager = (IUserManager) applicationContext.getBean("usermanage");
        iUserManager.addUserInfo("dsaf","212");
        iUserManager.delUserInfo(2);
    }
}
