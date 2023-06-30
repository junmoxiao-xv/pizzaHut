package com.xyj.xyjconsumer.controller;

import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjconsumer.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserFeign userFeign;

    @PostMapping("/adlogin")
    public Result adlogin(String email, String password){
        return userFeign.adlogin(email, password);
    }
}
