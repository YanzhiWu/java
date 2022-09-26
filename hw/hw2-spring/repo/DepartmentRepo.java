package hw.repo;

import hw.model.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;

@Repository
public class DepartmentRepo extends JpaRepository<Department, Integer> {
    public List<Department> getAllDepartments() {
    }

    public Department getDepartmentById(int id) {
    }

    public void deleteDepartmentById(int id) {
    }
}
