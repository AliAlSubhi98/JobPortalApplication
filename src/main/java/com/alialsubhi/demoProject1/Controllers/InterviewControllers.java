package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Interview;
import com.alialsubhi.demoProject1.Services.FeedbackServices;
import com.alialsubhi.demoProject1.Services.InterviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "interviews")
public class InterviewControllers {

    @Autowired
    InterviewServices interviewServices;
    @GetMapping(value = "getAll")
    public List<Interview> getAllInterviews(){
        return  interviewServices.getAllInterviews();
    }

}
