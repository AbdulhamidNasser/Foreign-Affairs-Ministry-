package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Policy {



    private Long id;
    private String title;
    private String description;
    private String country;
    private String region;
    private String topic;
}
