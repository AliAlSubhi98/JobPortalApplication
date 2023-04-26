package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Application;
import com.alialsubhi.demoProject1.Repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    ApplicationRepository applicationRepository;


    public List<Application> getAllApplications(){
        return  applicationRepository.findAll();
    }
}
