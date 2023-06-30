package com.xyj.xyjuser.controller;

import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjuser.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")

public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/adlogin")
    public Result adlogin(String email, String password){
        return adminService.adlogin(email, password);
    }
}
