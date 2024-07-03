package com.ironhack.service.interfaces;

import com.ironhack.model.Employee;
import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    void addNewEmployee(Employee employee);
    void updateEmployeeDepartment(String department, Integer employee_id);
    void updateEmployeeStatus(String status, Integer employee_id);
    void deleteEmployee(Integer id);
}