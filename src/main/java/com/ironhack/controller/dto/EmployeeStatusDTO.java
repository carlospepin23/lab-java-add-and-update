package com.ironhack.controller.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeStatusDTO {
    @NotBlank(message = "Status cannot be blank")
    private String status;

}