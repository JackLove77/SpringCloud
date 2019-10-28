package net.wfw.net.service;

import net.wfw.net.enti.Dept;

import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptService
 * @date 2019/10/28 15:46
 */
public interface DeptService {
     boolean add(Dept dept);

     Dept get(Long id);

     List<Dept> list();
}
