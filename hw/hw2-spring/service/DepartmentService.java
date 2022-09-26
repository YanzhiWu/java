package hw.service;

import hw.model.*;
import hw.helper.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentHelper departmentHelper;

    public List<Department> getAllDepartments() {
        return departmentHelper.getAllDepartments();
    }

    public Department getDepartmentById(int id) {
        return departmentHelper.getDepartmentById(id);
    }

    public void updateDepartment(int id, Department department) {
        departmentHelper.updateDepartment(id, department);
    }

    public void createDepartment(Department department) {
        departmentHelper.createDepartment(department);
    }

    public void deleteDepartmentById(int id) {
        departmentHelper.deleteDepartmentById(id);
    }
}
