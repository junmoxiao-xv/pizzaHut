package com.xyj.xyjconsumer.controller;

import com.xyj.xyjcommon.entity.MenuDTO;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjconsumer.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/")
    public Result findAll(){
        return menuFeign.findAll();
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable("id") Long id){
        return menuFeign.findById(id);
    }

    @GetMapping("/findByName")
    public Result findByName(@RequestParam(value = "name",required = true) String name){
        return menuFeign.findByName(name);
    }

    @GetMapping("/findByType")
    public Result findByType(@RequestParam(value = "typeName",required = true) String typeName){
        return menuFeign.findByType(typeName);
    }

    @PostMapping("/")
    public Result save(MenuDTO menuDTO){
        System.out.println(menuDTO.toString());
        return menuFeign.save(menuDTO);
    }

    @PutMapping("/")
    public Result update(MenuDTO menuDTO){
        System.out.println(menuDTO.toString());
        return menuFeign.update(menuDTO);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable("id") Long id){
        return menuFeign.deleteById(id);
    }
}
