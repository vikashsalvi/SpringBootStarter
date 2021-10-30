package com.accessingmysql.controller;

import com.accessingmysql.model.Admin;
import com.accessingmysql.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(path="/getAll")
    public @ResponseBody
    List<String> getProducts (@RequestParam String username) {
        return adminService.getAllProducts(username);
    }

    @PostMapping(path="/getAdmin")
    public @ResponseBody
    Admin getAdmin (@RequestParam String username) {
        return adminService.getAdmin(username);
    }

}
