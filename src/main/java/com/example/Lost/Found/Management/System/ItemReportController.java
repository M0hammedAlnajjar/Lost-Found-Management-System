package com.example.Lost.Found.Management.System;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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
            @RequestBody itemReportCreateRequest request
    ) {

        return itemReportService.addReport(request);
    }

    @GetMapping
    public List<ItemReport> getAllReports() {

        return itemReportService.getAllReports();
    }
}