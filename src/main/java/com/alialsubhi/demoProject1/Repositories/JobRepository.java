package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Application;
import com.alialsubhi.demoProject1.Models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
