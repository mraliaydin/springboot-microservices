package com.aliaydin.organizationservice.controller;

import com.aliaydin.organizationservice.dto.OrganizationDto;
import com.aliaydin.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/organizations")
public class OrganizationController {

    private OrganizationService organizationService;

    // Build save organization REST API
    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganization = organizationService.saveOrganization(organizationDto);

        return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
    }

    // Build Get Organization by Code REST API
    @GetMapping("{organizationCode}")
    public ResponseEntity<OrganizationDto> findByOrganizationCode(@PathVariable String organizationCode){
        OrganizationDto organizationDto = organizationService.findByOrganizationCode(organizationCode);

        return ResponseEntity.ok(organizationDto);
    }
}
