package net.javaguides.ems.mapper;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee)
    //USED WHEN SENDING DATA TO MYSQL
    {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

        //USED WHEN RECEIVING DATA FROM MYSQL
    public static Employee mapToEmployee(EmployeeDto employeeDto)
    {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
