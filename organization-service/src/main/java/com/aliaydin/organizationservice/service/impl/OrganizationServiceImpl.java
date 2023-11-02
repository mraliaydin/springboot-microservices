package com.aliaydin.organizationservice.service.impl;

import com.aliaydin.organizationservice.dto.OrganizationDto;
import com.aliaydin.organizationservice.entity.Organization;
import com.aliaydin.organizationservice.mapper.OrganizationMapper;
import com.aliaydin.organizationservice.repository.OrganizationRepository;
import com.aliaydin.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto to jpa entity.
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        OrganizationDto savedOrganizationDto = OrganizationMapper.mapToOrganizationDto(savedOrganization);

        return savedOrganizationDto;
    }

    @Override
    public OrganizationDto findByOrganizationCode(String organizationCode) {

        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);

        OrganizationDto organizationDto = OrganizationMapper.mapToOrganizationDto(organization);

        return organizationDto;
    }
}
