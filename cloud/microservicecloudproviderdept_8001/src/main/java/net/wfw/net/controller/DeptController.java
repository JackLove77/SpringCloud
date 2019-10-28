package net.wfw.net.controller;

import net.wfw.net.enti.Dept;
import net.wfw.net.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptController
 * @date 2019/10/17 10:30
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

}
