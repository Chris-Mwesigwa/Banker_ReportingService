package com.chris.Banker_ReportingService.service.serviceImpl;

import com.chris.Banker_ReportingService.model.Report;
import com.chris.Banker_ReportingService.repository.ReportRepository;
import com.chris.Banker_ReportingService.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;

    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public Report createReport(Report report) {
        report.setGenerationDate(new Date());
        return reportRepository.save(report);
    }

    @Override
    public Optional viewReport(long id) {
        return Optional.of(reportRepository.findById(id));
    }

    @Override
    public List<Report> viewReportsList() {
        return reportRepository.findAll();
    }

    @Override
    public String deleteReport(long id) {
        reportRepository.deleteById(id);
        return "Report " +id +" deleted successfully";
    }
}
