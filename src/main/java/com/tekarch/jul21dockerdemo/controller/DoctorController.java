package com.tekarch.jul21dockerdemo.controller;

import com.tekarch.jul21dockerdemo.entity.Doctor;
import com.tekarch.jul21dockerdemo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping(value="/doctor")
    private List<Doctor> getDoctor(){
        return doctorRepository.findAll();
    }
}
