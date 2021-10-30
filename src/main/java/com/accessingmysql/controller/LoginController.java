package com.accessingmysql.controller;

import com.accessingmysql.model.User;
import com.accessingmysql.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(path="/validate")
    public @ResponseBody
    boolean verifyUser (@RequestParam String username,@RequestParam String password) {
        User user = new User();
        user.setUserName(username);
        user.setSecret(password);

        return loginService.validate(user);
    }
}
