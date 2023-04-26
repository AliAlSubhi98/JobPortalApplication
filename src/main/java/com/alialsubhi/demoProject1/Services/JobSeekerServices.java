package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Interview;
import com.alialsubhi.demoProject1.Models.JobSeeker;
import com.alialsubhi.demoProject1.Repositories.InterviewRepository;
import com.alialsubhi.demoProject1.Repositories.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerServices {

    @Autowired
    JobSeekerRepository jobSeekerRepository;


    public List<JobSeeker> getAllJobSeekers(){
        return  jobSeekerRepository.findAll();
    }
}
