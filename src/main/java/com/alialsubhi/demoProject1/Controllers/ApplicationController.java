package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Application;
import com.alialsubhi.demoProject1.Services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "applications")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping(value = "getAll")
    public List<Application> getAllApplications(){
        return  applicationService.getAllApplications();
    }
}
