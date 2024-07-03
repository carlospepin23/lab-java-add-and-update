package com.ironhack.service.interfaces;

import com.ironhack.controller.dto.PatientDTO;
import com.ironhack.model.Patient;

import java.util.List;

public interface IPatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(Integer id);
    void addNewPatient(Patient patient);
    void updatePatientInformation(Integer patient_id, PatientDTO patientDTO);
    void deletePatient(Integer patient_id);
}
