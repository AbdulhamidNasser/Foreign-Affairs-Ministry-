package com.codline.ForeignAffairsMinistryAPI.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class BaseEntity {
    Boolean isActive;
    Date createdDate;
    Date updatedDate;
}
