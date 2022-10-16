package com.chris.Banker_ReportingService.service.serviceImpl;

import com.chris.Banker_ReportingService.model.Report;
import com.chris.Banker_ReportingService.repository.ReportRepository;
import com.chris.Banker_ReportingService.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;

    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public Report createReport(Report report) {
        report.setGenerationDate(new Date());
        log.info("created report " +report);
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
