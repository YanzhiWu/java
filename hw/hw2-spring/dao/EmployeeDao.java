package hw.dao;

import hw.model.*;
import org.springframework.stereotype.*;
import java.util.*;

@Repository
public class EmployeeDao {
    private List<Employee> employees;

    public List<Employee> getAllEmployees() {
        return this.employees;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream().filter(e -> id == e.getEmpid()).findFirst().orElse(null);
    }

    public void updateEmployee(int id, Employee employee) {
        Employee e = this.getEmployeeById(id);
        e.setName(employee.getName());
        e.setJob(employee.getJob());
        e.setManager(employee.getManager());
        e.setHiredate(employee.getHiredate());
        e.setSalary(employee.getSalary());
        e.setDeptid(employee.getDeptid());
    }

    public void createEmployee(Employee employee) {
        int size = employees.stream().mapToInt(e -> e.getEmpid()).max().getAsInt();
        employee.setEmpid(size + 1);
        employees.add(employee);
    }

    public void deleteEmployeeById(int id) {
        Iterator<Employee> iter = employees.iterator();
        while (iter.hasNext()) {
            Employee e = iter.next();
            if (id == e.getEmpid()) {
                iter.remove();
            }
        }
    }
}
