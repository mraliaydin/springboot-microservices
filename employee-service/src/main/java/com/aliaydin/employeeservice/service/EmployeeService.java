package com.aliaydin.employeeservice.service;

import com.aliaydin.employeeservice.dto.APIResponseDto;
import com.aliaydin.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
