package net.wfw.net.service.impl;

import net.wfw.net.dao.DeptDao;
import net.wfw.net.enti.Dept;
import net.wfw.net.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptServiceImpl
 * @date 2019/10/17 10:28
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

//    Dept dept=new Dept();
//
//    public void test(){
//        dept.getDb_source();
//        dept.toString();
//    }


    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
