package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
}
