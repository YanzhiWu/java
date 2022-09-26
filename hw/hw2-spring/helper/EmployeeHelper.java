package hw.helper;

import hw.dao.*;
import hw.repo.*;
import hw.model.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Component
public class EmployeeHelper {
    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeHelper(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.getEmployeeById(id);
    }

    public void updateEmployee(int id, Employee employee) {
        Employee e = employeeRepo.getEmployeeById(id);
        e.setName(employee.getName());
        e.setJob(employee.getJob());
        e.setManager(employee.getManager());
        e.setHiredate(employee.getHiredate());
        e.setSalary(employee.getSalary());
        e.setDeptid(employee.getDeptid());
        employeeRepo.save(e);
    }

    public void createEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public void deleteEmployeeById(int id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
