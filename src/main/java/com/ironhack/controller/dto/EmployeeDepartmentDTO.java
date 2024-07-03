package com.ironhack.controller.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeDepartmentDTO {
    @NotBlank(message = "Department cannot be blank")
    private String department;

}