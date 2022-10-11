package com.chris.Banker_ReportingService.repository;

import com.chris.Banker_ReportingService.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
