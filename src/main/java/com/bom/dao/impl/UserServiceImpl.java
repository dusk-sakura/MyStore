package com.bom.dao.impl;

import com.bom.dao.UserDao;
import com.bom.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }
    public UserServiceImpl() {

    }
//    //将userDao set注入UserService
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save() {
        userDao.save ();
    }
}
