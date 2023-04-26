package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Job;
import com.alialsubhi.demoProject1.Models.Notification;
import com.alialsubhi.demoProject1.Repositories.JobRepository;
import com.alialsubhi.demoProject1.Repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServices {

    @Autowired
    NotificationRepository notificationRepository;


    public List<Notification> getAllNotifications(){
        return  notificationRepository.findAll();
    }
}
