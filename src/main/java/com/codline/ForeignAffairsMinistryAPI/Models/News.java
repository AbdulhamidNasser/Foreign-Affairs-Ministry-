package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class News {

    private Long id;
    private String title;
    private String description;
    private String country;
    private String region;
    private String topic;
}
