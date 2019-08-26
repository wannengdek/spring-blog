package dk.coding.blog.mapper;

import dk.coding.blog.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

    public List<Employee> selectByIdAll();
}
