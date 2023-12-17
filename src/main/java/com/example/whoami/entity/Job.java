package com.example.whoami.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Job {
    @Column(name="job_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int jobId;

}
