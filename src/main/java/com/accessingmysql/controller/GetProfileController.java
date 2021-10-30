package com.accessingmysql.controller;

import com.accessingmysql.model.User;
import com.accessingmysql.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/profile")
public class GetProfileController {
    @Autowired
    private ProfileService profileService;

    @PostMapping(path="/validate")
    public @ResponseBody
    User verifyUser (@RequestParam String username) {
        return profileService.getProfile(username);
    }
}
