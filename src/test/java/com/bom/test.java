package com.bom;

import com.bom.dao.UserDao;
import com.bom.dao.impl.UserServiceImpl;
import com.bom.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext ("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean ("userDao");
        userDao1.save ();
    }
    @Test
    public void test2(){
       ApplicationContext app = new ClassPathXmlApplicationContext ("applicationContext.xml");
        UserService userService = (UserService)app.getBean ("userService");
        ((UserServiceImpl) userService).save ();
    }
}