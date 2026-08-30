package com.example.Lost.Found.Management.System;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ItemReportService {

    private final List<ItemReport> reports =
            new ArrayList<>();

    private Long nextId = 1L;

    public ItemReport addReport(
            ItemReportCreateRequest request
    ) {

        ItemReport report =
                new ItemReport();

        report.setId(nextId);
        nextId++;

        report.setItemName(
                request.getItemName()
        );

        report.setDescription(
                request.getDescription()
        );

        report.setLocation(
                request.getLocation()
        );

        report.setReportType(
                request.getReportType()
        );

        report.setStatus("OPEN");
        report.setCreatedDate(new Date());
        report.setIsActive(Boolean.TRUE);

        reports.add(report);

        return report;
    }

    public List<ItemReport> getAllReports() {

        return reports;
    }

    public ItemReport getReportById(Long id) {

        for (ItemReport report : reports) {

            if (report.getId().equals(id)) {
                return report;
            }
        }

        return null;
    }

    public boolean deleteReport(Long id) {

        ItemReport report =
                getReportById(id);

        if (report == null) {
            return false;
        }

        reports.remove(report);

        return true;
    }
    public ItemReport updateReport(
            Long id,
            ItemReportUpdateRequest request
    ) {

        ItemReport report =
                getReportById(id);

        if (report == null || request == null) {
            return null;
        }

        if (request.getItemName() != null
                && !request.getItemName().isBlank()) {

            report.setItemName(
                    request.getItemName()
            );
        }

        if (request.getDescription() != null
                && !request.getDescription().isBlank()) {

            report.setDescription(
                    request.getDescription()
            );
        }

        if (request.getLocation() != null
                && !request.getLocation().isBlank()) {

            report.setLocation(
                    request.getLocation()
            );
        }

        if (request.getReportType() != null
                && !request.getReportType().isBlank()) {

            report.setReportType(
                    request.getReportType()
            );
        }

        if (request.getStatus() != null
                && !request.getStatus().isBlank()) {

            report.setStatus(
                    request.getStatus()
            );
        }

        return report;
    }
}