package com.example.Lost.Found.Management.System;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ItemReport {

    private Long id;
    private String itemName;
    private String description;
    private String location;
    private String reportType;
    private String status;
    private Date createdDate;
    private Boolean isActive;
}