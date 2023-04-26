package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
