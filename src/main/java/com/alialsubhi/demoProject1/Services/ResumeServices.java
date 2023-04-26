package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Notification;
import com.alialsubhi.demoProject1.Models.Resume;
import com.alialsubhi.demoProject1.Repositories.NotificationRepository;
import com.alialsubhi.demoProject1.Repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServices {

    @Autowired
    ResumeRepository resumeRepository;


    public List<Resume> getAllResumes(){
        return  resumeRepository.findAll();
    }

}
