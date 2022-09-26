package hw.repo;

import hw.model.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;

@Repository
public class EmployeeRepo extends JpaRepository<Employee, Integer> {
    public List<Employee> getAllEmployees() {
    }

    public Employee getEmployeeById(int id) {
    }

    public void deleteEmployeeById(int id) {
    }
}
