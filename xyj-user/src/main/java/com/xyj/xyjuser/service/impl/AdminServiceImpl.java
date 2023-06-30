package com.xyj.xyjuser.service.impl;

import com.xyj.xyjcommon.entity.AdminDTO;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjcommon.utils.JWTUtils;
import com.xyj.xyjuser.mapper.AdminMapper;
import com.xyj.xyjuser.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Result adlogin(String email, String password) {
        AdminDTO admin = adminMapper.adlogin(email, password);
        if (Objects.nonNull(admin)){
            HashMap<String,String> map = new HashMap<>();

            map.put("username",admin.getUsername());
            map.put("id",admin.getId().toString());
            String token = JWTUtils.createToken(map);
            admin.setToken(token);
            System.out.println(token);
            return Result.ok(admin);
        }
        return Result.Fail("登录失败");
    }
}
