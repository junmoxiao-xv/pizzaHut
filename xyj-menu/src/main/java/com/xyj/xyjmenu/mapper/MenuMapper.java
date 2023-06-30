package com.xyj.xyjmenu.mapper;

import com.xyj.xyjcommon.entity.Menu;
import com.xyj.xyjcommon.entity.MenuDTO;
import com.xyj.xyjcommon.entity.MenuVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    //查询所有菜品
    List<MenuVO> findAll();

    //根据ID查询菜品信息
    MenuVO findById(Long id);

    //根据菜品名称查询菜品
    List<MenuVO> findByName(String name);

    //根据分类查询菜品信息
    List<MenuVO> findByType(String typeName);

    //新增菜品
    int save(MenuDTO menuDTO);

    //修改菜品信息
    int update(MenuDTO menuDTO);

    //删除菜品
    int deleteById(Long id);

}
