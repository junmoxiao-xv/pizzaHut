package com.xyj.xyjmenu.mapper;

import com.xyj.xyjcommon.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {
    //查询所有菜品分类
    List<Type> findAll();
}
