package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Setter;

@Setter
public class Policy {



    private Long id;
    private String title;
    private String description;
    private String country;
    private String region;
    private String topic;
}
