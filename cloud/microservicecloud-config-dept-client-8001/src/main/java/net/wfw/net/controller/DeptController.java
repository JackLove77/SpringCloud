package net.wfw.net.controller;


import net.wfw.net.enti.Dept;
import net.wfw.net.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptController
 * @date 2019/10/28 15:43
 */

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @RequestMapping("/list")
    public List<Dept> list(){
        return deptService.list();
    }

    @RequestMapping("/discovery")
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("==========="+list);

        List<ServiceInstance> serviceList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance service:serviceList){
            System.out.println(service.getServiceId()+"\t"+service.getHost()+"\t"+service.getPort()+"\t"+service.getUri());
        }
        return this.client;
    }
}
