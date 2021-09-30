package com.bom.Controller;

import com.bom.dao.impl.UserServiceImpl;
import com.bom.service.UserService;

public class UserController {
    public static void main(String[] args) {
        UserService userService =new UserServiceImpl();
        ((UserServiceImpl) userService).save ();
    }
}
