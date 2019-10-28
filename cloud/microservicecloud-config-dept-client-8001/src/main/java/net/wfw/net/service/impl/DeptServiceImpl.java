package net.wfw.net.service.impl;

import net.wfw.net.enti.Dept;
import net.wfw.net.mapper.DeptMapper;
import net.wfw.net.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptServiceImpl
 * @date 2019/10/28 15:49
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }

}
