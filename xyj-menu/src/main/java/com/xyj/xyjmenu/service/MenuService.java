package com.xyj.xyjmenu.service;

import com.xyj.xyjcommon.entity.Menu;
import com.xyj.xyjcommon.entity.MenuDTO;
import com.xyj.xyjcommon.entity.MenuVO;
import com.xyj.xyjcommon.entity.Result;

import java.util.List;

public interface MenuService {
    //查询所有菜品
    Result findAll();

    //根据ID查询菜品信息
    Result findById(Long id);

    //根据菜品名称查询菜品
    Result findByName(String name);

    //根据分类查询菜品信息
    Result findByType(String typeName);

    //添加菜品
    Result save(MenuDTO menuDTO);

    //修改菜品信息
    Result update(MenuDTO menuDTO);

    //删除菜品信息
    Result deleteById(Long id);
}
