package com.example.Lost.Found.Management.System;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemReportCreateRequest {

    private String itemName;
    private String description;
    private String location;
    private String reportType;
}
