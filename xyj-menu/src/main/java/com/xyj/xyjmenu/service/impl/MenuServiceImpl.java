package com.xyj.xyjmenu.service.impl;

import com.xyj.xyjcommon.entity.Menu;
import com.xyj.xyjcommon.entity.MenuDTO;
import com.xyj.xyjcommon.entity.MenuVO;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjmenu.mapper.MenuMapper;
import com.xyj.xyjmenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Result findAll() {
        List<MenuVO> menus = menuMapper.findAll();
        if (menus.size() == 0){
            return Result.notFound("菜单中没有菜品");
        }
        return Result.ok(menus);
    }

    @Override
    public Result findById(Long id) {
        MenuVO menuVO = menuMapper.findById(id);
        if (Objects.isNull(menuVO)){
            return Result.notFound("该菜品不存在");
        }
        return Result.ok(menuVO);
    }

    @Override
    public Result findByName(String name) {
        List<MenuVO> menus = menuMapper.findByName(name);
        if (menus.size() == 0){
            return Result.notFound("该菜品不存在");
        }
        return Result.ok(menus);
    }

    @Override
    public Result findByType(String typeName) {
        List<MenuVO> menus = menuMapper.findByType(typeName);
        if (menus.size() == 0){
            return Result.notFound("该分类菜品不存在");
        }
        return Result.ok(menus);
    }

    @Override
    public Result save(MenuDTO menuDTO) {
        int count = menuMapper.save(menuDTO);
        if (count != 1){
            return Result.Fail("新增菜品失败");
        }
        System.out.println(count);
        return Result.ok("新增菜品成功");
    }

    @Override
    public Result update(MenuDTO menuDTO) {
        System.out.println("impl"+menuDTO);
        int count = menuMapper.update(menuDTO);
        if (count != 1){
            return Result.Fail("修改菜品失败");
        }
        System.out.println(count);
        return Result.ok("修改菜品成功");
    }

    @Override
    public Result deleteById(Long id) {
        int count = menuMapper.deleteById(id);
        System.out.println(count);
        if (count != 1){
            return Result.Fail("删除菜品失败");
        }
        return Result.ok("删除菜品成功");
    }
}
