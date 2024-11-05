package net.vff.employeeservice.service;

import net.vff.employeeservice.dto.APIResponseDto;
import net.vff.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
