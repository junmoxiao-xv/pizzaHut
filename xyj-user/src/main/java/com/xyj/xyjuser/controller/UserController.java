package com.xyj.xyjuser.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjcommon.entity.User;
import com.xyj.xyjcommon.entity.UserDTO;
import com.xyj.xyjcommon.utils.JWTUtils;
import com.xyj.xyjuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public Result findAllUser(){
        return userService.findAllUser();
    }

    @GetMapping("/{id}")
    public Result findUserById(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }

    @PostMapping("/")
    public Result saveUser(User user){
        System.out.println("=======controller29======="+user.toString());
        return userService.saveUser(user);
    }

    @PutMapping("/")
    public Result updateUser(User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public Result deleteUserById(@PathVariable("id") Long id){
        return userService.deleteUserById(id);
    }

    @PostMapping("/login")
    public Result login(String email, String password){
        return userService.login(email, password);
    }
}
