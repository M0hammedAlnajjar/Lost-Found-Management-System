package com.example.Lost.Found.Management.System;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping
    public ItemReport addReport(
            @RequestBody ItemReportCreateRequest request
    ) {

        return itemReportService.addReport(request);
    }
}