package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Employer;
import com.alialsubhi.demoProject1.Services.EmployerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "employers")
public class EmployerControllers {


    @Autowired
    EmployerServices employerServices;

    @GetMapping(value = "getAll")
    public List<Employer> getAllEmployers(){
        return  employerServices.getAllEmployers();
    }
}
