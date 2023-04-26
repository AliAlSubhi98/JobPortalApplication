package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
