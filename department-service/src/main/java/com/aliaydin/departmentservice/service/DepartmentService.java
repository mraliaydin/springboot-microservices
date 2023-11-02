package com.aliaydin.departmentservice.service;

import com.aliaydin.departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartment(String departmentCode);
}
