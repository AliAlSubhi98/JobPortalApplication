package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Notification;
import com.alialsubhi.demoProject1.Models.Resume;
import com.alialsubhi.demoProject1.Services.NotificationServices;
import com.alialsubhi.demoProject1.Services.ResumeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "resumes")
public class ResumeControllers {

    @Autowired
    ResumeServices resumeServices;
    @GetMapping(value = "getAll")
    public List<Resume> getAllResumes(){
        return  resumeServices.getAllResumes();
    }
}
