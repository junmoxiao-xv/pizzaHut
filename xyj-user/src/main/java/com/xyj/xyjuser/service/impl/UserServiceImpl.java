package com.xyj.xyjuser.service.impl;

import com.sun.applet2.AppletParameters;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjcommon.entity.User;
import com.xyj.xyjcommon.entity.UserDTO;
import com.xyj.xyjcommon.utils.JWTUtils;
import com.xyj.xyjuser.mapper.UserMapper;
import com.xyj.xyjuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result findAllUser() {
        List<User> users = userMapper.findAllUser();
        if (users.size() == 0){
            return Result.notFound("还没有用户信息");
        }

        return Result.ok(users);
    }

    @Override
    public Result findUserById(Long id) {
        User user = userMapper.findUserById(id);
        if (Objects.isNull(user)){
            return Result.notFound("该用户信息不存在");
        }
        return Result.ok(user);
    }

    @Override
    public Result saveUser(User user) {
        int count = userMapper.saveUser(user);
        if (count != 1){
            return Result.Fail("添加用户失败");
        }
        return Result.ok("添加用户成功");
    }

    @Override
    public Result updateUser(User user) {
        int count = userMapper.updateUser(user);
        if (count != 1){
            return Result.Fail("修改用户信息失败");
        }
        return Result.ok("修改用户信息成功");
    }

    @Override
    public Result deleteUserById(Long id) {
        int count = userMapper.deleteUserById(id);
        if (count != 1){
            return Result.Fail("删除用户失败");
        }
        return Result.ok("删除用户成功");
    }

    @Override
    public Result login(String email, String password) {
        UserDTO userDTO = userMapper.login(email, password);
        if (Objects.nonNull(userDTO)){
            HashMap<String,String> map = new HashMap<>();

            map.put("username",userDTO.getUsername());
            map.put("id",userDTO.getId().toString());
            String token = JWTUtils.createToken(map);
            userDTO.setToken(token);
            System.out.println(token);
            return Result.ok(userDTO);
        }
        return Result.Fail("登录失败");
    }
}
