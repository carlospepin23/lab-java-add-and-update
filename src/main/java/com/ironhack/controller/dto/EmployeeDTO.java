package com.ironhack.controller.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    @NotNull(message = "Employee ID cannot be null")
    private Integer employee_id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Department cannot be blank")
    private String department;
    @NotBlank(message = "Status cannot be blank")
    private String status;

}
