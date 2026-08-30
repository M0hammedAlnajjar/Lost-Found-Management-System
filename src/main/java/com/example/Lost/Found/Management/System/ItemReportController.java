package com.example.Lost.Found.Management.System;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class ItemReportController {

    private final ItemReportService itemReportService;

    public ItemReportController(
            ItemReportService itemReportService
    ) {
        this.itemReportService = itemReportService;
    }
}