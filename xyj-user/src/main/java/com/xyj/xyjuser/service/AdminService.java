package com.xyj.xyjuser.service;

import com.xyj.xyjcommon.entity.Result;

public interface AdminService {
    //管理员登陆
    Result adlogin(String email,String password);
}
