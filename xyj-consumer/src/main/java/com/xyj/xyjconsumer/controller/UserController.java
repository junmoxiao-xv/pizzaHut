package com.xyj.xyjconsumer.controller;

import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjcommon.entity.User;
import com.xyj.xyjconsumer.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping("/")
    public Result findAllUser(){
        return userFeign.findAllUser();
    }

    @GetMapping("/{id}")
    public Result findUserById(@PathVariable("id") Long id){
        return userFeign.findUserById(id);
    }

    @PostMapping("/")
    public Result saveUser(User user){
        String username = user.getUsername();
        String password = user.getPassword();
        String sex = user.getSex();
        String email = user.getEmail();
        String address = user.getAddress();
        return userFeign.saveUser(username,password,sex,email,address);
    }

    @PutMapping("/")
    public Result updateUser(User user){
        Long id = user.getId();
        String username = user.getUsername();
        String password = user.getPassword();
        String sex = user.getSex();
        String email = user.getEmail();
        String address = user.getAddress();
        return userFeign.updateUser(id,username,password,sex,email,address);
    }

    @DeleteMapping("/{id}")
    public Result deleteUserById(@PathVariable("id") Long id){
        return userFeign.deleteUserById(id);
    }

    @PostMapping("/login")
    public Result login(String email,String password){
        return userFeign.login(email, password);
    }


}
