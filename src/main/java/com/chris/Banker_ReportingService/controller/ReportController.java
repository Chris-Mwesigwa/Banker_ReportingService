package com.chris.Banker_ReportingService.controller;

import com.chris.Banker_ReportingService.model.Report;
import com.chris.Banker_ReportingService.service.serviceImpl.ReportServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class ReportController {

    private final ReportServiceImpl reportService;

    public ReportController(ReportServiceImpl reportService) {
        this.reportService = reportService;
    }

    @PostMapping
    public ResponseEntity<Report> createReport(@RequestBody Report report){
        return ResponseEntity.ok(reportService.createReport(report));
    }

    @GetMapping("/{id}")
    public ResponseEntity viewReport(@PathVariable long id){
        return ResponseEntity.ok(reportService.viewReport(id));
    }

    @GetMapping
    public ResponseEntity viewReportsList(){
        return ResponseEntity.ok(reportService.viewReportsList());
    }

    //public ResponseEntity updateReportInfo(long id, Report report){

    @DeleteMapping
    public ResponseEntity deleteReport(@RequestParam long id){
        return ResponseEntity.ok(reportService.deleteReport(id));
    }
}
