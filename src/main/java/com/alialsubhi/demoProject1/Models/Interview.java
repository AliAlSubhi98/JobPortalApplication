package com.alialsubhi.demoProject1.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Job job;
    @ManyToOne
    private JobSeeker jobSeeker;
    private LocalDate interviewDate;
    private String location;
    private String interviewerName;
}