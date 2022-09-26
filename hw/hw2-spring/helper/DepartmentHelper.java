package hw.helper;

import hw.dao.*;
import hw.repo.*;
import hw.model.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Component
public class DepartmentHelper {
    private DepartmentRepo departmentRepo;

    @Autowired
    public DepartmentHelper(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public List<Department> getAllDepartments() {
        return departmentRepo.getAllDepartments();
    }

    public Department getDepartmentById(int id) {
        return departmentRepo.getDepartmentById(id);
    }

    public void updateDepartment(int id, Department department) {
        Department d = departmentRepo.getDepartmentById(id);
        d.setName(department.getName());
        d.setLoc(department.getLoc());
        departmentRepo.save(d);
    }

    public void createDepartment(Department department) {
        departmentRepo.save(department);
    }

    public void deleteDepartmentById(int id) {
        departmentRepo.deleteDepartmentById(id);
    }
}
