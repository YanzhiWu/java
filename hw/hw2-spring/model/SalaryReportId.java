package hw.model;

import javax.persistence.*;

@Embeddable
public class SalaryReportId {
    private String job, department;

    public SalaryReportId(String job, String department) {
        this.job = job;
        this.department = department;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
