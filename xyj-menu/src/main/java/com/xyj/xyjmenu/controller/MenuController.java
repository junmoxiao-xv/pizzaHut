package com.xyj.xyjmenu.controller;

import com.xyj.xyjcommon.entity.MenuDTO;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjmenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public Result findAll(){
        return menuService.findAll();
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable("id") Long id){
        return menuService.findById(id);
    }

    @GetMapping("/findByName")
    public Result finByName(@RequestParam(value = "name",required = true) String name){
        return menuService.findByName(name);
    }

    @GetMapping("/findByType")
    public Result findByType(@RequestParam(value = "typeName",required = true) String typeName){
        return menuService.findByType(typeName);
    }

    @PostMapping("/")
    public Result save(@RequestBody MenuDTO menuDTO){
        return menuService.save(menuDTO);
    }

    @PutMapping("/")
    public Result update(@RequestBody MenuDTO menuDTO){
        System.out.println("controller"+menuDTO);
        return menuService.update(menuDTO);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable("id") Long id){
        return menuService.deleteById(id);
    }

}
