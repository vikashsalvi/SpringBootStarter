package com.accessingmysql.controller;

import com.accessingmysql.service.SignupService;
import com.accessingmysql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/signup")
public class SignUpController {
    @Autowired
    private SignupService signupService;

    @PostMapping(path="/signup")
    public @ResponseBody
    boolean verifyUser (@RequestParam User user) {
        return signupService.signup(user);
    }
}
