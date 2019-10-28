package net.wfw.net.service;

import net.wfw.net.enti.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptClientService
 * @date 2019/10/22 14:15
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService
{
    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list")
    public List<Dept> list();

    @RequestMapping(value = "/dept/add")
    public boolean add(Dept dept);
}
