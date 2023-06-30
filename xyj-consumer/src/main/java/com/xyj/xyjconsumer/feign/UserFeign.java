package com.xyj.xyjconsumer.feign;

import com.xyj.xyjcommon.entity.MenuDTO;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjcommon.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "xyj-user")
public interface UserFeign {

    //查询所有用户信息
    @GetMapping("/users/")
    Result findAllUser();

    //根据ID查询用户
    @GetMapping("/users/{id}")
    Result findUserById(@PathVariable("id") Long id);

    //添加用户
    @PostMapping("/users/")
    Result saveUser(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("sex") String sex,@RequestParam("email") String email,@RequestParam("address") String address);

    //修改用户信息
    @PutMapping("/users/")
    Result updateUser(@RequestParam("id") Long id,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("sex") String sex,@RequestParam("email") String email,@RequestParam("address") String address);

    //删除用户
    @DeleteMapping("/users/{id}")
    Result deleteUserById(@PathVariable("id") Long id);

    @PostMapping("/users/login")
    Result login(@RequestParam("email") String email,@RequestParam("password") String password);

    @PostMapping("/admin/adlogin")
    Result adlogin(@RequestParam("email") String email,@RequestParam("password") String password);
}
