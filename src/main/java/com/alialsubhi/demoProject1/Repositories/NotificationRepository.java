package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
