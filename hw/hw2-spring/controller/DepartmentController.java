package hw.controller;

import hw.model.*;
import hw.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private DepartmentService departmentService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/get/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }

    @PutMapping("/update/{id}")
    public void updateDepartment(@PathVariable int id, @RequestBody Department department) {
        departmentService.updateDepartment(id, department);
    }

    @PostMapping("/create")
    public void createDepartment(@RequestBody Department department) {
        departmentService.createDepartment(department);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartmentById(@PathVariable int id) {
        departmentService.deleteDepartmentById(id);
    }

    public DepartmentService getService() {
        return this.departmentService;
    }

    @Autowired
    public void setService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
}
