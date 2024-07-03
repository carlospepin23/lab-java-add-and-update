package com.ironhack.controller.impl;
import com.ironhack.controller.dto.PatientDTO;
import com.ironhack.controller.interfaces.IPatientController;
import com.ironhack.model.Patient;
import com.ironhack.service.impl.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PatientController implements IPatientController {

    @Autowired
    PatientService patientService;

    //  ****************************************************  GET  ****************************************************

    @GetMapping("/patients")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable Integer id){
        return patientService.getPatientById(id);
    }

    //  ***************************************************  POST  ****************************************************

    @PostMapping("/patients")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewPatient(@RequestBody @Valid PatientDTO patientDTO) {
        patientService.addNewPatient(new Patient(patientDTO.getName(), patientDTO.getDateOfBirth(), patientDTO.getAdmittedBy()));
    }


    //  ****************************************************  PUT  ****************************************************

    @PutMapping("/patients/{patient_id}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePatientInformation(@PathVariable Integer patient_id, @RequestBody @Valid PatientDTO patientDTO) {
        patientService.updatePatientInformation(patient_id, patientDTO);
    }


    //  ***************************************************  PATCH  ***************************************************


    //  **************************************************  DELETE  ***************************************************

    @DeleteMapping("/patients/{patient_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePatient(@PathVariable Integer patient_id) {
        patientService.deletePatient(patient_id);
    }

}
