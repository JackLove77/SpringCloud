package net.wfw.net.dao;

import net.wfw.net.enti.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptDao
 * @date 2019/10/17 10:24
 */
@Mapper
@Repository
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
