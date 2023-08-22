package com.bootcodig.patient.controller;

import com.bootcodig.patient.model.Patient;
import com.bootcodig.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class Controller {
    @Autowired
    private PatientService patientService;
    @PostMapping("/patientDetails")
    public String patientDetail(@RequestBody Patient patient)
    {
        patientService.saveDetails(patient);
        return "true";
    }
    @PostMapping ("/multipleDetails")
    public String patientDetail(@RequestBody List<Patient>patient)
    {
            patientService.savePatient(patient);
            return "true";

    }


}
