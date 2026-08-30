package com.example.Lost.Found.Management.System;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemReportUpdateRequest {

    private String itemName;
    private String description;
    private String location;
    private String reportType;
    private String status;
}
