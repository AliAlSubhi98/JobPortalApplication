package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {
}
