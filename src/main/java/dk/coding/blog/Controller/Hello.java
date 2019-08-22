package dk.coding.blog.Controller;

import dk.coding.blog.bean.Employee;
import dk.coding.blog.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : dk
 * @date : 2019/7/22 00:42
 * @description :  测试新建项目是否正常
 */
@Controller
public class Hello {
    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping("/testdb")
    public String user(Model model)
    {
        Employee employee = employeeMapper.getEmpById(1);
        System.out.println(employee.toString());
        model.addAttribute("employee",employee);
        List<Employee> employees = employeeMapper.selectByIdAll();
        model.addAttribute("employees",employees);
        return "testdb";
    }
}
