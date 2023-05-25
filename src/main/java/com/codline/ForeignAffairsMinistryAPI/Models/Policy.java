package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
@Data
public class Policy extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private Integer id;
    private String topic;
    private String details;
    private String country;
    private String region;



}
