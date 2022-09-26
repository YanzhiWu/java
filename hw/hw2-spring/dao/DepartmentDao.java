package hw.dao;

import hw.model.*;
import org.springframework.stereotype.*;
import java.util.*;

@Repository
public class DepartmentDao {
    private List<Department> departments;

    public List<Department> getAllDepartments() {
        return this.departments;
    }

    public Department getDepartmentById(int id) {
        return departments.stream().filter(e -> id == e.getDeptid()).findFirst().orElse(null);
    }

    public void updateDepartment(int id, Department department) {
        Department d = this.getDepartmentById(id);
        d.setName(department.getName());
        d.setLoc(department.getLoc());
    }

    public void createDepartment(Department department) {
        int size = departments.stream().mapToInt(e -> e.getDeptid()).max().getAsInt();
        department.setDeptid(size + 1);
        departments.add(department);
    }

    public void deleteDepartmentById(int id) {
        Iterator<Department> iter = departments.iterator();
        while (iter.hasNext()) {
            Department d = iter.next();
            if (id == d.getDeptid()) {
                iter.remove();
            }
        }
    }
}
