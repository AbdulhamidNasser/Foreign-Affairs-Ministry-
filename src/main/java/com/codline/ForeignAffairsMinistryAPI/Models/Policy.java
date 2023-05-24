package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
public class Policy {



    private Long id;
    private String title;
    private String description;
    private String country;
    private String region;
    private String topic;
}
