package com.ironhack.controller.dto;

import com.ironhack.model.Employee;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatientDTO {
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotNull(message = "Date of birth cannot be null")
    private LocalDate dateOfBirth;
    @NotNull(message = "Admitted by cannot be null")
    private Employee admittedBy;
}
