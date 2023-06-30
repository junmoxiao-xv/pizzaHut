package com.xyj.xyjmenu.service.impl;

import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjcommon.entity.Type;
import com.xyj.xyjmenu.mapper.TypeMapper;
import com.xyj.xyjmenu.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public Result findAll() {
        List<Type> types = typeMapper.findAll();
        if (types.size() == 0){
            return Result.notFound("没有菜品分类");
        }
        return Result.ok(types);
    }
}
