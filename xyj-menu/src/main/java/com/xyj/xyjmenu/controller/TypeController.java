package com.xyj.xyjmenu.controller;

import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjmenu.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/")
    public Result findAll(){
        return typeService.findAll();
    }
}
