package hw.service;

import hw.model.*;
import hw.helper.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class SalaryReportService {
    @Autowired
    private SalaryReportHelper salaryReportHelper;

    public List<SalaryReport> getAllSalaryReports() {
        return salaryReportHelper.getAllSalaryReports();
    }

    public SalaryReport getSalaryReportById(SalaryReportId id) {
        return salaryReportHelper.getSalaryReportById(id);
    }

    public void createSalaryReport(SalaryReport salaryReport) {
        salaryReportHelper.createSalaryReport(salaryReport);
    }
}
