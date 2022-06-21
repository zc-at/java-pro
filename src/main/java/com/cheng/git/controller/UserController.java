package com.cheng.git.controller;

import com.cheng.git.service.UserService;

/**
 * @author Cxiao
 * @date 2022/6/21 16:21
 */
public class UserController {
    private UserService userService = new UserService();

    public void login() {
        // 增加一条注释
        userService.login();
    }
}
