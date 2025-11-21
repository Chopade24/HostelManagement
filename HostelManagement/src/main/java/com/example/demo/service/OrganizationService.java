package com.example.demo.service;

import com.example.demo.dto.OrganizationDto;
import com.example.demo.entity.Organization;

public interface OrganizationService {

       void saveOrganization(OrganizationDto organizationDto);
       Organization getOrganization(int id);
}
