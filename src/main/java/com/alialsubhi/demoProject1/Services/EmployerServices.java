package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Application;
import com.alialsubhi.demoProject1.Models.Employer;
import com.alialsubhi.demoProject1.Repositories.ApplicationRepository;
import com.alialsubhi.demoProject1.Repositories.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerServices {

    @Autowired
    EmployerRepository employerRepository;


    public List<Employer> getAllEmployers(){
        return  employerRepository.findAll();
    }
}
