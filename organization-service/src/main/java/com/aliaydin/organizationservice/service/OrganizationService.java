package com.aliaydin.organizationservice.service;

import com.aliaydin.organizationservice.dto.OrganizationDto;

public interface OrganizationService {

    OrganizationDto saveOrganization(OrganizationDto organizationDto);

    OrganizationDto findByOrganizationCode(String organizationCode);
}
