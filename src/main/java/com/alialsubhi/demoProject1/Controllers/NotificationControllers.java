package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Notification;
import com.alialsubhi.demoProject1.Services.NotificationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "notifications")
public class NotificationControllers {

    @Autowired
    NotificationServices notificationServices;
    @GetMapping(value = "getAll")
    public List<Notification> getAllNotifications(){
        return  notificationServices.getAllNotifications();
    }
}
