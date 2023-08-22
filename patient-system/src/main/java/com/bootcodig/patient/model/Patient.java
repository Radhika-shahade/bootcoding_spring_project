package com.bootcodig.patient.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "patient_name")
    private String name;

    @Column(name = "disease")
    private String disease;

    @Column(name="admit_date")
    private Date admitDate;

    @Column(name="discharge_date")
    private Date dischargeDate;

}
