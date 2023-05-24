package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Getter;

@Getter
public class News {

    private Long id;
    private String title;
    private String description;
    private String country;
    private String region;
    private String topic;
}
