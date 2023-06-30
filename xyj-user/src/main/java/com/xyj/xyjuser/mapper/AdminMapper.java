package com.xyj.xyjuser.mapper;

import com.xyj.xyjcommon.entity.AdminDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    //管理员登录
    AdminDTO adlogin(String email, String password);
}
