package com.alialsubhi.demoProject1.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String summary;
    private String education;
    private String experience;
    @ManyToOne
    private JobSeeker jobSeeker;
}