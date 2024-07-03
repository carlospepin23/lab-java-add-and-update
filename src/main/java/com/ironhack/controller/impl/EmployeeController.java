package com.ironhack.controller.impl;

import com.ironhack.controller.dto.EmployeeDTO;
import com.ironhack.controller.dto.EmployeeDepartmentDTO;
import com.ironhack.controller.dto.EmployeeStatusDTO;
import com.ironhack.controller.interfaces.IEmployeeController;
import com.ironhack.model.Employee;
import com.ironhack.service.interfaces.IEmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController implements IEmployeeController {
    @Autowired
    IEmployeeService employeeService;

    //  ****************************************************  GET  ****************************************************

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }


    //  ***************************************************  POST  ****************************************************

    @PostMapping("/employees")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewEmployee(@RequestBody @Valid EmployeeDTO employeeDTO) {
        employeeService.addNewEmployee(new Employee(employeeDTO.getEmployee_id(),employeeDTO.getDepartment(), employeeDTO.getName(), employeeDTO.getStatus()));
    }


    //  ****************************************************  PUT  ****************************************************


    //  ***************************************************  PATCH  ***************************************************

    @PatchMapping("/employees/{employee_id}/status")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployeeStatus(@RequestBody @Valid EmployeeStatusDTO employeeStatusDTO, @PathVariable Integer employee_id) {
        employeeService.updateEmployeeStatus(employeeStatusDTO.getStatus(), employee_id);
    }

    @PatchMapping("/employees/{employee_id}/department")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployeeDepartment(@RequestBody @Valid EmployeeDepartmentDTO employeeDepartmentDTO, @PathVariable Integer employee_id) {
        employeeService.updateEmployeeDepartment(employeeDepartmentDTO.getDepartment(), employee_id);
    }


    //  **************************************************  DELETE  ***************************************************

    @DeleteMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable Integer employee_id) {
        employeeService.deleteEmployee(employee_id);
    }

}
