package net.javaguides.ems.mapper;
import net.javaguides.ems.dto.DepartmentDto;
import net.javaguides.ems.entity.Department;

public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department department)
    //USED WHEN SENDING DATA TO MYSQL
    {
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }

    //USED WHEN RECEIVING DATA FROM MYSQL
    public static Department mapToDepartment(DepartmentDto departmentDto)
    {
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
