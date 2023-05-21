package com.codline.ForeignAffairsMinistryAPI.Service;

import lombok.Data;

@Data
public class Policy {

    private Long id;
    private String title;
    private String description;
    private String country;
    private String region;
    private String topic;


}



