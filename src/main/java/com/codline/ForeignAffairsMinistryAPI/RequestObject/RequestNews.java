package com.codline.ForeignAffairsMinistryAPI.RequestObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestNews {

    String country;
    String region;
    String title;
    String description;
}
