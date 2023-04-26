package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Employer;
import com.alialsubhi.demoProject1.Models.Feedback;
import com.alialsubhi.demoProject1.Repositories.EmployerRepository;
import com.alialsubhi.demoProject1.Repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServices {

    @Autowired
    FeedbackRepository feedbackRepository;


    public List<Feedback> getAllFeedbacks(){
        return  feedbackRepository.findAll();
    }

}

