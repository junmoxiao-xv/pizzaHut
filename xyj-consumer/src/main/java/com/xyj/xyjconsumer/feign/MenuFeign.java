package com.xyj.xyjconsumer.feign;

import com.xyj.xyjcommon.entity.MenuDTO;
import com.xyj.xyjcommon.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "xyj-menu")
public interface MenuFeign {
    //查询所有菜品信息
    @GetMapping("/menus/")
    Result findAll();

    //根据ID查询菜品信息
    @GetMapping("/menus/{id}")
    Result findById(@PathVariable("id") Long id);

    //根据菜品名称查询菜品
    @GetMapping("/menus/findByName")
    Result findByName(@RequestParam(value = "name",required = true) String name);

    //根据分类查询菜品信息
    @GetMapping("/menus/findByType")
    Result findByType(@RequestParam(value = "typeName",required = true) String typeName);

    //添加菜品
    @PostMapping("/menus/")
    Result save(@RequestBody MenuDTO menuDTO);

    //修改菜品信息
    @PutMapping("/menus/")
    Result update(@RequestBody MenuDTO menuDTO);

    //删除菜品信息
    @DeleteMapping("/menus/{id}")
    Result deleteById(@PathVariable("id") Long id);
}
