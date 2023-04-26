package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Job;
import com.alialsubhi.demoProject1.Repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServices {
    @Autowired
    JobRepository jobRepository;


    public List<Job> getAllJobs(){
        return  jobRepository.findAll();
    }
}
