package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
@Data
public class Policy {



    private Integer id;
    private String title;
    private String description;
    private String country;
    private String region;

}
