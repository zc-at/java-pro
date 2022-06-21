package com.cheng.git.controller;

import com.cheng.git.service.UserService;

/**
 * @author Cxiao
 * @date 2022/6/21 16:21
 */
public class UserController {
    private UserService userService = new UserService();

    public void login() {
        userService.login();
    }
}
