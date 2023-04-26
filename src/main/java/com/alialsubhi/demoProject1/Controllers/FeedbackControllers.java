package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Employer;
import com.alialsubhi.demoProject1.Models.Feedback;
import com.alialsubhi.demoProject1.Services.EmployerServices;
import com.alialsubhi.demoProject1.Services.FeedbackServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "feedbacks")
public class FeedbackControllers {

    @Autowired
    FeedbackServices feedbackServices;

    @GetMapping(value = "getAll")
    public List<Feedback> getAllFeedbacks(){
        return  feedbackServices.getAllFeedbacks();
    }
}
