package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
