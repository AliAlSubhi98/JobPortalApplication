package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Job;
import com.alialsubhi.demoProject1.Services.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "jobs")
public class JobControllers {

    @Autowired
    JobServices jobServices;
    @GetMapping(value = "getAll")
    public List<Job> getAllJobs(){
        return  jobServices.getAllJobs();
    }
}
