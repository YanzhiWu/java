package hw.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private int empid, deptid, manager;
    private double salary;
    private String name, job, hiredate;

    public Employee(int empid, String name, String job, int manager, String hiredate, double salary, int deptid) {
        this.empid = empid;
        this.name = name;
        this.job = job;
        this.manager = manager;
        this.hiredate = hiredate;
        this.salary = salary;
        this.deptid = deptid;
    }

    public int getEmpid() {
        return this.empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManager() {
        return this.manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public String getHiredate() {
        return this.hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDeptid() {
        return this.deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
