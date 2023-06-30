package com.xyj.xyjuser.service;

import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjcommon.entity.User;
import org.springframework.http.HttpHeaders;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {
    //查询所有用户
    Result findAllUser();

    //根据ID查询用户
    Result findUserById(Long id);

    //添加用户
    Result saveUser(User user);

    //修改用户信息
    Result updateUser(User user);

    //删除用户
    Result deleteUserById(Long id);

    //用户登录
    Result login(String email, String password);
}
