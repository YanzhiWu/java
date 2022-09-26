package hw.controller;

import hw.model.*;
import hw.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/salaryreport")
public class SalaryReportController {
    private SalaryReportService salaryReportService;

    @GetMapping("/all")
    public List<SalaryReport> getAllSalaryReports() {
        return salaryReportService.getAllSalaryReports();
    }

    @GetMapping("/get/{job}/{department}")
    public SalaryReport getSalaryReportById(@PathVariable String job, @PathVariable String department) {
        return salaryReportService.getSalaryReportById(new SalaryReportId(job, department));
    }

    @PostMapping("/create")
    public void createSalaryReport(@RequestBody SalaryReport salaryReport) {
        salaryReportService.createSalaryReport(salaryReport);
    }

    public SalaryReportService getService() {
        return this.salaryReportService;
    }

    @Autowired
    public void setService(SalaryReportService salaryReportService) {
        this.salaryReportService = salaryReportService;
    }
}
