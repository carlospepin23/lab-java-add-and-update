package com.ironhack.service.impl;

import com.ironhack.controller.dto.PatientDTO;
import com.ironhack.model.Patient;
import com.ironhack.repository.PatientRepository;
import com.ironhack.service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements IPatientService {
    @Autowired
    PatientRepository patientRepository;


    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Integer id) {
        Optional<Patient> patientOptional = patientRepository.findById(id);
        return patientOptional.orElse(null);
    }

    @Override
    public void addNewPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void updatePatientInformation(Integer patient_id, PatientDTO patientDTO) {
        Optional<Patient> patientOptional = patientRepository.findById(patient_id);
        if (patientOptional.isEmpty()) return;
        Patient patient = patientOptional.get();
        patient.setName(patientDTO.getName());
        patient.setDateOfBirth(patientDTO.getDateOfBirth());
        patient.setAdmittedBy(patientDTO.getAdmittedBy());
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Integer patient_id) {
        Optional<Patient> patientOptional = patientRepository.findById(patient_id);
        if (patientOptional.isEmpty()) return;
        patientRepository.delete(patientOptional.get());
    }
}
