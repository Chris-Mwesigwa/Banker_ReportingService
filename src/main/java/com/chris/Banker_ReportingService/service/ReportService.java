package com.chris.Banker_ReportingService.service;

import com.chris.Banker_ReportingService.model.Report;
import java.util.List;
import java.util.Optional;

public interface ReportService {

    public Report createReport(Report report);
    public Optional<Report> viewReport(long id);
    public List<Report> viewReportsList();
    //public Report updateReportInfo(long id, Report report);
    public String deleteReport(long id);
}
