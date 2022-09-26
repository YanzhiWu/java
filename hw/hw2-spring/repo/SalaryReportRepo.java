package hw.repo;

import hw.model.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;

@Repository
public class SalaryReportRepo extends JpaRepository<SalaryReport, SalaryReportId> {
    public List<SalaryReport> getAllSalaryReports() {
    }

    public SalaryReport getSalaryReportById(SalaryReportId id) {
    }
}
