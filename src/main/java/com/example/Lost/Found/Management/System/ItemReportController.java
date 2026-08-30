package com.example.Lost.Found.Management.System;

import org.springframework.http.ResponseEntity;
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
            @RequestBody ItemReportCreateRequest request
    ) {

        return itemReportService.addReport(request);
    }

    @GetMapping
    public List<ItemReport> getAllReports() {

        return itemReportService.getAllReports();
    }

    @GetMapping("/{id}")
    public ItemReport getReportById(
            @PathVariable Long id
    ) {

        return itemReportService.getReportById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteReport(
            @PathVariable Long id
    ) {

        boolean deleted =
                itemReportService.deleteReport(id);

        if (deleted) {
            return "Report deleted successfully";
        }

        return "Report not found";
    }
    @PutMapping("/{id}")
    public ResponseEntity<ItemReport> updateReport(
            @PathVariable Long id,
            @RequestBody ItemReportUpdateRequest request
    ) {

        ItemReport updatedReport =
                itemReportService.updateReport(
                        id,
                        request
                );

        if (updatedReport == null) {

            return ResponseEntity
                    .notFound()
                    .build();
        }

        return ResponseEntity.ok(
                updatedReport
        );
    }
}
