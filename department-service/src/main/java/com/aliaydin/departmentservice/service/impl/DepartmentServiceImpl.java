package com.aliaydin.departmentservice.service.impl;

import com.aliaydin.departmentservice.dto.DepartmentDto;
import com.aliaydin.departmentservice.entity.Department;
import com.aliaydin.departmentservice.mapper.DepartmentMapper;
import com.aliaydin.departmentservice.repository.DepartmentRepository;
import com.aliaydin.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    // You can also use Lombok for dependency injection.
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        // convert department dto to department jpa entity
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }


    @Override
    public DepartmentDto getDepartment(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);

        return departmentDto;
    }
}
