package net.wfw.net.mapper;

import net.wfw.net.enti.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptMapper
 * @date 2019/10/28 15:46
 */
@Mapper
@Repository
public interface DeptMapper {

     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}