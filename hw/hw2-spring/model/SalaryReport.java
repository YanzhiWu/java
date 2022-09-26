package hw.model;

import javax.persistence.*;

@Entity
@Table(name = "salary_report")
public class SalaryReport {
    @EmbeddedId
    private SalaryReportId id;
    private int empcount;
    private double salmin, salmax, salavg, saltotal;
    private String updatetime;

    public SalaryReport(SalaryReportId id, double salmin, double salmax, double salavg, double saltotal, int empcount,
            String updateTime) {
        this.id = id;
        this.salmin = salmin;
        this.salmax = salmax;
        this.salavg = salavg;
        this.saltotal = saltotal;
        this.empcount = empcount;
        this.updatetime = updatetime;
    }

    public SalaryReportId getId() {
        return this.id;
    }

    public void setId(SalaryReportId id) {
        this.id = id;
    }

    public double getSalmin() {
        return this.salmin;
    }

    public void setSalmin(double salmin) {
        this.salmin = salmin;
    }

    public double getSalmax() {
        return this.salmax;
    }

    public void setSalmax(double salmax) {
        this.salmax = salmax;
    }

    public double getSalavg() {
        return this.salavg;
    }

    public void setSalavg(double salavg) {
        this.salavg = salavg;
    }

    public double getSaltotal() {
        return this.saltotal;
    }

    public void setSaltotal(double saltotal) {
        this.saltotal = saltotal;
    }

    public int getEmpcount() {
        return this.empcount;
    }

    public void setEmpcount(int empcount) {
        this.empcount = empcount;
    }

    public String getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
