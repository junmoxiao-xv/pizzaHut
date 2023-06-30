package com.xyj.xyjuser.mapper;

import com.xyj.xyjcommon.entity.User;
import com.xyj.xyjcommon.entity.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //查询所有用户
    List<User> findAllUser();

    //根据ID查询用户
    User findUserById(Long id);

    //添加用户
    int saveUser(User user);

    //修改用户信息
    int updateUser(User user);

    //删除用户
    int deleteUserById(Long id);

    //用户登录
    UserDTO login(String email,String password);
}
