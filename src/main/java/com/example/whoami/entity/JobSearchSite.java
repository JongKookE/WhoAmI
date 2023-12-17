package com.example.whoami.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class JobSearchSite {
    @Column(name="job_search_site_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int jobSearchSiteId;
}