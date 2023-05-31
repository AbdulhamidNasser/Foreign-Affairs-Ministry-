package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class News extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)




    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private String description;


    public News(String title, String country, String region, String details) {
        this.title = title;
        this.country = country;
        this.region = region;
        this.description = description;
    }


    public News() {

    }
}
