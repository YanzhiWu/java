package hw.service;

import hw.model.*;
import hw.helper.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeHelper employeeHelper;

    public List<Employee> getAllEmployees() {
        return employeeHelper.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeHelper.getEmployeeById(id);
    }

    public void updateEmployee(int id, Employee employee) {
        employeeHelper.updateEmployee(id, employee);
    }

    public void createEmployee(Employee employee) {
        employeeHelper.createEmployee(employee);
    }

    public void deleteEmployeeById(int id) {
        employeeHelper.deleteEmployeeById(id);
    }
}
