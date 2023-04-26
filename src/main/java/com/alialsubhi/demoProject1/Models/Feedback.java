package com.alialsubhi.demoProject1.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String type;
    @ManyToOne
    private Job job;
    @ManyToOne
    private JobSeeker jobSeeker;
}