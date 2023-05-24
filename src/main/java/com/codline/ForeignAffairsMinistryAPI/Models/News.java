package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@Data
public class News {

    private Integer id;
    private String title;
    private String description;
    private String country;
    private String region;
    
}
