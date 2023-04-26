package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
