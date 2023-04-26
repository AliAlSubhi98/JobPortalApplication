package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Interview;
import com.alialsubhi.demoProject1.Repositories.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServices {

    @Autowired
    InterviewRepository interviewRepository;


    public List<Interview> getAllInterviews(){
        return  interviewRepository.findAll();
    }
}
