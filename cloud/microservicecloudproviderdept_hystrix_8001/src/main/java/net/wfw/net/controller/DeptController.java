package net.wfw.net.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    private DeptService deptService = null;

    @RequestMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = this.deptService.get(id);
        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }

        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {


        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand").setDb_source("no this database in MySQL");
    }

    @RequestMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

}
