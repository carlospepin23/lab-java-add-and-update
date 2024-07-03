package com.ironhack.controller.interfaces;

import com.ironhack.controller.dto.EmployeeDTO;
import com.ironhack.controller.dto.EmployeeDepartmentDTO;
import com.ironhack.controller.dto.EmployeeStatusDTO;
import com.ironhack.model.Employee;
import java.util.List;

public interface IEmployeeController {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    void addNewEmployee(EmployeeDTO employeeDTO);
    void updateEmployeeDepartment(EmployeeDepartmentDTO department, Integer employee_id);
    void updateEmployeeStatus(EmployeeStatusDTO status, Integer employee_id);
    void deleteEmployee(Integer employee_id);
}
