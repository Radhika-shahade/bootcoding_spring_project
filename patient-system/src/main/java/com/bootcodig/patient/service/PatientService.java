package com.bootcodig.patient.service;

import com.bootcodig.patient.model.Patient;
import com.bootcodig.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientrepository;

    public void saveDetails(Patient patient)
    {
        patientrepository.save(patient);
    }

    public void savePatient(List<Patient> patient)
    {
        for(Patient data :patient)
        {
            patientrepository.save(data);
        }
    }




}
