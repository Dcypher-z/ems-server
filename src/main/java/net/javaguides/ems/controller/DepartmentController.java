package net.javaguides.ems.controller;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.DepartmentDto;
import net.javaguides.ems.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("api/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    // BUILD ADD DEPARTMENT REST API
    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto)
    {
        DepartmentDto department = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable("id") Long departmentId)
    {
        DepartmentDto departmentDto = departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(departmentDto);
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAllDepartments()
    {
        List<DepartmentDto> departments= departmentService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }

    @PutMapping("{id}")
    public ResponseEntity<DepartmentDto> updateEmployee(@PathVariable("id") Long departmentId, @RequestBody DepartmentDto updatedDepartment)
    {
        DepartmentDto departmentDto = departmentService.updateDepartment(departmentId, updatedDepartment);
        return ResponseEntity.ok(departmentDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteDepartment(departmentId);
        return ResponseEntity.ok("Department Deleted Successfully");
    }
}
