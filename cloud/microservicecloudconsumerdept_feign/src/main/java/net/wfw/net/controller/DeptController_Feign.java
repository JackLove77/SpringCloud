package net.wfw.net.controller;

import net.wfw.net.enti.Dept;
import net.wfw.net.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptController_Consumer
 * @date 2019/10/17 10:44
 */
@RestController
public class DeptController_Feign {


    @Autowired
    private DeptClientService service = null;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list()
    {
        return this.service.list();
    }

    @RequestMapping("/consumer/dept/add")
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }

}
