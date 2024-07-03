package com.ironhack.controller.interfaces;

import com.ironhack.controller.dto.PatientDTO;
import com.ironhack.model.Patient;

import java.time.LocalDate;
import java.util.List;

public interface IPatientController {
    List<Patient> getAllPatients();
    Patient getPatientById(Integer id);
    void addNewPatient(PatientDTO patientDTO);
    void updatePatientInformation(Integer patient_id, PatientDTO patientDTO);
    void deletePatient(Integer patient_id);

}
