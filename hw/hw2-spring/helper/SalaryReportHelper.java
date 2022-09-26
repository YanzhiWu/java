package hw.helper;

import hw.dao.*;
import hw.repo.*;
import hw.model.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Component
public class SalaryReportHelper {
    private SalaryReportRepo salaryReportRepo;

    @Autowired
    public SalaryReportHelper(SalaryReportRepo salaryReportRepo) {
        this.salaryReportRepo = salaryReportRepo;
    }

    public List<SalaryReport> getAllSalaryReports() {
        return salaryReportRepo.getAllSalaryReports();
    }

    public SalaryReport getSalaryReportById(SalaryReportId id) {
        return salaryReportRepo.getSalaryReportById(id);
    }

    public void createSalaryReport(SalaryReport salaryReport) {
        salaryReportRepo.save(salaryReport);
    }
}
